package at.ymeri.DemoSymflower.controller;

import at.ymeri.DemoSymflower.controller.dto.StockItemDto;
import at.ymeri.DemoSymflower.controller.mapper.StockItemMapper;
import at.ymeri.DemoSymflower.model.Address;
import at.ymeri.DemoSymflower.model.StockItem;
import at.ymeri.DemoSymflower.services.StockService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class StockItemController {

    private final StockService stockService;

    public StockItemController(StockService stockService) {
        this.stockService = stockService;
    }

    @GetMapping("/stockItems")
    public ResponseEntity<List<StockItemDto>> getAvailableStockItems(String bookId) {
        List<StockItem> items = stockService.findAllStockItemsByBookId(bookId);
        List<StockItemDto> itemsDto = items.stream().map(StockItemMapper.INSTANCE::stockItemToStockItemDto).toList();
        return ResponseEntity.of(Optional.of(itemsDto));
    }

    @PostMapping("/stockItem")
    public ResponseEntity<String> addStockItem(String bookId, Address address) {
        stockService.addStockItem(bookId, address);
        return ResponseEntity.status(200).body("OK");


    }
}

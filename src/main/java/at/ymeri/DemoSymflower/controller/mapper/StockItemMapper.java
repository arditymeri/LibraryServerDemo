package at.ymeri.DemoSymflower.controller.mapper;

import at.ymeri.DemoSymflower.controller.dto.StockItemDto;
import at.ymeri.DemoSymflower.model.StockItem;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StockItemMapper {

    StockItemMapper INSTANCE = Mappers.getMapper(StockItemMapper.class);

    StockItemDto stockItemToStockItemDto(StockItem stockItem);
}

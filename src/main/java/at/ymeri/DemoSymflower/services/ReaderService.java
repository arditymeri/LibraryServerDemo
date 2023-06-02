package at.ymeri.DemoSymflower.services;

import at.ymeri.DemoSymflower.model.Reader;
import at.ymeri.DemoSymflower.repo.ReaderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReaderService {

    private ReaderRepository readerRepository;

    public ReaderService(ReaderRepository readerRepository) {
        this.readerRepository = readerRepository;
    }

    public void registerReader(Reader reader) {
        readerRepository.save(reader);
    }

    public List<Reader> findByName(String name) {
        return readerRepository.findByName(name);
    }
}

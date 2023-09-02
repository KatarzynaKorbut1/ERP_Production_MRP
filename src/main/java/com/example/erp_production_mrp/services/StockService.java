package com.example.erp_production_mrp.services;

import com.example.erp_production_mrp.model.Stock;
import com.example.erp_production_mrp.repositories.ItemRepository;
import com.example.erp_production_mrp.repositories.StockRepository;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class StockService {
    StockRepository stockRepository;
    private final ItemRepository itemRepository;

    public StockService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public void createStock(Stock stock){
        stockRepository.save(stock);
}
public void addItemToStock(@Min(1) @NonNull Long stockId, @Valid Stock stockToUpdate) {

        Set<Stock> stocks = ;
}
}

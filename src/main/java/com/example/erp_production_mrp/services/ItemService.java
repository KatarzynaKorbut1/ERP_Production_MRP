package com.example.erp_production_mrp.services;

import com.example.erp_production_mrp.model.Item;
import com.example.erp_production_mrp.repositories.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    private final ItemRepository itemRepository;


    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;

    }

    public Optional<Item> getItemById(Long id) {
        return Optional.of(itemRepository.findById(id).orElse(null));
    }
    public Optional<Item> createItem(Item item) {
        return Optional.of(itemRepository.save(item));
    }

    public List<Item> getAll() {
        return itemRepository.findAll();
    }
    public Item getItem (Long id) {
        return itemRepository.findById(id).get();
    }
    public void saveItem(Item item) {
        itemRepository.save(item);
    }



}

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
        System.out.println("Jestem createItem w serwisie");
        return Optional.of(itemRepository.save(item));
    }

    public List<Item> getAll() {
        return itemRepository.findAll();
    }
    public Item getItem (Long id) {
        return itemRepository.findById(id).orElse(null);
    }


    public void saveItem(Item itemToSet) {
        itemRepository.save(itemToSet);
    }
}

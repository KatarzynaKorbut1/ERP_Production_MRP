package com.example.erp_production_mrp.services;

import com.example.erp_production_mrp.model.Component;
import com.example.erp_production_mrp.repositories.ComponentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComponentService {

    private final ComponentRepository componentRepository;


    public ComponentService(ComponentRepository componentRepository) {
        this.componentRepository = componentRepository;
    }


    public Optional<Component> getItemById(Long id) {
        return Optional.of(componentRepository.findById(id).orElse(null));
    }
    public Optional<Component> createComponent(Component component) {
        return Optional.of(componentRepository.save(component));
    }

    public List<Component> getAll() {
        return componentRepository.findAll();
    }
    public Component getComponent (Long id) {
        return componentRepository.findById(id).orElse(null);
    }

}


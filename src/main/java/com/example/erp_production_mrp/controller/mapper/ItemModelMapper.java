package com.example.erp_production_mrp.controller.mapper;

import com.example.erp_production_mrp.controller.dto.ItemDTO;
import com.example.erp_production_mrp.model.Item;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;


@Mapper(componentModel = "spring")
@Component
public interface ItemModelMapper {


    ItemModelMapper INSTANCE = Mappers.getMapper(ItemModelMapper.class);
    @Mapping(source = "item.id", target = "itemId")
    Item mapToItem(ItemDTO itemDTO);

    List<Item> mapToItemList (List<Item> items);

    @InheritConfiguration
    @Mapping(ignore = true, target = "structure")
    Item mapToItemWithoutStructure(ItemDTO itemDTO);

    @InheritInverseConfiguration(name = "mapToItem")
    ItemDTO maptoItemDTO(Item item);

    @InheritInverseConfiguration(name = "mapToItemList")
    List<ItemDTO> mapToItemDTOList (List<Item> itemsDTO);


    @InheritInverseConfiguration(name = "mapToItemWithoutStructure")
    @Mapping(ignore = true, target = "structure")
    ItemDTO mapToItemDTOWithoutStructure(Item item);


}


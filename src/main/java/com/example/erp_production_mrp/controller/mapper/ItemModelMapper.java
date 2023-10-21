//package com.example.erp_production_mrp.mapper;
//
//import com.example.erp_production_mrp.dto.ItemDTO;
//import com.example.erp_production_mrp.model.Item;
//import org.mapstruct.Mapper;
//import org.mapstruct.Mapping;
//
//@Mapper(componentModel = "spring")
//public interface ItemModelMapper {
//
//    @Mapping(source = "item.id", target = "itemId")
//    static ItemDTO mapItemEntityToItemDTO(Item item){
//        return new ItemDTO(item.getTypeOfItem(), item.getUnit(), item.getIndexDescription(),
//                item.getQuantity(), item.getCost(), item.getPartNumber(), item.getIndexName());
//    }
//
//}

//package com.example.erp_production_mrp.mapper;
//
//import com.example.erp_production_mrp.dto.StructureDTO;
//import com.example.erp_production_mrp.model.Item;
//import com.example.erp_production_mrp.model.Structure;
//import org.mapstruct.Mapper;
//import org.mapstruct.Mapping;
//
//@Mapper(componentModel = "spring")
//public interface ItemStructureModelMapper {
//    @Mapping(source = "item.id", target = "itemId")
//    static StructureDTO mapItemStructureEntityToItemStructureDTP(Structure structure, Item item){
//        return new StructureDTO(structure.getStructureId(), structure.getVersion(),
//                structure.getStartDate(), structure.getStopDate(),
//                structure.getStatusType());
//    }
//
//}
//

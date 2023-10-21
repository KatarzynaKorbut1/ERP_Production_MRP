//package com.example.erp_production_mrp.mapper;
//
//import com.example.erp_production_mrp.dto.StructureComponentListDTO;
//import com.example.erp_production_mrp.dto.StructureDTO;
//import com.example.erp_production_mrp.model.Structure;
//import com.example.erp_production_mrp.model.StructureComponentList;
//import org.mapstruct.Mapper;
//import org.mapstruct.Mapping;
//@Mapper(componentModel = "spring")
//public interface StructureComponentListModelMapper {
//
//        @Mapping(source = "structure.id", target = "structureId")
//        static StructureComponentListDTO mapStructureComponentListEntityToStructureComponentListDTP(Structure structure, StructureComponentList structureComponentList){
//            return new StructureComponentListDTO(structure.getStructureId(), structure.getVersion(),
//                    structure.getStartDate(), structure.getStopDate(),
//                    structure.getStatusType(), structureComponentList.getStructureComponentListId(), structureComponentList.getComponent());
//        }
//
//    }

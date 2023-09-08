//package com.example.erp_production_mrp.mapper;
//
//import com.example.erp_production_mrp.dto.StructureDTO;
//import com.example.erp_production_mrp.model.Structure;
//import org.mapstruct.Mapper;
//import org.mapstruct.Mapping;
//
//@Mapper(componentModel = "spring")
//public interface StructureModelMapper {
//
//    @Mapping(source = "structure.id", target = "structureId")
//    static StructureDTO mapStructureEntityToStructureDTP(Structure structure){
//        return new StructureDTO(structure.getStructureId(), structure.getVersion(),
//                structure.getStartDate(), structure.getStopDate(),
//                structure.getStatusType());
//    }
//}
//
////Long structureId, Long version, LocalDate startDate, LocalDate stopDate,
////                           StatusType statusType, StructureComponentList structureComponentList
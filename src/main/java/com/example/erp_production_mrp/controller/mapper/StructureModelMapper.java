package com.example.erp_production_mrp.controller.mapper;

import com.example.erp_production_mrp.controller.dto.StructureDTO;
import com.example.erp_production_mrp.model.Structure;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper(componentModel = "spring")
public interface StructureModelMapper {

    StructureModelMapper INSTANCE = Mappers.getMapper(StructureModelMapper.class);

    Structure mapToStructure(StructureDTO structureDTO);

    @InheritInverseConfiguration(name = "mapToStructure")
    StructureDTO mapToStructureDTO(Structure structure);




}
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
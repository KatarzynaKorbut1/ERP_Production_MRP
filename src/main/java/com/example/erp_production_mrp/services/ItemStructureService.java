package com.example.erp_production_mrp.services;


import com.example.erp_production_mrp.controller.dto.ItemStructureDTO;
import com.example.erp_production_mrp.controller.dto.StructureDTO;
import com.example.erp_production_mrp.model.Item;
import com.example.erp_production_mrp.model.Structure;
import com.example.erp_production_mrp.model.TypeOfItem;
import com.example.erp_production_mrp.repositories.ItemRepository;
import com.example.erp_production_mrp.repositories.StructureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemStructureService {

    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private StructureRepository structureRepository;

    @Autowired
    private ItemService itemService;


    //    public ItemStructureDTO getItemWithStructures(Long itemId) {
//        Item item = itemRepository.findById(itemId).orElse(null);
//        if (item == null) {
//            return null;
//        }
//        List<Structure> structures = structureRepository.findByItem(item);
//        ItemStructureDTO itemStructureDTO = new ItemStructureDTO();
//        assert item != null;
//        itemStructureDTO.setIndexName(item.getIndexName());
//        itemStructureDTO.setStructures(structures);
//        return itemStructureDTO;
//    }
//
    //działa
    public List<ItemStructureDTO> getItemWithStructuresByIndexName(String indexName) {


        return itemService.getAll().stream()
                .filter(item -> item.getIndexName().equals(indexName))
                .map(ItemStructureService::mapItemToDtos)
                .collect(Collectors.toList());
    }

    private static ItemStructureDTO mapItemToDtos(Item item) {
        return ItemStructureDTO.ItemStructureDTOBuilder.anItemStructureDTO()
                .withIndexName(item.getIndexName())
                .withTypeOfItem(item.getTypeOfItem())
                .withIndexDescription(item.getIndexDescription())
                .withUnit(item.getUnit())
                .withStructures(mapStructuresToDtos(item))
                .build();
    }

    private static List<StructureDTO> mapStructuresToDtos(Item item) {
        return item.getStructures().stream()
                .map(ItemStructureService::mapStructureToDto)
                .collect(Collectors.toList());
    }

    private static StructureDTO mapStructureToDto(Structure structure) {
        return StructureDTO.StructureDTOBuilder.aStructureDTO()
                .withVersion(structure.getVersion())
                .withStartDate(structure.getStartDate())
                .withStopDate(structure.getStopDate())
                .withStatusType(structure.getStatusType())
                .build();
    }

    public List<ItemStructureDTO> getItemStructureDTOList() {

                return itemService.getAll().stream()
                        .map(ItemStructureService::mapItemToDtos)
                        .collect(Collectors.toList());

//                .map(item -> ItemStructureDTO.ItemStructureDTOBuilder.anItemStructureDTO()
//                        .withIndexName(item.getIndexName())
//                        .withIndexDescription(item.getIndexDescription())
//                        .withTypeOfItem(item.getTypeOfItem())
//                        .withUnit(item.getUnit())
//                        .withStructures(item.getStructures().stream()
//                                .map(structure -> StructureDTO.StructureDTOBuilder.aStructureDTO()
//                                        .withVersion(structure.getVersion())
//                                        .withStartDate(structure.getStartDate())
//                                        .withStopDate(structure.getStopDate())
//                                        .withStatusType(structure.getStatusType())
//                                        .build()
//                                )
//                                .collect(Collectors.toList())
//                        )
//                        .build()
//                )
//                .collect(Collectors.toList());
//        return itemStructureDTOS;
    }




    //TODO
    public List<ItemStructureDTO> getItemWithComponentsByTypeOfItem(TypeOfItem typeOfItem) {

            return itemService.getAll().stream().filter(item -> item.getTypeOfItem().equals(typeOfItem))
                    .map(item -> ItemStructureDTO.ItemStructureDTOBuilder.anItemStructureDTO()
                            .withIndexName(item.getIndexName())
                            .build()
                            ).collect(Collectors.toList());
            
    }

    public List<ItemStructureDTO> getItemWithComponentsByIndexName(String indexName) {


        List<Item> items = itemRepository.findAll();
        List<ItemStructureDTO> itemStructureDTOS = items.stream()
                .filter(item -> item.getIndexName().equals(indexName))
                .map(item -> mapItemToDtos(item))
                .collect(Collectors.toList());

        return itemStructureDTOS;
    }
}




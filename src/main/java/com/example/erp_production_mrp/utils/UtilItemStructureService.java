//package com.example.erp_production_mrp.utils;
//
//public class UtilItemStructureService {



//    public List<ItemStructureDTO> getItemStructureJust(){
//        return itemStructureRepository.findAll().
//                stream().
//                map(ItemModelMapper::mapItemStructureEntityToItemStructureDTP).toList();
//    }
//
//    public ItemStructureDTO mergeItemStructureEntities(Optional<Item> itemOptional, Optional<Structure> structureOptional) {
//////        Optional<Item> itemOptional = itemRepository.findById(itemId);
//////        Optional<Structure> structureOptional = structureService.findByItemId(itemId);
////
////        return itemOptional.flatMap(item ->
////                        structureOptional.map(structure ->
////                                new ItemStructureDTO(item.getItemId(),structure.getStructureId())))
////                .orElseThrow(() -> new RuntimeException("Either item or structure not found!"));
////    }
//}

//działa ale nie na recordach
//public ItemStructureDTO getItemsWithStructures(){
//    List<Item> item = itemRepository.findAll();
//    if (item == null){
//        return null;
//    }
//    List<Structure> structures = structureRepository.findByItem((Item) item);
//    ItemStructureDTO itemStructureDTO = new ItemStructureDTO();
//    assert item !=null;
//    itemStructureDTO.setIndexName(item);
//    itemStructureDTO.setStructures(structures);
//    return itemStructureDTO;

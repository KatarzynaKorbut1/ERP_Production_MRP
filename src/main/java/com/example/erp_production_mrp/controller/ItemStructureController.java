//package com.example.erp_production_mrp.controller;
//
//import com.example.erp_production_mrp.dto.ItemStructureDTO;
//import com.example.erp_production_mrp.services.ItemStructureService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api")
//public class ItemStructureController {
//
//    @Autowired
//    private ItemStructureService itemStructureService;
//


//    @GetMapping("items/{itemId}")
//    public ResponseEntity<ItemStructureDTO> getItemWithStructures(@PathVariable Long itemId) {
//        ItemStructureDTO itemStructureDTO = itemStructureService.getItemWithStructures(itemId);
//        if (itemStructureDTO == null) {
//            // Obsłuż brak znalezienia przedmiotu
//            return ResponseEntity.notFound().build();
//        }
//        return ResponseEntity.ok(itemStructureDTO);
//    }





//
//    private final ItemStructureService itemStructureService;
//
//    public ItemStructureController(ItemStructureService itemStructureService) {
//
//        this.itemStructureService = itemStructureService;
//}
//
//    @GetMapping("/itemStructure/{id}")
//    public ResponseEntity<ItemStructureDTO> getItemStructureDTO(@PathVariable Long id){
//        ItemStructureDTO itemStructureDTO = itemStructureService.mergeItemStructureEntities(id);
//        return new ResponseEntity<>(itemStructureDTO, HttpStatus.OK);
//    }
//
//
//
//
//
////    @GetMapping("/items/all")
////        public ResponseEntity<List<ItemStructureDTO>> getAll() {
////
////            List<ItemStructureDTO> itemStructureDTOList = itemStructureService.getItemStructureJust();
////            return new ResponseEntity<>(itemStructureDTOList, HttpStatus.OK);
////        }
//    }
//

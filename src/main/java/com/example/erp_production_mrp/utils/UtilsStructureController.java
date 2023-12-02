//package com.example.erp_production_mrp.utils;
//
//public class UtilsStructureController {


//    @GetMapping("/structurs")
//    public List<Structure> getAllStructures() {
//        List<Structure> structureList = fetchData();
//        ObjectMapper objectMapper = new ObjectMapper();
//        List<Structure> deserializeStructures = new ArrayList<>();
//
//        try {
//            for (String structureJson : structureList) {
//                Structure structure = objectMapper.readValue(structureJson, Structure.class);
//                deserializeStructures.add(structure);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    return deserializeStructures;
//}


//nie działą StackOverFlow i IllegalStateExceptiom, problem z serializacją
//    @GetMapping("item/{id}/structure")
//    public ResponseEntity<List<Structure>> getItemWithStructure(@PathVariable("id") Long itemId) {
//        Item item = itemService.getItemById(itemId).get();
//        if (item == null) {
//            return ResponseEntity.notFound().build();
//        }
//        List<Structure> structure = itemRepository.findById(itemId);
//        return ResponseEntity.ok(structure);
//    }


import org.springframework.web.bind.annotation.GetMapping;

// 404 nor found
//@GetMapping("http://localhost:8080/api/structurs")
//public List<Structure> structureResposne(final String path, final HttpMethod method) {
//        RestTemplate restTemplate = new RestTemplate();
//final ResponseEntity<List<Structure>> response = restTemplate.exchange(
//        path,
//        method,
//        null,
//        new ParameterizedTypeReference<List<Structure>>() {
//        });
//        List<Structure> list = response.getBody();
//        return list;
//
//
//        }

//}

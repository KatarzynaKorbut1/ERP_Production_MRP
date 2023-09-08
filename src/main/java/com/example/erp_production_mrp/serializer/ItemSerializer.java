package com.example.erp_production_mrp.serializer;

import com.example.erp_production_mrp.model.Item;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class ItemSerializer extends JsonSerializer<Item> {


    @Override
    public void serialize(Item item, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeNumberField("itemId", item.getItemId());
        jsonGenerator.writeNumberField("quantity", item.getQuantity());
        jsonGenerator.writeNumberField("cost", item.getCost());
        jsonGenerator.writeStringField("indexName", item.getIndexName());
        jsonGenerator.writeStringField("indexName", item.getIndexName());
        jsonGenerator.writeStringField("indexDescription", item.getIndexDescription());
        jsonGenerator.writeStringField("unit", String.valueOf(item.getUnit()));
        jsonGenerator.writeStringField("typeOfItem", String.valueOf(item.getTypeOfItem()));
        jsonGenerator.writeEndObject();
    }
}

package com.example.erp_production_mrp.serializer;

import com.example.erp_production_mrp.model.Structure;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class StructureSerializer extends JsonSerializer<Structure> {
    @Override
    public void serialize(Structure structure, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeNumberField("structureId", structure.getStructureId());
        jsonGenerator.writeStringField("startDate", String.valueOf(structure.getStartDate()));
        jsonGenerator.writeStringField("stopDate", String.valueOf(structure.getStopDate()));
        jsonGenerator.writeNumberField("version", structure.getVersion());
        jsonGenerator.writeStringField("statusType", String.valueOf(structure.getStatusType()));
        jsonGenerator.writeEndObject();

    }
}

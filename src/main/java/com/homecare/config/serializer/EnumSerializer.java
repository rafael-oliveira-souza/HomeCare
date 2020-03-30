package com.homecare.config.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.homecare.model.enums.TipoUsuarioEnum;
import com.homecare.model.interfaces.EnumInterface;

import java.io.IOException;

public class EnumSerializer extends StdSerializer<EnumInterface> {

    public EnumSerializer() {
        this(null);
    }

    public EnumSerializer(Class<EnumInterface> t) {
        super(t);
    }

    @Override
    public void serialize(EnumInterface anEnum, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(anEnum.getValue().toString());
    }
}

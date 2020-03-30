package com.homecare.config.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.homecare.model.enums.TipoUsuarioEnum;

import java.io.IOException;

public  class AbstractEnumSerializer<T> extends StdSerializer {

    public static Class getClasse(){
        return TipoUsuarioEnum.class;
    }

    protected AbstractEnumSerializer(Class t) {
        super(t);
    }

    protected AbstractEnumSerializer(JavaType type) {
        super(type);
    }

    @Override
    public void serialize(Object o, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {

    }
}

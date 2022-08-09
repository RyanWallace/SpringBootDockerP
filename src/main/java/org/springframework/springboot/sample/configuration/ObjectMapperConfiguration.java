package org.springframework.springboot.sample.configuration;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import java.util.TimeZone;

@Configuration
public class ObjectMapperConfiguration {

    @Bean
    @Primary
    public ObjectMapper getObjectMapper() {
        return Jackson2ObjectMapperBuilder.json()
                .timeZone(TimeZone.getDefault())
                .defaultViewInclusion(true)
                .featuresToEnable(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)
                .featuresToDisable(
                        SerializationFeature.FAIL_ON_EMPTY_BEANS,
                        DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
                .modules(new JavaTimeModule())
                .build();
    }
}

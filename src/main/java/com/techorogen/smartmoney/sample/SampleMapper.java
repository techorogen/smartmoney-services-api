package com.techorogen.smartmoney.sample;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SampleMapper {
    SampleDTO entityToDto(Sample sample);
    Sample dtoToEntity(SampleDTO sampleDTO);
}

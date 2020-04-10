package com.techorogen.smartmoney.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author vlad.ciontescu
 * @since 04/09/2020
 */
@RestController
@RequestMapping(value = "/sample")
public class SampleController {

    private final SampleMapper sampleMapper;
    private final SampleService sampleService;

    @Autowired
    public SampleController(SampleMapper sampleMapper, SampleService sampleService) {
        this.sampleMapper = sampleMapper;
        this.sampleService = sampleService;
    }

    @GetMapping("/{id}")
    public SampleDTO get(@PathVariable int id) {
        Sample sample = sampleService.getById(id);
        return sampleMapper.entityToDto(sample);
    }

    @PostMapping
    public SampleDTO post(@RequestBody @Valid SampleDTO sampleDTO) {
        Sample sample = sampleMapper.dtoToEntity(sampleDTO);
        Sample newSample = sampleService.create(sample);
        return sampleMapper.entityToDto(newSample);
    }
}

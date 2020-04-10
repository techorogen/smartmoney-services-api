package com.techorogen.smartmoney.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

@Service
public class SampleService {

    private final SampleRepository sampleRepository;

    @Autowired
    public SampleService(SampleRepository sampleRepository) {
        this.sampleRepository = sampleRepository;
    }

    @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
    public Sample getById(int id) {
        return sampleRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Unable to find Sample for id " + id));
    }

    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public Sample create(Sample sample) {
        return sampleRepository.save(sample);
    }
}

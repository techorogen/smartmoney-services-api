package com.example.demo.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author vlad.ciontescu
 * @since 04/09/2020
 */
@RestController
@RequestMapping(value = "/sample")
public class SampleController {

    @GetMapping
    public String test() {
        return "Hello Cloud World!";
    }
}

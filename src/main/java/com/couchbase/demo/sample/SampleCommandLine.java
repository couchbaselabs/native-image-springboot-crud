package com.couchbase.demo.sample;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Slf4j
@Component
public class SampleCommandLine implements CommandLineRunner {
    final SampleService service;

    public SampleCommandLine(SampleService service) {
        this.service = service;
    }

    public Sample createSample(){
        return Sample.builder().name(UUID.randomUUID().toString()).description(UUID.randomUUID().toString()).build();
    }

    public void print(Sample sample) {
        log.info("printing {}",sample);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Hello World");
        Sample doc = createSample();
        print(doc);

        Sample returned = service.save(doc);
        Sample result = service.get(returned.getId());
        print(result);
        log.info("Get all docs...");
        List<Sample> samples = service.getAll();
        log.info(" - found {}", samples.size());
        samples.forEach(this::print);
        log.info("Goodbye World");
    }
}

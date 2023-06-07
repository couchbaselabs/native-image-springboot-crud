package com.couchbase.demosimplecrudnative.sample;

import com.couchbase.client.core.util.CoreAsyncUtils;
import com.couchbase.client.java.Cluster;
import com.couchbase.client.java.Collection;
import com.couchbase.client.java.json.JsonObject;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

import static java.lang.String.format;

@Service
public class SampleService {
    final Cluster cluster;
    final Collection sampleCollection;

    public SampleService(Cluster cluster, Collection defaultCollection) {
        this.cluster = cluster;
        this.sampleCollection = defaultCollection;
    }


    public Sample get(String id) {
        return sampleCollection.get(id).contentAs(Sample.class); //toSample(sampleCollection.get(id).contentAsObject());
    }
/*
    Sample toSample(JsonObject doc) {
        return Sample.builder()
                .id(doc.getString("id"))
                .name(doc.getString("name"))
                .description(doc.getString("description"))
                .build();
    }

    JsonObject toJsonObject(Sample sample) {
        return JsonObject.create().put("id",sample.getId())
                .put("description", sample.getDescription())
                .put("name", sample.getName());
    }*/

    public Sample save(Sample sample) {
        sample.setId(UUID.randomUUID().toString());
       // JsonObject content = toJsonObject(sample);
        sampleCollection.upsert(sample.getId(),sample);
        return sample;
    }

    public List<Sample> getAll() {
        return cluster.query(format("SELECT a.* FROM `%s`.`%s`.`%s` a",sampleCollection.bucketName(),sampleCollection.scopeName(), sampleCollection.name())).rowsAs(Sample.class); //TODO set max items for pagination
    }
}

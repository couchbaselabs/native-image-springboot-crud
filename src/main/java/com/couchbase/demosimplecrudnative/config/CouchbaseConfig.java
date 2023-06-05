package com.couchbase.demosimplecrudnative.config;

import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.Cluster;
import com.couchbase.client.java.Collection;
import com.couchbase.demosimplecrudnative.sample.Sample;
import org.springframework.aot.hint.annotation.RegisterReflectionForBinding;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;

@RegisterReflectionForBinding(classes = Sample.class)
@Configuration
public class CouchbaseConfig {

    @Value("${spring.couchbase.connection-string:localhost}")
    private String bootstrapHosts;
    @Value("${spring.data.couchbase.bucket-name:observability}")
    private String bucketName;
    @Value("${spring.couchbase.username:Administrator}")
    private String username;
    @Value("${spring.couchbase.password:password}")
    private String userPassword;

    @Bean
    public Cluster cluster() {
        return Cluster.connect(getBootstrapHosts(), getUsername(), getUserPassword());
    }

    @Bean
    public Bucket bucket(Cluster cluster) {
        Bucket bucket = cluster.bucket(getBucketName());
        bucket.waitUntilReady(Duration.ofSeconds(30));
        return bucket;
    }

    @Bean(name = "defaultCollection")
    public Collection collection(Bucket bucket) {
        bucket.waitUntilReady(Duration.ofSeconds(30));
        // get a collection reference
        return bucket.defaultCollection();
    }

    public String getBootstrapHosts() {
        return bootstrapHosts;
    }

    public void setBootstrapHosts(String bootstrapHosts) {
        this.bootstrapHosts = bootstrapHosts;
    }

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}

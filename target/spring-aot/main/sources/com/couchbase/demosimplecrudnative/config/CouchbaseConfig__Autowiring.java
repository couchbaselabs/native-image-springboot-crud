package com.couchbase.demosimplecrudnative.config;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link CouchbaseConfig}.
 */
public class CouchbaseConfig__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static CouchbaseConfig apply(RegisteredBean registeredBean, CouchbaseConfig instance) {
    AutowiredFieldValueResolver.forRequiredField("bootstrapHosts").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("bucketName").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("username").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("userPassword").resolveAndSet(registeredBean, instance);
    return instance;
  }
}

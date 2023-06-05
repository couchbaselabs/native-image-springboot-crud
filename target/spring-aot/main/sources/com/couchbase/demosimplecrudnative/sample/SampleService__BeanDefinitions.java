package com.couchbase.demosimplecrudnative.sample;

import com.couchbase.client.java.Cluster;
import com.couchbase.client.java.Collection;
import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link SampleService}.
 */
public class SampleService__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'sampleService'.
   */
  private static BeanInstanceSupplier<SampleService> getSampleServiceInstanceSupplier() {
    return BeanInstanceSupplier.<SampleService>forConstructor(Cluster.class, Collection.class)
            .withGenerator((registeredBean, args) -> new SampleService(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'sampleService'.
   */
  public static BeanDefinition getSampleServiceBeanDefinition() {
    Class<?> beanType = SampleService.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getSampleServiceInstanceSupplier());
    return beanDefinition;
  }
}

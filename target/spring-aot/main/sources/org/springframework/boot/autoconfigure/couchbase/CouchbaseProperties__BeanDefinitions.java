package org.springframework.boot.autoconfigure.couchbase;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CouchbaseProperties}.
 */
public class CouchbaseProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'couchbaseProperties'.
   */
  public static BeanDefinition getCouchbasePropertiesBeanDefinition() {
    Class<?> beanType = CouchbaseProperties.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(CouchbaseProperties::new);
    return beanDefinition;
  }
}

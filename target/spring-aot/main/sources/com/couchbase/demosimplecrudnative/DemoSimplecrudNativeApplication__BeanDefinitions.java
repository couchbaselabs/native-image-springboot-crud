package com.couchbase.demosimplecrudnative;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link DemoSimplecrudNativeApplication}.
 */
public class DemoSimplecrudNativeApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'demoSimplecrudNativeApplication'.
   */
  public static BeanDefinition getDemoSimplecrudNativeApplicationBeanDefinition() {
    Class<?> beanType = DemoSimplecrudNativeApplication.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    ConfigurationClassUtils.initializeConfigurationClass(DemoSimplecrudNativeApplication.class);
    beanDefinition.setInstanceSupplier(DemoSimplecrudNativeApplication$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}

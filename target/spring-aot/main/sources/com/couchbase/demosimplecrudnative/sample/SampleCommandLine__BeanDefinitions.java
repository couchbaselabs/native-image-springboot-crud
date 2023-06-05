package com.couchbase.demosimplecrudnative.sample;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link SampleCommandLine}.
 */
public class SampleCommandLine__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'sampleCommandLine'.
   */
  private static BeanInstanceSupplier<SampleCommandLine> getSampleCommandLineInstanceSupplier() {
    return BeanInstanceSupplier.<SampleCommandLine>forConstructor(SampleService.class)
            .withGenerator((registeredBean, args) -> new SampleCommandLine(args.get(0)));
  }

  /**
   * Get the bean definition for 'sampleCommandLine'.
   */
  public static BeanDefinition getSampleCommandLineBeanDefinition() {
    Class<?> beanType = SampleCommandLine.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getSampleCommandLineInstanceSupplier());
    return beanDefinition;
  }
}

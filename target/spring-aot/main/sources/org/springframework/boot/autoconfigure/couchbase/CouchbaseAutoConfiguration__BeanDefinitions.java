package org.springframework.boot.autoconfigure.couchbase;

import com.couchbase.client.java.env.ClusterEnvironment;
import java.lang.Class;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CouchbaseAutoConfiguration}.
 */
public class CouchbaseAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.springframework.boot.autoconfigure.couchbase.CouchbaseAutoConfiguration'.
   */
  private static BeanInstanceSupplier<CouchbaseAutoConfiguration> getCouchbaseAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<CouchbaseAutoConfiguration>forConstructor(CouchbaseProperties.class)
            .withGenerator((registeredBean, args) -> new CouchbaseAutoConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'couchbaseAutoConfiguration'.
   */
  public static BeanDefinition getCouchbaseAutoConfigurationBeanDefinition() {
    Class<?> beanType = CouchbaseAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getCouchbaseAutoConfigurationInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'couchbaseConnectionDetails'.
   */
  private static BeanInstanceSupplier<CouchbaseAutoConfiguration.PropertiesCouchbaseConnectionDetails> getCouchbaseConnectionDetailsInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<CouchbaseAutoConfiguration.PropertiesCouchbaseConnectionDetails>forFactoryMethod(CouchbaseAutoConfiguration.class, "couchbaseConnectionDetails")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(CouchbaseAutoConfiguration.class).couchbaseConnectionDetails());
  }

  /**
   * Get the bean definition for 'couchbaseConnectionDetails'.
   */
  public static BeanDefinition getCouchbaseConnectionDetailsBeanDefinition() {
    Class<?> beanType = CouchbaseAutoConfiguration.PropertiesCouchbaseConnectionDetails.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getCouchbaseConnectionDetailsInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'couchbaseClusterEnvironment'.
   */
  private static BeanInstanceSupplier<ClusterEnvironment> getCouchbaseClusterEnvironmentInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ClusterEnvironment>forFactoryMethod(CouchbaseAutoConfiguration.class, "couchbaseClusterEnvironment", CouchbaseConnectionDetails.class, ObjectProvider.class, ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(CouchbaseAutoConfiguration.class).couchbaseClusterEnvironment(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'couchbaseClusterEnvironment'.
   */
  public static BeanDefinition getCouchbaseClusterEnvironmentBeanDefinition() {
    Class<?> beanType = ClusterEnvironment.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setDestroyMethodNames("close");
    beanDefinition.setInstanceSupplier(getCouchbaseClusterEnvironmentInstanceSupplier());
    return beanDefinition;
  }
}

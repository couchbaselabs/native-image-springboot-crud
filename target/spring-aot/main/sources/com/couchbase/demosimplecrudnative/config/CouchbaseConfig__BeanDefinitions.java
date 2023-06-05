package com.couchbase.demosimplecrudnative.config;

import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.Cluster;
import com.couchbase.client.java.Collection;
import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link CouchbaseConfig}.
 */
public class CouchbaseConfig__BeanDefinitions {
  /**
   * Get the bean definition for 'couchbaseConfig'.
   */
  public static BeanDefinition getCouchbaseConfigBeanDefinition() {
    Class<?> beanType = CouchbaseConfig.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    ConfigurationClassUtils.initializeConfigurationClass(CouchbaseConfig.class);
    InstanceSupplier<CouchbaseConfig> instanceSupplier = InstanceSupplier.using(CouchbaseConfig$$SpringCGLIB$$0::new);
    instanceSupplier = instanceSupplier.andThen(CouchbaseConfig__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'cluster'.
   */
  private static BeanInstanceSupplier<Cluster> getClusterInstanceSupplier() {
    return BeanInstanceSupplier.<Cluster>forFactoryMethod(CouchbaseConfig.class, "cluster")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(CouchbaseConfig.class).cluster());
  }

  /**
   * Get the bean definition for 'cluster'.
   */
  public static BeanDefinition getClusterBeanDefinition() {
    Class<?> beanType = Cluster.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setDestroyMethodNames("close");
    beanDefinition.setInstanceSupplier(getClusterInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'bucket'.
   */
  private static BeanInstanceSupplier<Bucket> getBucketInstanceSupplier() {
    return BeanInstanceSupplier.<Bucket>forFactoryMethod(CouchbaseConfig.class, "bucket", Cluster.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(CouchbaseConfig.class).bucket(args.get(0)));
  }

  /**
   * Get the bean definition for 'bucket'.
   */
  public static BeanDefinition getBucketBeanDefinition() {
    Class<?> beanType = Bucket.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getBucketInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'defaultCollection'.
   */
  private static BeanInstanceSupplier<Collection> getDefaultCollectionInstanceSupplier() {
    return BeanInstanceSupplier.<Collection>forFactoryMethod(CouchbaseConfig.class, "collection", Bucket.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(CouchbaseConfig.class).collection(args.get(0)));
  }

  /**
   * Get the bean definition for 'defaultCollection'.
   */
  public static BeanDefinition getDefaultCollectionBeanDefinition() {
    Class<?> beanType = Collection.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getDefaultCollectionInstanceSupplier());
    return beanDefinition;
  }
}

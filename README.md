# Couchbase SDK with GraalVM Native Image generation

![title](docs/title.png)

GraalVM + Springboot 3.x + Couchbase Java SDK 

**GraalVM Native Images** provide a new way to deploy and run Java applications. Compared to the Java Virtual Machine, native images can run with a smaller memory footprint and with much faster startup times.

They are well suited to applications that are deployed using container images and are especially interesting when combined with "Function as a service" (FaaS) platforms.

Unlike traditional applications written for the JVM, GraalVM Native Image applications require **ahead-of-time processing** in order to create an executable. This **ahead-of-time processing** involves statically analyzing your application code from its main entry point.

A **GraalVM Native Image** is a complete, platform-specific executable. You do not need to ship a Java Virtual Machine in order to run a native image.



0. Prerequisites
1. Quick Start
2. Why Running Java with GraalVM Native Image? 
3. Maven Native Image pluging
4. Gradle configuration
5. GraalVM Agent
6. Troubleshooting 
7. To do list...

## 0. Pre-requisites 

Install GraalVM JRE
```
```

## 1. Quick Start

```
mvn clean spring-boot:build-image -Pnative
```


## 2. Why GraalVM Native Image

![aot vs jit](docs/aot-vs-jit-peak-throughput.png)

* Source: Thomas Wuerthinger -[Maximizing Performance with GraalVM](https://www.infoq.com/presentations/graalvm-performance/)

## 3. Configuration

### 3.1. Maven Native Image Plugin


### 3.2. Gradle Configuration (TODO)


## 4. GraalVM Agent


## 5. Troubleshooting


## 6. To do list


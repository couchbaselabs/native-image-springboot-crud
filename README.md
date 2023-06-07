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

**Install GraalVM JRE** [Getting Started Link](https://www.graalvm.org/22.0/docs/getting-started/)

*Note: Using Sdkman on Macos*

```
sdk install java 22.3.2.r17-grl
```

Note: If you are using macOS Catalina and later you may need to remove the quarantine attribute from the bits before you can use them
To do this, run the following:

```
$ sudo xattr -r -d com.apple.quarantine path/to/graalvm/
```

GraalVM Native Image plugin

**Maven +3.6**

```
tar xzvf apache-maven-3.9.2-bin.tar.gz
```
Add the bin directory of the created directory apache-maven-3.9.2 to the PATH environment variable

Confirm with `mvn -v` in a new shell. The result should look similar to

```
Apache Maven 3.9.2 (c9616018c7a021c1c39be70fb2843d6f5f9b8a1c)
Maven home: /opt/apache-maven-3.9.2
Java version: 1.8.0_45, vendor: Oracle Corporation
Java home: /Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre
Default locale: en_US, platform encoding: UTF-8
OS name: "mac os x", version: "10.8.5", arch: "x86_64", family: "mac"
```


**Docker** [https://docs.docker.com/desktop/install/mac-install/](https://docs.docker.com/desktop/install/mac-install/)



## 1. Quick Start



```
mvn clean spring-boot:build-image -Pnative
```

Check the generated executable binary:

```
./target/graalvm-springboot-simplecrud 
```

![Springboot executable](docs/springboot-executable.png)

run the docker image:

```
```


## 2. Why GraalVM Native Image

![aot vs jit](docs/aot-vs-jit-peak-throughput.png)

* Source: Thomas Wuerthinger - [Maximizing Performance with GraalVM](https://www.infoq.com/presentations/graalvm-performance/)


## 3. Configuration


### 3.1. Maven Native Image Plugin

```
   ...
   <plugin>
        <groupId>org.graalvm.buildtools</groupId>
        <artifactId>native-maven-plugin</artifactId>
        ...
    </plugin>
```


### 3.2. Gradle Configuration (TODO)


## 4. GraalVM Agent


## 5. Troubleshooting


## 6. To do list


## 7. References

*

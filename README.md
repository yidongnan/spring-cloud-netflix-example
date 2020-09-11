# Spring Cloud Netflix Sample Application

<details>
<summary>Translations:</summary>

- [Chinese / 中文](README-zh.md)

</details>

spring-cloud-netflix-example is an example for microservices system.

It contains **configuration management, service discovery, circuit breakers, intelligent routing, distributed tracing, application monitor**.

The registry center uses the eureka, if you want to use consul, you can refer to https://github.com/yidongnan/spring-cloud-consul-example.

## Getting Started
```shell
./gradlew clean build -x test
./buildDockerImage.sh
docker-compose up -d
```

If you want to start more serve, you should use:
```shell
docker-compose scale service-a=2 service-b=3  
```

Start the basic service in the development environment:
```
docker-compose -f docker-compose-dev.yml up -d
```

## Technology List
* Spring Cloud Netflix
* Spring Cloud Sleuth
* Spring Cloud Config
* Spring Boot Admin
* Spring Boot
* ZipKin
* RabbitMQ
* Docker
* Swagger

## Architecture Overview
[](url "title")
<img src="https://raw.githubusercontent.com/yidongnan/spring-cloud-netflix-example/master/screenshots/Architecture.png">

## Screenshots
### Api Route(Zuul)
[](url "title")
<img src="https://raw.githubusercontent.com/yidongnan/spring-cloud-netflix-example/master/screenshots/Selection_001.png">

### Eureka Dashboard
[](url "title")
<img src="https://raw.githubusercontent.com/yidongnan/spring-cloud-netflix-example/master/screenshots/Selection_002.png">

### ZipKin Dashboard
[](url "title")
<img src="https://raw.githubusercontent.com/yidongnan/spring-cloud-netflix-example/master/screenshots/Selection_003.png">

### ZipKin Trace Detail
[](url "title")
<img src="https://raw.githubusercontent.com/yidongnan/spring-cloud-netflix-example/master/screenshots/Selection_004.png">

### ZipKin Dependencies Overview
[](url "title")
<img src="https://raw.githubusercontent.com/yidongnan/spring-cloud-netflix-example/master/screenshots/Selection_005.png">

### Spring Boot Admin Dashboard
[](url "title")
<img src="https://raw.githubusercontent.com/yidongnan/spring-cloud-netflix-example/master/screenshots/Selection_006.png">

### Spring Boot Admin Detail
[](url "title")
<img src="https://raw.githubusercontent.com/yidongnan/spring-cloud-netflix-example/master/screenshots/Selection_007.png">

### Spring Boot Admin Environment
[](url "title")
<img src="https://raw.githubusercontent.com/yidongnan/spring-cloud-netflix-example/master/screenshots/Selection_008.png">

### Spring Boot Admin Thread Dump
[](url "title")
<img src="https://raw.githubusercontent.com/yidongnan/spring-cloud-netflix-example/master/screenshots/Selection_009.png">

### Spring Boot Admin Trace
[](url "title")
<img src="https://raw.githubusercontent.com/yidongnan/spring-cloud-netflix-example/master/screenshots/Selection_010.png">

### Hystrix Dashboard
[](url "title")
<img src="https://raw.githubusercontent.com/yidongnan/spring-cloud-netflix-example/master/screenshots/Selection_011.png">

### Hystrix Dashboard Detail
[](url "title")
<img src="https://raw.githubusercontent.com/yidongnan/spring-cloud-netflix-example/master/screenshots/Selection_012.png">

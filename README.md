# spring-cloud-netflix-example
spring-cloud-netflix-example is a example for microservices system.

It contain 
**configuration management, service discovery, circuit breakers, intelligent routing, distributed tracing, application monitor**.

## Getting Started
```shell
./gradle clean build -x test
./buildDockerImage.sh
docker-compose up
```
if you want to start more serve, you should use 
```shell
docker-compose scale service-a=2 service-b=3  
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

## Architecture Overview
Todo

## screenshots
### Api Route(Zuul)
[](url "title")
<img src="https://raw.githubusercontent.com/yidongnan/spring-cloud-netflix-example/master/screenshots/Selection_001.png">

### Eureka DashBoard
[](url "title")
<img src="https://raw.githubusercontent.com/yidongnan/spring-cloud-netflix-example/master/screenshots/Selection_002.png">

### ZipKin DashBoard
[](url "title")
<img src="https://raw.githubusercontent.com/yidongnan/spring-cloud-netflix-example/master/screenshots/Selection_003.png">

### ZipKin Trace Detail
[](url "title")
<img src="https://raw.githubusercontent.com/yidongnan/spring-cloud-netflix-example/master/screenshots/Selection_004.png">

### ZipKin Dependencies Overview
[](url "title")
<img src="https://raw.githubusercontent.com/yidongnan/spring-cloud-netflix-example/master/screenshots/Selection_005.png">

### Spring Boot Admin DashBoard
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

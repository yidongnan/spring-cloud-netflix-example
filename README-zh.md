# spring-cloud-netflix-example
README: [English](https://github.com/yidongnan/spring-cloud-netflix-example/blob/master/README.md) | [中文](https://github.com/yidongnan/spring-cloud-netflix-example/blob/master/README-zh.md)


Java技术交流群：294712648 <a target="_blank" href="http://shang.qq.com/wpa/qunwpa?idkey=34ad403ce78380042406f11a122637ea9d66c11ae20f331dff37bc90a4fde939"><img border="0" src="http://pub.idqqimg.com/wpa/images/group.png" alt="Java技术交流群" title="Java技术交流群"></a>



spring-cloud-netflix-example 项目是一个微服务系统的实例
项目包括如下功能： **配置管理 、服务发现、熔断,、动态路由、分布式跟踪、应用监控**

## 技术栈
* Spring Cloud Netflix
* Spring Cloud Sleuth
* Spring Cloud Config
* Spring Boot Admin
* Spring Boot
* ZipKin
* RabbitMQ
* Docker

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


## 架构图
[](url "title")
<img src="https://raw.githubusercontent.com/yidongnan/spring-cloud-netflix-example/master/screenshots/Architecture.png">

## 截图
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

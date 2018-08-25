@echo off

for %%i in (admin-dashboard config-server eureka-server hystrix-dashboard service-a service-b zuul) do (
     docker build -t "spring-cloud-netflix-example/%%i:latest" %%i
)
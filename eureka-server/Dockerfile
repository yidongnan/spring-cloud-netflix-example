FROM java:8-jdk
RUN mkdir /app
WORKDIR /app
COPY build/libs/eureka-server.jar /app
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/eureka-server.jar", "--spring.profiles.active=docker"]
EXPOSE 8761
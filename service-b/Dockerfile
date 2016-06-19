FROM java:8-jdk
RUN mkdir /app
WORKDIR /app
COPY build/libs/service-b.jar /app
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/service-b.jar", "--spring.profiles.active=docker"]
EXPOSE 8070
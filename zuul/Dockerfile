FROM java:8-jdk
RUN mkdir /app
WORKDIR /app
COPY build/libs/zuul.jar /app
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/zuul.jar", "--spring.profiles.active=docker"]
EXPOSE 8060
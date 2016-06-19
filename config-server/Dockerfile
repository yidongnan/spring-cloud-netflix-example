FROM java:8-jdk
RUN mkdir /app
WORKDIR /app
COPY build/libs/config-server.jar /app
VOLUME config/ /app/config
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/config-server.jar", "--spring.profiles.active=native,docker"]
EXPOSE 8100
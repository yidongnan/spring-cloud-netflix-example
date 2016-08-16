FROM java:8-jdk

ENV DOCKERIZE_VERSION v0.2.0
RUN wget https://github.com/jwilder/dockerize/releases/download/$DOCKERIZE_VERSION/dockerize-linux-amd64-$DOCKERIZE_VERSION.tar.gz \
    && tar -C /usr/local/bin -xzvf dockerize-linux-amd64-$DOCKERIZE_VERSION.tar.gz

RUN mkdir /app
WORKDIR /app
COPY build/libs/service-b.jar /app
ENTRYPOINT ["dockerize", "-timeout", "5m", "-wait", "tcp://config-server:5672", "java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/service-b.jar", "--spring.profiles.active=docker"]
EXPOSE 8070
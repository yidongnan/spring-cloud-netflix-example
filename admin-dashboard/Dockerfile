FROM java:8-jdk
RUN mkdir /app
WORKDIR /app
echo "127.0.0.1    admin-dashboard" >> /etc/hosts
COPY build/libs/admin-dashboard.jar /app
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/admin-dashboard.jar", "--spring.profiles.active=docker"]
EXPOSE 8040
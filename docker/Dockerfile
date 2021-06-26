FROM openjdk:11
RUN mkdir /deployments \
    && chown 1001 /deployments \
    && chmod "g+rwX" /deployments \
    && chown 1001:root /deployments
COPY ./docker-spring.jar /deployments/app.jar
ENTRYPOINT  ["java", "-jar","deployments/app.jar"]
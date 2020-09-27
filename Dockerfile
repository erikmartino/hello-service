FROM openjdk:14-alpine
COPY build/libs/hello-service-*-all.jar hello-service.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "hello-service.jar"]
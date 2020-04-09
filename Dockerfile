FROM openjdk:11-jre-slim
WORKDIR /app
COPY ./target/demo-*.jar /app/demo.jar
VOLUME /tmp
EXPOSE 80
ENTRYPOINT "exec" "java" "-Xmx256m" "-jar" "demo.jar"

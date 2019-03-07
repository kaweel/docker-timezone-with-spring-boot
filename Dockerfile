FROM openjdk:8-jdk-alpine
RUN date
RUN apk add tzdata
RUN cp /usr/share/zoneinfo/Asia/Bangkok /etc/localtime
RUN date
WORKDIR /root/
ADD target/set-time-zone-0.0.1-SNAPSHOT.jar .
CMD ["java", "-Xmx256M", "-jar", "set-time-zone-0.0.1-SNAPSHOT.jar"]

# docker build --no-cache -t set-time-zone .
# docker run -p 8080:8080 -it --rm set-time-zone /bin/sh
# curl -X GET http://localhost:8080

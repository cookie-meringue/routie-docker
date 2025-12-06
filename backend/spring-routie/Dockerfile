FROM amazoncorretto:21

WORKDIR /application

RUN ln -snf /usr/share/zoneinfo/Asia/Seoul /etc/localtime && echo Asia/Seoul > /etc/timezone

COPY build/libs/*.jar application.jar

ENTRYPOINT ["java", \
    "-Djava.net.preferIPv4Stack=true", \
    "-Duser.timezone=Asia/Seoul", \
    "-jar", \
    "/application/application.jar"]

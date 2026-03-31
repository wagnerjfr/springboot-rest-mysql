FROM eclipse-temurin:17-jre-alpine

LABEL maintainer="Wagner Franchin"

RUN apk update && apk add ca-certificates wget && update-ca-certificates

ADD spring-rest-mysql*.jar /spring-rest-mysql.jar

CMD ["java", "-jar", "/spring-rest-mysql.jar"]

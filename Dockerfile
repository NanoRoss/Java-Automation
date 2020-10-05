FROM markhobson/maven-chrome:latest
COPY pom.xml /app/
COPY src /app/src/
WORKDIR /app/
RUN mvn test -Dtest=Rosario3_TestsSuite test
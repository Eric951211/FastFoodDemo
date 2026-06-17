# 第一階段：請一個會用 Maven 的工人幫我們把程式碼打包
FROM maven:3.9.6-eclipse-temurin-17 AS builder
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# 第二階段：拿打包好的檔案來開機運行
FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=builder /app/target/*.jar app.jar
EXPOSE 8080

# 設定啟動指令
ENTRYPOINT ["java", "-jar", "app.jar"]

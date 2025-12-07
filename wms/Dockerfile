# --- 第一阶段：构建 (Build Stage) ---
# 使用 Maven 镜像作为基础环境进行编译
FROM maven:3.8.5-openjdk-11 AS build
WORKDIR /app

# 1. 复制 pom.xml 先下载依赖（利用 Docker 缓存，这样下次构建更快）
COPY pom.xml .
RUN mvn dependency:go-offline

# 2. 复制源码并打包成 jar（跳过单元测试）
COPY src ./src
RUN mvn clean package -DskipTests

# --- 第二阶段：运行 (Run Stage) ---
# 使用轻量级的 JRE 镜像作为运行环境，保持最终镜像体积最小
FROM eclipse-temurin:11-jre-alpine
WORKDIR /app

# 从构建阶段复制打包好的 jar 包，并重命名为 app.jar
COPY --from=build /app/target/*.jar app.jar

# 暴露 Spring Boot 默认的 8080 端口
EXPOSE 8080

# 启动命令
ENTRYPOINT ["java", "-jar", "app.jar"]

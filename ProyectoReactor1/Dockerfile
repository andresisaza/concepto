# Etapa 1: Build (opcional si ya tienes el JAR empaquetado)
# FROM maven:3.9.6-eclipse-temurin-17 AS build
# WORKDIR /app
# COPY . .
# RUN mvn clean package -DskipTests

# Etapa 2: Runtime
FROM eclipse-temurin:17-jdk-jammy

# Crear directorio en el contenedor
WORKDIR /app

# Copiar el JAR al contenedor (ajusta el nombre del jar generado en /target)
COPY target/ProyectoReactor1-1.0-SNAPSHOT.jar app.jar

# Exponer el puerto (ejemplo: 8080)
EXPOSE 8080

# Comando de ejecución
ENTRYPOINT ["java", "-jar", "app.jar"]
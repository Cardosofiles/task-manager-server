# Etapa 1 - Build da aplicação
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app

# Copia apenas arquivos necessários primeiro para otimizar cache
COPY pom.xml .
COPY src ./src

# Faz o build do projeto
RUN mvn clean package -DskipTests

# Etapa 2 - Execução do JAR
FROM eclipse-temurin:17-jdk
WORKDIR /app

# Copia o .jar gerado da etapa de build
COPY --from=build /app/target/*.jar app.jar

# Cria o diretório de logs (opcional)
RUN mkdir -p /logs

# Exponha a porta da aplicação
EXPOSE 8080

# Comando para iniciar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]

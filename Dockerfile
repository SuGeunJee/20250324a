FROM eclipse-temurin:17-jre-alpine

# 컨테이너 실행 시 JAR 파일을 실행
CMD ["java", "-jar", "/app/test.jar"]


FROM eclipse-temurin:17

# 2. Set working directory inside container
WORKDIR /app

# 3. Copy Java source file into container
COPY ../userinfo.java .

# 4. Compile Java program
RUN javac userinfo.java

# 5. Run the program
CMD ["java", "userinfo"]

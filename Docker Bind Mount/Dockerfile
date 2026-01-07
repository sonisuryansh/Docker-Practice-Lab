FROM eclipse-temurin:17

# 2. Set working directory inside container
WORKDIR /app01

# 3. Copy Java source file into container
COPY ../readserver.java .
COPY ./servers.txt .

# 4. Compile Java program
RUN javac readserver.java

# 5. Run the program
CMD ["java", "readserver"]

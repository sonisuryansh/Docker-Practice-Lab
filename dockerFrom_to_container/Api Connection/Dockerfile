# Use official OpenJDK image
FROM eclipse-temurin:17

# Set working directory inside container
WORKDIR /myapp

# Copy Java source file into container
COPY api_demo.java .

# Compile Java code
RUN javac api_demo.java

# Run the program
CMD ["java", "api_demo"]

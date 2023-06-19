FROM adoptopenjdk:11-jdk-hotspot
WORKDIR /app
COPY . /app
RUN javac -d . src/com/tinnova/bubblesort/*.java
CMD ["java", "-cp", ".", "com.tinnova.bubblesort.Main"]

This is an Assessment Shape Editor app that:

1. Is implemented in Java

## Getting Started

Check this project out, cd into the directory and run:

    ./gradlew run

This will start the Shape Editor app in a command-line mode. 

## Create a Jar File
     
 Clean the project:
 ```
    gradle clean 
```

Build the project:
 ```
    gradle build 
```

Run the project jar:
```
java -jar <$ProjectPath>/build/libs/ColoringService-1.0.jar
```
## IDEA integration

The Ratpack Gradle plugin has special support for IntelliJ IDEA. To open the project in IDEA, run:

    ./gradlew idea

This will generate a `.ipr` file that you can use to open the project in IDEA.

In the “Run” menu, you will find a run configuration for launching the Shape Editor app from within your IDE.

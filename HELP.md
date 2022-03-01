This is an Assessment Shape Editor app that:

1. Is implemented in Java

## Getting Started

Check this project out, cd into the directory and run:

    ./gradlew run

This will start the Shape Editor app in a command-line mode. 

## Shape Editor Output
```
 Workspace % ./gradlew run

> Task :run
Initial SHAPE SquareWith Color YellowColor              ==>[  SHAPE NAME :      Rectangle        SHAPE COLOR :  yellow ] 
Initial SHAPE CircleWith Color YellowColor              ==>[  SHAPE NAME :      Triangle         SHAPE COLOR :  yellow ] 
Initial SHAPE TriangleWith Color YellowColor            ==>[  SHAPE NAME :      Line     SHAPE COLOR :  yellow ] 
Initial SHAPE LineWith Color YellowColor                ==>[  SHAPE NAME :      Circle   SHAPE COLOR :  yellow ] 
Initial SHAPE SquareWith Color RedColor         ==>[  SHAPE NAME :      Circle   SHAPE COLOR :  red ] 
Initial SHAPE CircleWith Color RedColor         ==>[  SHAPE NAME :      Square   SHAPE COLOR :  yellow ] 
Initial SHAPE TriangleWith Color RedColor               ==>[  SHAPE NAME :      Rectangle        SHAPE COLOR :  yellow ] 
Initial SHAPE LineWith Color RedColor           ==>[  SHAPE NAME :      Square   SHAPE COLOR :  yellow ] 


```

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

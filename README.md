# Temperature converter

A temperature converter (celsius or fahrenheit) within the bash/terminal.

Based on the OpenClassroom tutorial (see [here](https://openclassrooms.com/fr/courses/26832-apprenez-a-programmer-en-java/20903-tp-convertissez-des-celsius-en-fahrenheit)) with OOP concepts.

## Getting Started

### Prerequisites

You need [JDK 8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) to start the installation part.

### Installing

After downloading the project, go into the folder with the bash/terminal.

You execute the following commands:

*  you create the folder for .class files

```
mkdir bin
```

* you generate the .class files

```
javac $(find src -name "*.java") -d bin
```

* you go in your bin folder and you create a .jar file

```
jar cvef fr.makemasenyo.temperature.converter.Converter TemperatureConverter.jar fr/makemasenyo/temperature/*
```

* finally, you can use the program

```
java -jar TemperatureConverter.jar
```
Or double-click on the file.

## Built With

* [JDK 8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* [Eclipse](https://www.eclipse.org)
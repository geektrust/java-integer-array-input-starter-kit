# Introduction

This is a skeleton project structure which will help you start solving the problem right away.

## Tools available to you.

- Java 17
- Apache Ant - A build tool to simplify the build process.

## Structure

- **src/main/java** is where all your java source files should be written to. Already has a `Main.java` file that contains the driver code.
- **lib** contains the jar files for the IDE to provide code suggestion capabilities on external dependecies. Like JUnit5.
- **build.xml** is a build config file. You don't need to worry about this or edit this.

## How to build your solution

- Ant task have already been configured for you.
- Run `ant dist` to generate the `dist.jar` file. This can be found inside `dist/lib/` folder.

## Checking for correctness

- You can click on the `Get Code Feedback` button from the interview application, which will run your solution against some preconfigured inputs and show you the output.
- If you want to build & run the `dist.jar` file from the terminal to check against custom inputs see [Running the dist.jar file](#running-the-distjar-file) section.

## Running the dist.jar file

- After building your solution as per [How to build your solution](#how-to-build-your-solution) you can now run the `dist.jar` against inputs.
- To run, issue the command `java -jar dist/lib/dist.jar '<input 1>'` where

  - **input** is a valid input given in the problem statement.

  For example: `java -jar dist/lib/dist.jar '[7,1,5,3,6,4]'` <br>

  Note: Each full command should be wrapped in single quotes.

## Ant tasks available to you.

You can run these following commands on the terminal.

- `ant clean` - will clean the older builds.
- `ant dist` - will compile your code and build the `dist.jar` file inside `dist/lib` folder.

## Scripts available to you.

- `run.sh '<input 1>' '<input 2>'` - compiles and runs the code against the given inputs. Example: `run.sh '[7,1,5,3,6,4]'`.

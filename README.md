# LetterShuffler
Keep the first and last letter of a word and shuffle the other letters randomly.

This is a demo project for training purposes.

## Requirements
The software should parse a sentence and shuffle each word in the following way:
- The first and the last letter should remain at their position.
- All letters in the middle should be shuffled randomly. If possible, the letter should not remain on its original position.

## Task
1. Look at the written code: [LetterShuffler.java](src/main/java/LetterShuffler.java). What is good and what could be improved?
2. How could we improve the structure and readability of the code? You can refactor the code or at least write down some suggestions.

There not the one correct answer, many things are possible and reasonable.

## How to run the project

1. Install [JDK 11](https://www.azul.com/downloads/?version=java-11-lts&package=jdk) and [maven](https://maven.apache.org/download.cgi).
2. Execute on the command line: `mvn exec:java -Dexec.mainClass="LetterShuffler"`
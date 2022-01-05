Домашнее задание №1 из курса [Разработчик Java](https://otus.ru/lessons/java-professional/?utm_source=github&utm_medium=free&utm_campaign=otus)

Сборка "толстого" jar с вызовом метода из guava. Для сборки архива запустим 
```
./gradlew clean shadowJar
```
Можно убедиться, что архив hw01-gradle/build/libs/gradleHW01-0.1.jar "толстый" по количеству файлов
```
dmigus@192-168-0-11 otus_java_2021_09_hw01 % unzip -l hw01-gradle/build/libs/gradleHW01-0.1.jar | tail -n 1
  6681826                     2569 files
```
Запуск программы
```
dmigus@192-168-0-11 otus_java_2021_09_hw01 % java -jar hw01-gradle/build/libs/gradleHW01-0.1.jar             
RangeSet content:
[(-∞..0)]
dmigus@192-168-0-11 otus_java_2021_09_hw01 % java -jar hw01-gradle/build/libs/gradleHW01-0.1.jar 123 "sdfsdf"
RangeSet content:
[(-∞..2)]
```


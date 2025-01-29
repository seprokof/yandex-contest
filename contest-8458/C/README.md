# C. Удаление дубликатов

| Compiler | Time limit | Memory limit | Input | Output |
| --- | --- | --- | --- | --- |
| All compilers | 1 секунда | 10Mb | stdin or input.txt | stdout or output.txt |
| Node.js 14.15.5 | 1 секунда | 20Mb | stdin or input.txt | stdout or output.txt |
| Oracle Java 7 | 1 секунда | 40Mb | stdin or input.txt | stdout or output.txt |
| Kotlin 1.4.30 (JRE 11) | 1,5 секунды | 40Mb | stdin or input.txt | stdout or output.txt |
| Oracle Java 8 | 1 секунда | 40Mb | stdin or input.txt | stdout or output.txt |
| Scala 2.13.4 | 1 секунда | 20Mb | stdin or input.txt | stdout or output.txt |
| OpenJDK Java 15 | 1 секунда | 40Mb | stdin or input.txt | stdout or output.txt |
| Kotlin 1.1.50 (JRE 1.8.0) | 1 секунда | 40Mb | stdin or input.txt | stdout or output.txt |
| Kotlin 1.3.50 (JRE 1.8.0) | 1 секунда | 30Mb | stdin or input.txt | stdout or output.txt |
| Kotlin 1.5.32 (JRE 11) | 1,5 секунды | 40Mb | stdin or input.txt | stdout or output.txt |
| Node JS 8.16 | 1 секунда | 20Mb | stdin or input.txt | stdout or output.txt |

Дан упорядоченный по неубыванию массив целых 32-разрядных чисел. Требуется удалить из него все повторения. Желательно получить решение, которое не считывает входной файл целиком в память, т.е., использует лишь константный объем памяти в процессе работы.

## Формат ввода
Первая строка входного файла содержит единственное число *n*, *n <= 1000000*. На следующих *n* строках расположены числа — элементы массива, по одному на строку. Числа отсортированы по неубыванию. 

## Формат вывода
Выходной файл должен содержать следующие в порядке возрастания уникальные элементы входного массива. 

## Пример

| Ввод | Вывод |
| --- | --- |
| 5<br/>2<br/>4<br/>8<br/>8<br/>8 | 2<br/>4<br/>8 |
| 5<br/>2<br/>2<br/>2<br/>8<br/>8 | 2<br/>8 |

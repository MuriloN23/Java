# 2. Pesquise sobre a diferença entre exceções verificadas e não verificadas em Java. Dê exemplos de cada uma. 

Em Java, existem dois tipos de exceções: exceções verificadas e exceções não verificadas. A diferença entre esses dois tipos de exceções é que as exceções verificadas devem ser tratadas ou declaradas pelos desenvolvedores de um programa, enquanto as exceções não verificadas não precisam ser tratadas ou declaradas.

**Exceções verificadas** são exceções que podem ser causadas por erros de programação. Por exemplo, a exceção `ArithmeticException` pode ser causada por uma divisão por zero. Se um programa não tratar ou declarar uma exceção verificada, o compilador do Java gerará um erro.

**Exemplos de exceções verificadas:**

* `ArithmeticException`
* `NullPointerException`
* `ArrayIndexOutOfBoundsException`
* `FileNotFoundException`
* `IOException`

**Exceções não verificadas** são exceções que podem ser causadas por erros de programação ou por condições externas. Por exemplo, a exceção `ClassCastException` pode ser causada por uma tentativa de converter um objeto em um tipo de objeto incompatível. Exceções não verificadas não precisam ser tratadas ou declaradas, mas é uma boa prática tratá-las de qualquer maneira para evitar que elas causem erros no programa.

**Exemplos de exceções não verificadas:**

* `NumberFormatException`
* `ClassCastException`
* `IllegalArgumentException`
* `NullPointerException`
* `ArrayIndexOutOfBoundsException`

A principal diferença entre exceções verificadas e não verificadas é que as exceções verificadas são consideradas erros de programação, enquanto as exceções não verificadas podem ser causadas por erros de programação ou por condições externas.

É importante entender a diferença entre esses dois tipos de exceções para poder lidar com elas de forma adequada. Exceções verificadas devem ser tratadas ou declaradas para evitar erros de compilação, enquanto exceções não verificadas podem ser tratadas ou simplesmente ignoradas.
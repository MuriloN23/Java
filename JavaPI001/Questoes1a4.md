# 1. O que é uma classe em Java e qual é a diferença entre uma classe e um objeto? Dê 5 exemplos mostrando-os em C++ e em Java.

R: Em Java, uma classe é uma estrutura que define o comportamento e as características de objetos, e serve como um modelo para criar objetos.
Um objeto, por outro lado, é uma instância específica de uma classe, representando uma entidade real no programa.

# 2. Como você declara uma variável em Java e quais são os tipos de dados primitivos mais comuns? Faça um paralelo entre isso e a mesma coisa na linguagem C++.

R: Em Java, é declarado uma variável indicando o tipo de dado seguido pelo nome da variável. Por exemplo: int idade;

Tipos de Dados Primitivos em Java:
int: Números inteiros.
double: Números de ponto flutuante.
char: Caracteres individuais.
boolean: Valores booleanos (true/false).

A diferença para C++ são os nomes dos tipos de dados primitivos.


# 3. Explique o conceito de herança em Java e como você pode criar uma subclasse a partir de uma classe existente. Faça um paralelo com C++, apresentando 5 exemplos.

R: Em Java, a herança viabiliza que uma classe (subclasse) adquira as características e comportamentos de outra classe (superclasse). A subclasse tem a capacidade de ampliar ou ajustar o comportamento da superclasse.
Em C++, o mecanismo de herança opera com uma lógica semelhante, ainda que haja uma pequena variação na sintaxe da linguagem.

# 4. Quando declaramos uma variável em Java, temos, na verdade, um ponteiro. Em C++ é diferente. Discorra sobre esse aspecto.

R: Em Java, ao definirmos uma variável para um tipo de objeto (não primitivo), estamos, de fato, estabelecendo uma referência para o objeto em questão. A alocação dinâmica do objeto ocorre no heap. Contrariamente, em C++, ao declararmos um objeto, ele é diretamente armazenado na memória, eliminando a necessidade de empregar explicitamente ponteiros para lidar com objetos.

Essa distinção entre Java e C++ repercute na maneira como gerenciamos a memória e manipulamos objetos. Em Java, o coletor de lixo (garbage collector) assume a responsabilidade pela liberação de memória, enquanto em C++, é imperativo que nos ocupemos manualmente da alocação e desalocação de memória.







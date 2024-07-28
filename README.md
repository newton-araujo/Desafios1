
# Calculadora em Java

Este projeto é uma calculadora simples desenvolvida em Java, que permite realizar operações básicas de adição, subtração, multiplicação e divisão entre dois números inteiros.

## Funcionalidades

- Receber dois números inteiros do usuário.
- Receber o operador matemático (adição, subtração, multiplicação, divisão) do usuário.
- Realizar a operação matemática e exibir o resultado.

## Como usar

### Pré-requisitos

- [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) instalado.

### Compilação e Execução

1. Clone este repositório ou baixe o arquivo `Calculadora.java`.

2. Navegue até o diretório onde o arquivo `Calculadora.java` está localizado.

3. Compile o arquivo Java usando o comando:
   ```sh
   javac Calculadora.java
   ```

4. Execute o programa compilado:
   ```sh
   java Calculadora
   ```

### Exemplo de Uso

1. O programa solicitará ao usuário que digite o primeiro número.
2. Em seguida, solicitará o segundo número.
3. O usuário deve informar a operação matemática desejada (pode ser `+`, `-`, `*`, `/`, ou os termos `somar`, `subtrair`, `multiplicar`, `dividir`).
4. O resultado da operação será exibido no console.

### Tratamento de Erros

- O programa lançará uma exceção se o usuário não fornecer todos os dados solicitados.
- O programa também lidará com a divisão por zero e lançará uma exceção adequada.

## Estrutura do Código

O código está estruturado da seguinte forma:

- A classe `Calculadora` contém o método `main` que lida com a entrada do usuário e chama o método `calcular`.
- O método `calcular` realiza a operação matemática com base no operador fornecido.

### Método `calcular`

```java
/**
 * Recebe dois números inteiros e um operador, e retorna um número inteiro com o resultado do cálculo.
 *
 * @param a Primeiro número.
 * @param b Segundo número.
 * @param operador Operador matemático (somar, subtrair, multiplicar, dividir).
 * @return Resultado da operação.
 * @throws ArithmeticException Se a operação for divisão por zero.
 * @throws IllegalArgumentException Se o operador for inválido.
 */
public static int calcular(int a, int b, String operador)
```

## Autor

Newton

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).

# Calculadora de Pintura - Algoritmos e Programação

![Status](https://img.shields.io/badge/status-concluido-green)
![Linguagem](https://img.shields.io/badge/linguagem-Java-orange)
![Disciplina](https://img.shields.io/badge/Algoritmos%20e%20Programacao-UNA-blue)

---

## Sobre o Projeto

Este repositório documenta a implementação de um sistema simples em **Java** desenvolvido para a disciplina **Algoritmos e Programação / Programação de Soluções Computacionais**, no contexto acadêmico do **Centro Universitário UNA**.

A atividade simula uma demanda de uma empresa de reformas, onde o sistema deve automatizar o cálculo da quantidade de tinta necessária para pintar as paredes de um quarto perfeitamente quadrado.

---

## Objetivo da Atividade

Desenvolver um programa em Java capaz de solicitar ao usuário a medida do lado de um quarto quadrado e, a partir dessa informação, calcular a quantidade exata de litros de tinta necessária para pintura.

O cálculo considera:

- quarto perfeitamente quadrado
- altura padrão do teto de 2,70 metros
- quatro paredes com a mesma largura
- desconto de 10% referente a portas e janelas
- rendimento de 10 m² por litro de tinta

---

## Enunciado

Com base no que foi discutido em aula sobre lógica de programação, a missão é desenvolver um sistema em Java para uma empresa de reformas que automatize o cálculo de insumos.

O programa deve solicitar ao usuário a medida do lado de um quarto perfeitamente quadrado e, considerando uma altura padrão de teto de 2,70 metros, calcular a área total das quatro paredes, aplicar um desconto de 10% destinado a vãos de portas e janelas e, por fim, exibir a quantidade exata de litros de tinta necessária para a pintura, sabendo que cada litro cobre 10 m².

---

## Exercício Implementado e Explicação

### CalculadoraPintura4261212202

Sistema responsável por calcular a quantidade de tinta necessária para pintar as quatro paredes de um quarto quadrado.

Explicação:  
O programa utiliza a classe `Scanner` para receber do usuário a medida do lado do quarto em metros. Em seguida, considera a altura fixa de `2.70` metros para calcular a área total das quatro paredes por meio da fórmula `4 * (lado * altura)`. Após esse cálculo, é aplicado um desconto de 10% sobre a área total, representando os espaços ocupados por portas e janelas. Por fim, a área com desconto é dividida por `10`, pois cada litro de tinta cobre 10 m², resultando na quantidade de litros necessária para a pintura.

---

## Código Desenvolvido

    import java.util.Scanner;

    public class CalculadoraPintura4261212202 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite a medida do lado do quarto (em metros): ");
            double lado = scanner.nextDouble();

            double altura = 2.70;
            double areaParedes = 4 * (lado * altura);
            double areaComDesconto = areaParedes * 0.90;
            double litrosTinta = areaComDesconto / 10;

            System.out.printf("A quantidade de litros de tinta necessária é: %.2f litros%n", litrosTinta);

            scanner.close();
        }
    }

---

## Estrutura do Projeto

    calculadora-pintura/
    ├── CalculadoraPintura4261212202.java
    └── README.md

---

## Conceitos Utilizados

- entrada de dados com Scanner
- variáveis do tipo double
- operadores matemáticos
- cálculo de área
- aplicação de percentual
- saída formatada com printf
- fechamento do Scanner
- lógica sequencial

---

## Fórmulas Utilizadas

Área total das quatro paredes:

    areaParedes = 4 * (lado * altura)

Aplicação do desconto de 10%:

    areaComDesconto = areaParedes * 0.90

Cálculo da quantidade de litros:

    litrosTinta = areaComDesconto / 10

---

## Exemplo de Execução

Entrada:

    Digite a medida do lado do quarto (em metros): 4

Processamento:

    Altura padrão: 2.70 metros
    Área das paredes: 4 * (4 * 2.70) = 43.20 m²
    Área com desconto: 43.20 * 0.90 = 38.88 m²
    Litros necessários: 38.88 / 10 = 3.888 litros

Saída:

    A quantidade de litros de tinta necessária é: 3.89 litros

---

## Boas Práticas Aplicadas

- código organizado e indentado
- nome de classe relacionado ao exercício
- uso de variáveis com nomes claros
- separação das etapas de cálculo
- uso de comentários explicativos
- saída formatada para duas casas decimais
- fechamento do recurso Scanner após o uso

---

## Como Executar

### Pré-requisitos

- Java JDK instalado

### Compilar

    javac CalculadoraPintura4261212202.java

### Executar

    java CalculadoraPintura4261212202

---

## Conclusão

A atividade permitiu aplicar conceitos básicos de lógica de programação em um problema prático, simulando uma necessidade real de uma empresa de reformas.

O programa atende ao enunciado proposto ao receber uma medida informada pelo usuário, calcular a área das paredes, aplicar o desconto referente a portas e janelas e exibir a quantidade final de litros de tinta necessária.

---

## Autor

Lucas Cota  
Estudante de Análise e Desenvolvimento de Sistemas  
Foco em Backend e Engenharia de Software

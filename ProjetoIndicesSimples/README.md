# Projeto Índices Simples

Projeto introdutório em Java com orientação a objetos. O programa recebe os
resultados já tratados da atividade República dos Dados e apresenta os índices
principais.

## Índices usados

- Total de registros válidos: 316
- Candidato mais citado: Carlos Chave Primária, 83 registros
- Satisfação média: 5,60 de 10
- Tema Saúde: 68 registros

## Fórmulas

Percentual do candidato = quantidade do candidato / total válido x 100

Percentual de Saúde = quantidade de Saúde / total válido x 100

Essas contas são feitas antes da execução do Java, na planilha ou na atividade.
O programa recebe e exibe os valores prontos.

Com os dados da aula:

- Candidato: 83 / 316 x 100 = 26,27%
- Saúde: 68 / 316 x 100 = 21,52%

## Executar

Dentro da pasta `src`:

```text
javac ResultadoIndices.java SistemaIndices.java
java SistemaIndices
```

Escolha a opção 6 para carregar os números da aula e depois a opção 5 para
mostrar o resultado e a conclusão.

## Objetivo didático

O programa pratica classe, objeto, atributos, métodos, encapsulamento, menu,
entrada de dados e apresentação de uma conclusão. O Java não calcula os índices.

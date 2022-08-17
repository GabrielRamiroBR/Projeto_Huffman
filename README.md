# Projeto_Huffman
Projeto da Disciplina de estrutura de Dados 1 para implementação do algoritmo de Huffman e testes de complexidade

Enunciado
Uma aplicação interessante que usa as estruturas de dados Heap Binária e
Árvore Binária, aprendidas em sala de aula, corresponde ao Algoritmo de Huffman para
determinar os Códigos de Huffman [1], que possui grande aplicação na área de
Compressão de Dados. Para este trabalho, pede-se:
1. Deve-se utilizar duas classes apresentadas em sala de aula, com algumas
alterações. Os arquivos MinBinaryHeap.java e Arvbin.java já são
fornecidos com a especificação dos métodos existentes nas classes, mas seus
conteúdos devem ser implementados. O arquivo Main.java deve ser utilizado
conforme fornecido e, portanto, não deve ser alterado.

2. Escrever um relatório definindo o problema e a implementação (funcionalidade
de cada método);

3. Não deixe de relacionar as referências utilizadas ao longo do desenvolvimento
do trabalho;

4. Além da monitoria, as dúvidas do trabalho poderão ser esclarecidas nas aulas de
acompanhamento. Não deixe para tirar suas dúvidas no último momento!

5. Documente qualquer problema que não conseguir resolver;

6. O programa deve ser bem testado!

7. O trabalho deve ser realizado em duplas; e

8. O trabalho deve ser submetido na tarefa criada no Moodle e apresentado
pelos grupos no dia 11/08.

A seguir, um exemplo de execução do arquivo Main.java:
Quantos símbolos?
4
Digite o símbolo e a frequência:
a 70
Digite o símbolo e a frequência:
b 3


Digite o símbolo e a frequência:
c 20
Digite o símbolo e a frequência:
d 37

Heap binária:
v[1] = b 3
v[2] = d 37
v[3] = c 20
v[4] = a 70

Heap binária:
v[1] = 23
v[2] = a 70
v[3] = d 37

Heap binária:
v[1] = 60
v[2] = a 70

Heap binária:
v[1] = 130

Árvore em pré-ordem
( 130 ( 60 ( 23 ( 3 b )( 20 c ) )( 37 d ) )( 70 a ) )

Imprimir os códigos de huffman associados a cada símbolo.
Símbolo: b Codificação: 000
Símbolo: c Codificação: 001
Símbolo: d Codificação: 01
Símbolo: a Codificação: 1

Deve-se apresentar e justificar a complexidade do Algoritmo de Huffman
implementado. Acima de tudo, deve-se executar o código para entradas (conjuntos de
símbolos) de tamanho: 5, 10, 12, 15, 20, 30, 50, 80 e 100. Para cada uma dessas, deve-
se tomar o tempo de execução tomado pelo algoritmo. Dessa forma, pede-se que seja


gerado um gráfico que mostre a variação do tempo de execução do algoritmo pelos
tamanhos de entrada especificados.


# Desenvolvimento de Aplicativos Móveis Acessíveis voltados ao Design Universal | UFABC 2025
## Atividade 11 - IMC App
<br>
<br>
<div align="center">   
<video src="https://github.com/user-attachments/assets/1d83a780-c3f5-4531-87a2-1d8739552078" controls></video>
</div>
<br>
<br>
<b>Sobre a atividade</b> 

Aplicação que calcula o IMC a partir do peso e da altura fornecidos pelo usuário. O app possui duas
```Activities```.

```Activity 1```
Tem os campos ```nome```, ```peso``` e ```altura```
<br>
Exibe o botão ```Resultado do IMC```

```Activity 2```
Com os dados recebidos na ```Activity 1```, o IMC é calculado e exibido na tela com o apoio de um 
gráfico que ilustra a faixa de peso em que a pessoa se encontra a partir do resultado obtido. 

Há o botão ```Voltar```, que retorna para a ```Activity 1```, onde o usuário pode inserir novos 
dados e obter outros resultados.

<b>Pesquisas e Melhorias</b>

Além das aulas desse módulo, realizei pesquisas para ampliar meus conhecimentos neste contexto e
melhorar a experiência de uso deste aplicativo:

<i><b>MainActivity</b></i>

1. ```hint```
    * utilizei outra localização dos campos para adequar o recebimento dos dados
    * o usuário pode utilizar letras maiúsculas ou minúsculas: o tratamento será realizado na 
```Activity 2``` ao exibir o resultado final

<i><b>IMCActivity</b></i>

1. ```peso``` e ```altura``` 
    * os dados foram posicionados lado a lado para facilitar a visualização dos campos

2. ```buttons```
    * os botões ficaram em cor próxima ao preto utilizado na fonte para deixar o design o mais 
suave possível ao usuário, mantendo a acessibilidade do aplicativo

<i><b>Melhorias</b></i>

1. revisar os atributos ```alt``` das imagens e itens de design para Design Universal

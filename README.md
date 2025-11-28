# Desenvolvimento de Aplicativos Móveis Acessíveis voltados ao Design Universal | UFABC 2025

---

## SUMÁRIO

* [Atividade 11 - IMC App](#atividade-11---imc-app)
* [Atividade 12 - MobileDU](#atividade-12---mobiledu)

---
### Atividade 11 - IMC App

```branch:``` https://github.com/inqueen/mobile_ufabc_class11/tree/main

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

### Atividade 12 - MobileDU

```branch:``` https://github.com/inqueen/mobile_ufabc_class11/tree/feature/mobileDU

#### Análise Crítica
1. Quais barreiras de usabilidade o MobileDU ajudou a eliminar no IMCApp?

    A biblioteca tem boas ferramentas para pessoas com baixa visão, hipersensibilidade sonora, 
    daltonismo, entre outras deficiências. 

2. Como as opções de personalização mudaram a percepção de acessibilidade do app?
    
    A partir dos testes que realizei utilizando a biblioteca ```MobileDU``` pude perceber que 
    minha concepção inicial para a composição de cores das ```activities``` necessita de mais 
    previsibilidade para atender os critérios de Acessibilidade. Por exemplo: ao utilizar as 
    configurações disponíveis na bilioteca, mesmo ao resetar após os testes, os botões permaneceram 
    na cor preta, tornando-os inelegíveis. 

3. Quais foram as dificuldades encontradas para inserir a biblioteca no projeto?

    Não tive dificuldades. As instruções foram claras e de rápida implementação no projeto. 

4. Que outras funções você imagina que poderiam ser adicionadas?

    Este exercício foi importante para avaliar que preciso de mais tempo de estudo para enumerar 
    novas funções e identificar as reais necessidades de pessoas com deficiência.

<i><b>Melhorias</b></i>

1. estudar mais sobre a temática da Acessibilidade
2. revisar a paleta de cores `default` do `app` para que estejam de acordo ao utilizar a biblioteca
   `MobileDU`
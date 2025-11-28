# Desenvolvimento de Aplicativos Móveis Acessíveis voltados ao Design Universal | UFABC 2025

## SUMÁRIO

* [Atividade 11 - IMC App](#atividade-11---imc-app)
* [Atividade 12 - MobileDU](#atividade-12---mobiledu)
* [Atividade 13 - Desenvolvimento Mobile e Acessibilidade](#atividade-13---desenvolvimento-mobile-e-acessibilidade)

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

### Atividade 13 - Desenvolvimento Mobile e Acessibilidade
#### Análise Crítica

_Releia os textos das Aula 6 (Requisitos de Acessibilidade) e da Aula 8 (uso da biblioteca 
MobileDU) e em seguida, responda criticamente às questões abaixo:_

1. <b>Empatia e responsabilidade:</b>

Em que medida o desenvolvedor é também um agente de cidadania digital ao projetar um aplicativo com 
base no Design Universal?

    Atualmente, a pessoa desenvolvedora tem uma responsabilidade social implícita uma vez que 
    constrói produtos digitais desejados e utilizados por pessoas no mundo todo, em muitos casos.
    Estar atento e disposto a solucionar problemas e derrubar barreiras de acesso aos produtos 
    digitais é essencial a pessoa devenvolvedora no dias de hoje.   

Quais dilemas éticos e técnicos surgem ao tentar equilibrar estética, performance e inclusão?

    A discussão só se faz presente porque estamos em um sistema econômico baseado na exploração e 
    na obtenção do lucro a qualquer custo e na maior velocidade possível. O dilema ético só existe 
    quando a pessoa desenvolvedora está em um contexto onde a Acessibilidade é deixada de lado por 
    lideranças pouco afeitas ao coletivo e a incompreensão de seus próprios privilégios.      

2. <b>Do conceito à implementação:</b>

Considerando os princípios do DU e as diretrizes de personalização do usuário, recursos como 
o modo de contraste, controle de voz e personalização textual podem ser entendidos como expressões 
práticas da equidade de acesso?

    Sim, o DU proporciona um convite efetivo ao mundo digital e deve ser encarado como critério 
    mínimo de desenvolvimento em qualquer tipo de aplicação. O desafio está na conscientização e 
    aplicação do DU em um contexto básico em qualquer entrega de produto digital. O mesmo desafio 
    está posto na estrutura urbana, por exemplo: em uma via pública é necessário que calçadas 
    tenham piso tátil e rebaixamento do calçamento para o trânsito de pessoas cegas, cadeirantes e 
    famílias com crianças em carrinhos de passeio. Houve muitos ganhos com a visibilidade do tema 
    da Acessibilidade em vários setores da sociedade, principalmente no setor público. O debate e 
    o enfrentamento devem permanecer por um bom tempo para que o que vemos hoje no mundo físico, 
    chegue também ao mundo digital.

<b>Proposição criativa:</b>

Imagine um recurso acessível que você implementaria em um app real. Descreva-o brevemente e 
justifique como ele incorpora pelo menos dois princípios do Design Universal (ex.: uso equitativo, 
flexibilidade de uso, informação perceptível, tolerância a erros).

    Para aplicativos que utilizam reconhecimento facial no processo de login do usuário, tornar 
    obrigatória a instrução também por som para guiar o usuário em todas as etapas que envolvam sua 
    face capturada pela câmera do celular. Uma vez que pessoas com deficiência visual ou baixa 
    acuidade visual, não importando o motivo, têm dificuldades reais ao fazer essa etapa, pois nem
    os óculos são permitidos nessas ferramentas. Ao mesmo tempo, defender regulamentações que 
    protejam de forma ampla e irrestrita os dados faciais e extremamente sensíveis que circulam em
    bancos de dados de empresas privadas e que, em um vazamento, podem trazer riscos e danos 
    patrimoniais serveros aos usuários.  

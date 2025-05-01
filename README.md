Aplicação de APS 4º semestre de ciência da computação 2016 - Nota 9,5 


Tela inicial 
Exibe todas as opções disponíveis na aplicação sendo elas: Iniciar, Regras, Ranking e Sair.
 
Ao clicar na tela iniciar será exibido a tela acima que fica em pausa até que o usuário clique sobre o botão começar para dar início ao quiz ou abandonar para voltar a tela inicial, a tela exibe no canto superior direito quantidade de perguntas inicial / total de perguntas a serem respondidas, no centro da tela apenas o informativo de inicialização da aplicação.
No canto inferior da janela é exibido o tempo decorrido, sendo 60 segundos o tempo máximo para responder, nesta informação a contagem tem como a usabilidade visual a mudança de cor do cronometro ao chegar nos 30´s (Laranja) e 50´s (Vermelho), e logo ao seu lado exibe o campo pontuação.
 
Após clicar em iniciar será exibido a questão a ser respondida e as opções de resposta, sendo que só avançará para próxima pergunta após clicar em uma das duas opções disponíveis, como exibido na imagem abaixo:
 
Se por algum motivo o usuário não se atente ao tempo decorrido, a pergunta não será computada e será exibido a opção pular pergunta e o aviso de tempo esgotado, conforme a tela abaixo:
 
 
Se o usuário optar em alguma das duas opções será exibido mensagem de aviso confirmando se a opção desejada é a que deseja que aplicação corrija.
 
Ao final das 20 (Vinte) questões será exibido informativo para que o usuário caso opte queira salvar sua pontuação na aplicação, se optar em clicar na opção SIM, será redirecionado para tela de cadastro, caso opte por NÃO salvar, será redirecionado para a tela inicial novamente.
 
Se o usuário optar em salvar sua pontuação será exibido tela acima, com a opção de inserir o seu nome, e a pontuação alcançada, caso ainda o usuário não deseje salvar sua pontuação deverá clicar em sair e retornará a tela inicial.


Configuração Personalizada de perguntas
 
Na tela inicial no seu canto superior direito é exibido um ícone no formato de uma engrenagem, está é a opção de personalização das perguntas geradas pelo Quiz Ambiental, ao clicar será exibido uma tela de login, apenas para inibir a alteração acidental por usuários desavisados, abaixo a tela que será exibido ao clicar sobre o ícone de personalização.
 
O usuário e senha a ser digitado é ADMIN, e clique sobre o botão autenticar.
 
Ao autenticar, será exibido a tela acima com a opção de digitar a pergunta e resposta correta, e inserir também a pontuação que deseja ter a pergunta inserida.
A tela de personalização efetua as seguintes opções: novo cadastro, pesquisar cadastro e atualizar cadastro, todas as opções sempre é exibida pela aplicação a tela informativo de confirmação das ações efetuadas.
Tela de regras
 
A tela de regras exibe um resumo rápido exibindo as funções dos botões e informações em geral da aplicação, para sair da tela de regras apenas deverá clicar no botão voltar.

Tela Ranking
 
A tela Ranking exibe todos os usuários que optaram em salvar suas pontuações, na tela é exibido botão voltar que retornara a tela inicial.
Diagrama de Classe 
Abaixo o diagrama UML da aplicação em sua visão geral exibindo as suas conexões entre elas, que está incluso no projeto final versão arquivo.
 


Arvore do projeto
Abaixo visão geral de pacotes elaborados dentro do projeto. 
Sendo apresentação, estão todos os forms do projeto; classes, estão todas as classes personalizadas da aplicação; DAL e Modelo estão as classes MVC; Imagens, estão todas as imagens utilizadas e Meta-Inf que é a pasta gerada pelo evento de vínculamento da tabela ranking gerada pela aplicação.



Diagrama banco de dados
Abaixo é demostrado as tabelas utilizadas na base de dados, sendo ela bem simples, pois apenas armazena as perguntas, respostas, pontos, jogadores e suas pontuações, existe apenas uma chave estrangeira em a tabela resposta e pergunta.
 
Documentação completa está na pasta DOCS_APP



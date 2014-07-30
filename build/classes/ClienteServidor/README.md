ClienteServidor
===============

projeto integrador

NºComponenteNºOperacao#CAMPO1#CAMPO2#CAMPO3#...#

INSERÇÃO: EX: 11#Edson#3432-0932#123322#...#

RESPOSTA NºResposta#ID#

NºComponenteNºOperacao#ID#CAMPO1#CAMPO2#CAMPO3#...#

ALTERAÇÃO: EX: 12#2#Edson#3432-0932#123322#...#

RESPOSTA NºResposta#

NºComponenteNºOperacao#ID#

DELEÇÃO: EX: 13#2#

RESPOSTA NºResposta#

NºComponenteNºOperacao#NOME#

CONSULTAR: EX: 14#Edson#

RESPOSTA NºResposta#TUPLA1#TUPLA2#...#

ID DO MODULO
1 - Alunos
2 - Professor
3 - Disciplinas
4 - Salas
5 - Aulas

ID DA OPERAÇÃO
1 - INSERIR
2 - ALTERAR
3 - DELETAR
4 - CONSULTAR

(ainda em atualização)
ID DA RESPOSTA DO SERVIDOR
0 - CERTO
1 - ERRO MENSAGEM BROADCAST
2 - ERRO BANCO DE DADOS(NÃO CONSEGUIU TERMINAR OPERAÇÃO NO BANCO)

Instalacao do plugin checkstyle(padrão de codificacao) para Netbeans
=======

1)Siga os passos abaixo.

3)Abra a pagina para download http://www.sickboy.cz/checkstyle/download.html.

2)Em "Offline Installation", baixe um dos pacotes de "NetBeans 7/8 and Checkstyle 5.7 support".

3)Descompacte.

4)No Netbeans, va em Ferramentas->plug-ins->Obtidos por Download->Adicionar Plug-ins.

5)Next...next...

6)De volta a janela Plug-ins, va em Instalados e verifique se o plugin Checkstyle Beans
Library esta marcado como ativo.

Apos alguns segundos o plugin estara funcionando, ele ira exibir uma tag ao lado das linhas do seu codigo que
estiverem fora do padrão de codificacao.

Instacao do plugin JaCoCoverage(Cobertura de codigo testado) para Netbeans
=======

1)Siga os passos abaixo.

2)No Netbeans, va em Ferramentas->plug-ins->Pesquisar->"JaCoCoverage"->Instalar.

Para executar

Clique com o botão direito sobre o projeto e va na opcao "Test with JaCoCoverage".

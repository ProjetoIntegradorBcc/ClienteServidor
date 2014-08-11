ClienteServidor
===============

projeto integrador


INSERIR
NºComponenteNºOperacao#CAMPO1#CAMPO2#CAMPO3#...#

INSERÇÃO: EX: 11#Edson#3432-0932#123322#...#

RESPOSTA NºResposta#ID#


ALTERAR
NºComponenteNºOperacao#ID#CAMPO1#CAMPO2#CAMPO3#...#

ALTERAÇÃO: EX: 12#2#Edson#3432-0932#123322#...#

RESPOSTA NºResposta#


DELETAR
NºComponenteNºOperacao#ID#

DELEÇÃO: EX: 13#2#

RESPOSTA NºResposta#


CONSULTAR: Retorna todos os dados de um determinado id
NºComponenteNºOperacao#ID#

CONSULTAR: EX: 14#10#

RESPOSTA NºResposta#TUPLA#


BUSCAR: Retorna alguns campos relevantes do modulo(nome, ra...)
NºComponenteNºOperacao#

BUSCAR: EX: 15#

RESPOSTA NºResposta#CAMPO1A#CAMPO1B#CAMPO2A#CAMPO2B...#

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
5 - BUSCAR

(ainda em atualização)
ID DA RESPOSTA DO SERVIDOR
0 - CERTO
1 - ERRO MENSAGEM BROADCAST
2 - ERRO BANCO DE DADOS(NÃO CONSEGUIU TERMINAR OPERAÇÃO NO BANCO)

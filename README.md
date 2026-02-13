Projeto: adm-contas

Crie uma conta Bancária com os seguintes atributos
int numero;
String dono;
double saldo;
double limite;
- Crie um método que imprima todos os atributos de uma conta
- Crie 3 contas, adicione dados e imprima todos os dados

Lidar com mais de uma conta (Use o Scanner)
2.1- Quando o sistema iniciar alimente duas conta bancárias com dados informados pelo usuário
2.2 - Imprima todos os dados

1- Operando Conta
1.1- Continua recebendo os dados das duas contas
1.2- Pergunte ao usuário qual conta ele deseja operar
1.3- Quando selecionada deve exibir o saldo da conta e em seguida volta para o Passo 1.2
==== OPÇÕES ====
1. Ver Saldo

Validação 1: Caso seja informada uma opção invalida, a mensagem "Opção Inválida" deve ser exibida e em seguida voltar para Passo 1.2

2- Depositar Valor
Após escolher a conta, o usuário terá o seguinte menu
==== OPÇÕES ====
1. Ver Saldo
2. Depositar

Ao Escolher a opção 2, deve ser pedido o valor que será depositado na conta e o valor será adicionado ao saldo, em seguida voltar para Passo 1.2.
Validação 2: não pode ser menor ou igual a zero, caso seja informado um valor inválido, a seguinte mensagem deve ser exibida: "Valor Inválido" e em seguida voltar para Passo 1.2

3- Sacar Valor
Após escolher a conta, o usuário terá o seguinte menu
==== OPÇÕES ====
1. Ver Saldo
2. Depositar
3. Sacar

Ao Escolher a opção 3, deve ser pedido o valor que será sacado da conta e o valor será subtraído do saldo, em seguida voltar para Passo 3.2.
Validação 3: O Valor não pode ser menor ou igual a zero, caso seja informado um valor inválido, a seguinte mensagem deve ser exibida: "Valor Inválido" e em seguida voltar para Passo 1.2
Validação 4: O valor não pode ser maior que o limite, caso seja informado um valor acima do limite, a seguinte mensagem deve ser exibida: "Excede o limite permitido" e em seguida voltar para Passo 1.2
Validação 5: O valor não pode ser maior que o saldo, caso seja informado um valor acima do saldo, a seguinte mensagem deve ser exibida: "Saldo Insuficiente" e em seguida voltar para Passo 1.2

4- Transferir Valor
Após escolher a conta, o usuário terá o seguinte menu
==== OPÇÕES ====
1. Ver Saldo
2. Depositar
3. Sacar
4. Transferir

Ao Escolher a opção 4, deve ser solicitado o numero da conta de destino, em seguida o valor que será transferido, o valor deverá ser subtraído da conta de origem e adicionado ao saldo da conta de destino, em seguida voltar para Passo 1.2.
As validações 3,4 e 5 devem ser realizadas
Validação 6: A conta de destino deve ser validada, caso não exista deve exibir a seguinte mensagem "A conta de Destino é Inválida", em seguida voltar para Passo 1.2

5- Extrato (Lista do tipo String dentro da conta para armazenar as transações)
O sistema deve permitir que o usuário veja todas as transações realizadas.
Após escolher a conta, o usuário terá o seguinte menu
==== OPÇÕES ====
1. Ver Saldo
2. Depositar
3. Sacar
4. Transferir
5. Extrato

Ao escolher a opção 5, o usuário deverá ver todos os lançamentos que foram realizados na conta, deve ser uma lista de valores String com a seguinte forma
+10.12 Deposito
-50.48 Saque 
-10.00 Transferência para a Conta X
-------
150,00 Saldo Final

6- Cadastrar Conta (Passar a usar lista)
O sistema deve permitir a existência de várias contas.
Após escolher a conta, o usuário terá o seguinte menu
==== OPÇÕES ====
1. Ver Saldo
2. Depositar
3. Sacar
4. Transferir
5. Extrato
6. Cadastrar Conta

Ao escolher a opção 6, os passos na questão 1 devem ser realizados e uma nova conta deve estar disponível para o usuário, em seguida voltar para Passo 1.2
Validação 7: Todos os dados devem ser informados, caso algum não seja informados, deve exibir a seguinte mensagem "Dados da Conta Inválidos", em seguida voltar para Passo 1.2. O numero deve ter mais de um caractere, dono deve ter pelo menos 2 caracteres, o saldo deve ser maior ou igual a zero e o limite deve ser maior que zero.
Validação 8: Os números das contas não devem se repetir, caso seja informado um número existente, deve exibir a seguinte mensagem "Conta já existente", em seguida voltar para Passo 1.2

7- Encerrar Conta
O sistema deve permitir que uma conta deixe de existir.
Após escolher a conta, o usuário terá o seguinte menu
==== OPÇÕES ====
1. Ver Saldo
2. Depositar
3. Sacar
4. Transferir
5. Extrato
6. Cadastrar Conta
7. Encerrar Conta
Ao escolher a opção 7, o usuário deverá informar o número de uma conta e ela devera deixar de existir, em seguida voltar para Passo 1.2
Validação 9: A conta deve existir, caso seja informado um número inexistente, deve exibir a seguinte mensagem "Conta Não encontrada", em seguida voltar para Passo 1.2

8- Imprimir Extrato Fisico
O sistema deve permitir a impressão de um arquivo CSV com conteúdo do extrato.
Após escolher a conta, o usuário terá o seguinte menu
==== OPÇÕES ====
1. Ver Saldo
2. Depositar
3. Sacar
4. Transferir
5. Extrato
6. Cadastrar Conta
7. Encerrar Conta
8. Exportar Extrato
Ao escolher a opção 8, o sistema deverá criar um arquivo no computador com todo o extrato da conta em formato csv, o nome do arquivo deve seguir o padrão YYYY_MM_DD-NUMERO_CONTA.csv.

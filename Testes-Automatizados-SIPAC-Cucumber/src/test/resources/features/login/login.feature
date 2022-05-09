#language: pt

@login
Funcionalidade: Login

	Contexto:
		Dado um usuario na pagina de login
    
	@login
  Cenario: Tentar logar sem credenciais
    Dado um usuario que nao possui credenciais 
    Quando deixar os campos em branco
    E clica em entrar
    Entao o usuario deve permanecer na paina de login
    E a mensagem de erro "Informe o login do usu�rio" deve aparecer
    #Informe a senha do usu�rio

	@login
  Cenario: Tentar logar com as credenciais incorretas
    Dado um usuario que possui as credenciais incorretas
    Quando preenche os campos com as credenciais incorretas
			| login     | senha        |
			| invalido  | Coutinho.123 |
			| tcoutinho | invalido     |
    E clica em entrar
    Entao o usuario deve permanecer na paina de login
    E a mensagem de erro "Usu�rio e/ou senha inv�lidos" deve aparecer
    
  @login
  Cenario: Logar com as credenciais corretas
    Dado um usuario que possui as credenciais corretas
    Quando preenche os campos com as credenciais corretas
    	| login     | senha        |
			| tcoutinho | Coutinho.123 |
    E clica em entrar
    Entao o usuario deve ser redirecionado para a pagina inicial do sipac
    E deve ser mostrado como usuario logado
    
  


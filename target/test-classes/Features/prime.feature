#language: pt

Funcionalidade: Cadastrar curriculo no site
  Eu como usuaria quero acessar o site da prime control para cadastrar um curriculo

  
  Cenario: Preencher formulário de cadastrar currículo
    Dado que acessou ao site "https://www.primecontrol.com.br"
    
    Quando Selecionar a opção "contato" e apertar o botão “Cadastre seu currículo”
    
    E preencher todos os dados com as suas informações válidas, anexando um curriculo
   
    Então o site demonstra a mensagem de cadastro com sucesso.
   
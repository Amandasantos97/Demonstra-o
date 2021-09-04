package testes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import elementos.Elementos;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Então;
import io.cucumber.messages.internal.com.google.protobuf.Value;
import pages.Metodos;

public class Steps {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	@Dado("que acessou ao site {string}")
	public void que_acessou_ao_site(String site) {
		metodos.abrirNavegador(site);
		

	}

	@Quando("Selecionar a opção {string} e apertar o botão “Cadastre seu currículo”")
	public void selecionar_a_opção_e_apertar_o_botão_cadastre_seu_currículo(String string) throws InterruptedException {
	metodos.clicar2(el.getMenu());
	metodos.clicar2(el.getContato());
		Thread.sleep(2000);
		metodos.clicar2(el.getCadastrcurrilo());
	
	

	}

	@Quando("preencher todos os dados com as suas informações válidas, anexando um curriculo")
	public void preencher_todos_os_dados_com_as_suas_informações_válidas_anexando_um_curriculo() throws InterruptedException {
	  metodos.segundaP();
	  metodos.esperar(1000);
	  metodos.suitto();
	  metodos.esperar(1000);	  
		metodos.escrever(el.getName(), "Amanda Santos");
		metodos.escrever(el.getCargo(), "Analista de testes");
		metodos.escrever(el.getSalario(), "7000");
		metodos.escrever(el.getEmail(), "amandenha1997@outlook.com");
		metodos.escrever(el.getTelefone(), "11971841044");
		metodos.clicar2(el.getPais());
		metodos.escrever(el.getPais(), "BRASIL");
		metodos.escrever(el.getEstado(), "São Paulo");
		metodos.escrever(el.getCidade(), "São Paulo");
		metodos.escrever(el.getBairro(), "Jardim Santa Maria");
		metodos.escrever(el.getEndereço(), "Rua açaí, 512");
		metodos.escrever(el.getCep(), "03574000");
		metodos.escrever(el.getSumario(), "Profissional hands-on com facilidade em absorver novos conhecimentos em tecnologia e regras de negócio. ");
		metodos.clicar2(el.getFormacao());
		metodos.escrever(el.getEnsino(), "TÉCNICO");
		metodos.escrever(el.getCurso(), "Agile Test");
		metodos.escrever(el.getEscola(), "E2E Treinamentos");		
		metodos.clicar2(el.getFormac());
		metodos.clicar2(el.getData());
		metodos.clicar2(el.getPrevi());
		metodos.clicar2(el.getAno());
		metodos.clicar2(el.getSetembro());
		metodos.clicar2(el.getClick());
		metodos.clicar2(el.getRemover());
						
		metodos.clicar2(el.getExperiencia());
		metodos.escrever(el.getEmpresa(), "E2E Coders");
		metodos.escrever(el.getPosicao(), "Analista de Teste");
		metodos.escrever(el.getAtividades(), "Levantamento de casos de testes, API, testes regressivos, manuais e automatizados");		
		metodos.clicar2(el.getData1());
		metodos.clicar2(el.getData2());
		metodos.clicar2(el.getMaio());
			
		metodos.esperar(500);		
		metodos.clicar2(el.getCheck());
		metodos.clicar2(el.getRedes());
		metodos.escrever(el.getLinkedin(), "https://www.linkedin.com/in/amanda-de-lima-a47541206/");
		metodos.enviarCurriculo();
		metodos.clicar2(el.getValidar());
		metodos.clicar2(el.getFinalizar());
		
		
		
		
		
		
		
		
		

		
		
		
		

	}

	@Então("o site demonstra a mensagem de cadastro com sucesso.")
	public void o_site_demonstra_a_mensagem_de_cadastro_com_sucesso() {

	}

}

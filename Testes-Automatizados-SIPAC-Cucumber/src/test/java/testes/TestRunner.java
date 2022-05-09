package testes;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(
		features = {
				}, 
		
		tags = "",
		glue = "",
				
		monochrome = true, 
		dryRun = false,
		plugin = {"pretty"},
		//lexical, reverse, random or random:[seed] (CLI only). default: lexical
		
		//e voc� estiver usando o Cucumber com uma estrutura de 
		//DI e quiser usar uma f�brica de objetos personalizada
		//objectFactory = FooFactory.class
		
		stepNotifications = true)

public class TestRunner{
}

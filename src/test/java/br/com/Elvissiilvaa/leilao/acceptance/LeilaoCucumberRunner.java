package br.com.Elvissiilvaa.leilao.acceptance;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// Aqui é feito a integração do cucumber e do JUNIT

@RunWith(Cucumber.class) // Anotação do JUNIT que faz integração entre ambos. junt e cucumber
@CucumberOptions(features = "classpath:features", tags = "@leilao")
public class LeilaoCucumberRunner {

}

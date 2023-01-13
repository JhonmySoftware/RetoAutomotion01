package co.com.choucair.screenplay.runners;

import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features"
        , snippets = SnippetType.CAMELCASE
        , tags = "@HistoriaDeUsuario"
        , glue = "co.com.choucair.screenplay.definition")

public class RunnerTags {

}

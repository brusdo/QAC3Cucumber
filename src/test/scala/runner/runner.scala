package runner

import io.cucumber.junit.{Cucumber, CucumberOptions}
import org.junit.runner.RunWith

@RunWith(classOf[Cucumber])
@CucumberOptions(
  features   = Array("src/test/resources/features"),            //route to get the feature file
  glue       = Array("stepdefs", "support"),
  plugin     = Array("pretty",
    "html:target/cucumber-report.html"),    //repo generation to get the report
  monochrome = true
//  tags = "@smoke or @wip
)
class runner // an empty class body is OK
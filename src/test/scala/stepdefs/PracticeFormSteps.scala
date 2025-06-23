package stepdefs

import io.cucumber.scala.{EN, ScalaDsl}
import org.openqa.selenium.{By, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver

class login extends ScalaDsl with EN {

  val driver: WebDriver = new ChromeDriver() //keep at top level so everything has access.

  //Each of these is a step definition
  Given("""the user is on the login page""") { () =>
    // Write code here that turns the phrase above into concrete actions
    driver.get("https://parabank.parasoft.com/parabank/index.html")
  }

  When("""the user enters a valid username and password""") { () =>
    val userName: WebElement = driver.findElement(By.name("username"))
    userName.sendKeys("jonh")
    val password: WebElement = driver.findElement(By.name("password"))
    password.sendKeys("demo")
  }

  And("""the user clicks the login button""") { () =>
    val submitButton = driver.findElement(By.cssSelector("input[type='submit']"))
    submitButton.click()
    Thread.sleep(2000)
  }

  Then("""the user should be logged in successfully""") { () =>
    val checkPageTitle = driver.findElement(By.tagName("h1")).getText
    println("Page Title: " + checkPageTitle) //Just using to visualise the text returned prior to method.
    if (checkPageTitle == "Accounts Overview") println("Logged in!")
    else println("Issue...")
  }
}

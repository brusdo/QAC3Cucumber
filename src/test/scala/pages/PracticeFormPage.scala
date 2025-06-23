package stepdefs

import org.openqa.selenium.{WebDriver, WebElement}
import org.openqa.selenium.support.{FindBy, PageFactory}
import org.openqa.selenium.support.ui.Select

case class PracticeFormPage(driver: WebDriver) {
//  PageFactory.initElements(driver, this)

  // Locators
  @FindBy(name = "firstname") private var firstName: WebElement = _
  @FindBy(name = "lastname") private var lastName: WebElement = _
  @FindBy(id = "sex-0") private var maleGender: WebElement = _
  @FindBy(id = "exp-6") private var expRadio: WebElement = _ // 7 years experience
  @FindBy(id = "datepicker") private var dateField: WebElement = _
  @FindBy(id = "profession-1") private var automationProfession: WebElement = _
  @FindBy(id = "continents") private var continentDropdown: WebElement = _
  @FindBy(id = "photo") private var fileUpload: WebElement = _
  @FindBy(id = "submit") private var submitButton: WebElement = _

  // Interaction methods
  def setFirstName(name: String): Unit = firstName.sendKeys(name)
  def setLastName(name: String): Unit = lastName.sendKeys(name)
  def selectMale(): Unit = maleGender.click()
  def selectExperience(): Unit = expRadio.click()
  def setDate(date: String): Unit = dateField.sendKeys(date)
  def selectAutomationProfession(): Unit = automationProfession.click()
  def selectContinent(continent: String): Unit =
    new Select(continentDropdown).selectByVisibleText(continent)
  def uploadFile(filePath: String): Unit = fileUpload.sendKeys(filePath)
  def clickSubmit(): Unit = submitButton.click()
}
package pages

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.springframework.stereotype.Component

@Component
class GooglePage(driver: WebDriver) : Page(driver, "http://www.google.com") {

    @FindBy(css = "input#lst-ib")
    lateinit var searchInput : WebElement

    @FindBy(css = "input[name=btnK]")
    lateinit var searchButton : WebElement

    fun search(text: String): GoogleResultPage {
        searchInput.sendKeys(text)
        searchButton.submit()
        return GoogleResultPage(driver)
    }
}
package pages

import org.openqa.selenium.WebDriver
import org.openqa.selenium.support.PageFactory

abstract class Page(val driver: WebDriver, val url: String) {

    init {
        PageFactory.initElements(driver, this)
    }

    fun open() = this.driver.get(url)

    fun close() = this.driver.close()

    fun title() = this.driver.title
}
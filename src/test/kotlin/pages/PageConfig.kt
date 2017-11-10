package pages

import org.openqa.selenium.chrome.ChromeDriver
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan("pages")
open class PageConfig {

    @Bean
    open fun createChromeWebDriver() = ChromeDriver()

}
package foo

import cucumber.api.java8.Pt
import org.assertj.core.api.Assertions.assertThat
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import pages.PageConfig
import pages.GooglePage
import pages.GoogleResultPage

@ContextConfiguration(classes = arrayOf(PageConfig::class) )
class HelloStepDefs : Pt {

    @Autowired
    lateinit var googlePage: GooglePage

    lateinit var resultPage: GoogleResultPage

    init {
        Dado("^a pagina do google aberta$") {
            googlePage.open()
        }

        Quando("^procurar por diego$") {
            resultPage = googlePage.search("diego")
        }

        Entao("^deve mostrar o resultado de busca diego$") {
            assertThat(googlePage.title()).isEqualTo("diego - Pesquisa Google")
            googlePage.close()
        }

    }

}
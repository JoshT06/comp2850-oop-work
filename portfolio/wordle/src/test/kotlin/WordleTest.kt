import io.kotest.assertions.withClue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

@Suppress("unused")
class WordleTest : StringSpec({
    "Getting list of words from the text file"{
        withClue("x(0)=ABACK") {x(0) shouldBe "ABACK"}
        withClue("x(2314)=ZONAL") {x(2314) shouldBe "ZONAL"}
        withClue("x(1000)=HOWDY") {x(1000) shouldBe "HOWDY"}
    }
})

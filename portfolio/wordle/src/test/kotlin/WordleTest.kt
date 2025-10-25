import io.kotest.assertions.withClue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

@Suppress("unused")
class WordleTest : StringSpec({
    "Getting list of words from the text file"{
        val wawa = readWordList("/workspaces/comp2850-oop-work/portfolio/wordle/data/words.txt")
        withClue("x(0)=ABACK") {wawa[0] shouldBe "ABACK"}
        withClue("x(2314)=ZONAL") {wawa[2314] shouldBe "ZONAL"}
        withClue("x(1000)=HOWDY") {wawa[999] shouldBe "HOWDY"}
    }
    "Checking user input is valid"{
        withClue("Green is valid") {isValid("Green")}
        withClue("green is valid") {isValid("green")}
        withClue("GREEN is valid") {isValid("GREEN")}
        withClue("Grey is invalid") {isValid("Grey")}
        withClue("Orange is invalid") {isValid("Orange")}
        withClue("12345 is invalid") {isValid("12345")}
    }
    "Checking random word is removed from list"{
    }
})

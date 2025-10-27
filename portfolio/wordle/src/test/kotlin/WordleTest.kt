import io.kotest.assertions.withClue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import kotlin.random.Random

@Suppress("unused")
class WordleTest : StringSpec({
    "Getting list of words from the text file"{
        val wawa = readWordList("/workspaces/comp2850-oop-work/portfolio/wordle/data/words.txt")
        withClue("x(0)=ABACK") {wawa[0] shouldBe "ABACK"}
        withClue("x(2314)=ZONAL") {wawa[2314] shouldBe "ZONAL"}
        withClue("x(1000)=HOWDY") {wawa[999] shouldBe "HOWDY"}
    }
    "Checking user input is valid"{
        withClue("Green is valid") {val result = isValid("Green"); result shouldBe true}
        withClue("green is valid") {val result = isValid("green"); result shouldBe true}
        withClue("GREEN is valid") {val result = isValid("GREEN"); result shouldBe true}
        withClue("Grey is invalid") {val result = isValid("Grey"); result shouldBe false}
        withClue("Orange is invalid") {val result = isValid("Orange"); result shouldBe false}
        withClue("12345 is invalid") {val result = isValid("12345"); result shouldBe false}
    }
    "Checking random word is from list"{
        val wawa = readWordList("/workspaces/comp2850-oop-work/portfolio/wordle/data/words.txt")
        val answer = wawa[Random.nextInt(0, wawa.size)]
        withClue("Word is in list") {wawa.contains(answer) shouldBe true} 
    }
    "Checking evaluation is correct"{
        val answer = "BEANS"
        withClue("All correct") {evaluateGuess("BEANS", answer) shouldBe mutableListOf(1,1,1,1,1)}
        withClue("None correct") {evaluateGuess("GREEN", answer) shouldBe mutableListOf(0,0,0,0,0)}
        withClue("Some correct") {evaluateGuess("BEERS", answer) shouldBe mutableListOf(1,1,0,0,1)}
    }
})


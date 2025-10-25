fun main() {
    var words = readWordList("/workspaces/comp2850-oop-work/portfolio/wordle/data/words.txt")
    val randomWord = pickRandomWord(words) 
    var guesses = 1

    while (guesses <= 10) {
        val guess = obtainGuess(guesses)
        val correctness = evaluateGuess(guess, randomWord)  
        displayGuess(guess, correctness)
        if (guess == randomWord) {
            println("Congrats! You got it right in $guesses guesses!")
        } 
        guesses+=1
        if (guesses > 10){
            println("Too bad! The word was $randomWord")
        }
    }
}

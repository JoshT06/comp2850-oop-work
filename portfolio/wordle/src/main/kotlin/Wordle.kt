import java.io.File
import kotlin.random.Random


fun isValid(word: String): Boolean{
    var valid = true
    if (word.length != 5) {
        valid = false
    }
    for (each in word) {
        if (each.isLetter() == false){
            valid = false
        }
    }
    return valid
}

fun readWordList(words: String): MutableList<String>

= File(words).readLines().toMutableList()

fun pickRandomWord(words: MutableList<String>): String {
    val answer = words[Random.nextInt(0, words.size)]
    words.remove(answer)
    return answer
}

fun obtainGuess(attempt: Int): String{
    println("Attempt $attempt: ") 
    var guess: String
    do {
        println("Input a valid word")
        guess = readln().uppercase()
    }
    while (isValid(guess) == false)
    return guess
}

fun evaluateGuess(guess: String, target: String): MutableList<Int>{
    var matches = mutableListOf(0,0,0,0,0)
    for (each in 0..4) { 
        if (guess[each] == target[each]) {
            matches[each] = 1
         }
    }
    return matches
}

fun displayGuess(guess: String, matches: MutableList<Int>){
    var display = mutableListOf("?","?","?","?","?")
    for (each in 0..4){
        if (matches[each] == 1){
            display[each] = guess[each].toString()
        }
        else{
            display[each] = "?"
        }
    }
    println(display.toString())


}
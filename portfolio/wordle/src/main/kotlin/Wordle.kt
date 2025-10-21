import java.io.File


/*isValid(word: String): Boolean{

}*/

fun readWordList(words: String): MutableList<String>

= File(words).readLines().toMutableList()

/*pickRandomWord(words: MutableList<String>): String{

}

obtainGuess(attempt: Int): String{

}

evaluateGuess(guess: String, target: String): List<Int>{

}

displayGuess(guess: String, matches: List<Int>){

}*/
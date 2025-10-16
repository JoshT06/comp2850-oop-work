
infix fun String.anagram(str: String) = this.lowercase().toList().sorted() == str.lowercase().toList().sorted()  

fun main(){
    val first = readln()
    val second = readln()
    if (second anagram first) {
        println("$first and $second are anagrams!") 
    }   
    
}
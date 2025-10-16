fun String.tooLong() = this.length >= 20

fun main(){
    println("Type stuff")
    val x = readln()
    val y = x.tooLong()
    println(y) 
}

import kotlin .random.Random
import readIntz

fun rollDiez(sides: Int = 6) {
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        println("Rolling a d$sides...")
        val result = Random.nextInt(1, sides + 1)
        println("You rolled $result")
    }
    else {
        println("Error: cannot have a $sides-sided die")
    }
}

fun readIntz(): String {
    println("Input die you want to use")
    val input = readln() 
    return input
}

fun main(){
    rollDiez(4)
    rollDiez(6)
    rollDiez(20)
    val x = readIntz()
    if (x != "" && x.toInt() in listOf(4,6,8,10,12,20)){
        rollDiez(x.toInt())
    }
    else { 
        rollDiez()
    }
}
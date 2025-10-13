import kotlin .random.Random
import readInt

fun rollDie(sides: Int) {
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        println("Rolling a d$sides...")
        val result = Random.nextInt(1, sides + 1)
        println("You rolled $result")
    }
    else {
        println("Error: cannot have a $sides-sided die")
    }
}

fun readInt(): Int {
    println("Input die you want to use")
    val input = readln().toInt()
    return input
}

fun main(){
    rollDie(4)
    rollDie(6)
    rollDie(20)
    val x = readInt()
    if (x in listOf(4,6,8,10,12,20)){
        rollDie(x)
    }
}
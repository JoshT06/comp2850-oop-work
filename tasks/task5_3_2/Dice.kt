import kotlin .random.Random

fun rollDice(sides: Int = 6, rolls: Int = 1) {
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        repeat(rolls){
            println("Rolling a d$sides...")
            val result = Random.nextInt(1, sides + 1)
            println("You rolled $result")
        }
    }
    else {
        println("Error: cannot have a $sides-sided die")
    }
}

fun main(){
    var x: Int
    var y = 1
    rollDice()
    x = 1
    do {
        if (x in listOf(4,6,8,10,12,20)){ 
           rollDice(x)
        }
        else { 
           rollDice()
        }
        x+=1  
        y+=1
    }
    while (x<=10)
}


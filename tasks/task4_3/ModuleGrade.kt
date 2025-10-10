import kotlin.system.exitProcess
import kotlin.math.roundToInt
fun main(args: Array<String>){

    if (args.size != 3) {
        println("Error: Please enter 3 integers.")
        exitProcess(1)
    }

    val average = (((args[0]).toFloat() + args[1].toFloat() + args[2].toFloat()) / 3).roundToInt()
    val grade = when (average) {
    in 0..39   -> "Fail"
    in 40..69  -> "Pass"
    in 70..100 -> "Distinction"
    else       -> "?"
}
    println(grade)
}
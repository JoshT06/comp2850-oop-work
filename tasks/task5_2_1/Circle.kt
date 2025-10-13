import kotlin.math.PI

fun circleArea(radius: Double) = PI * radius * radius

fun circleCirc(radius: Double) = PI * 2 * radius

fun readDouble(): Double {

    println("input number pls")

    return readln().toDouble()

}

fun main(){
    val radius = readDouble()
    println(circleArea(radius))
    println(circleCirc(radius))
}

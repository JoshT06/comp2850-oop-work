fun main(){
    val userspecifiedinput = readln().toInt()
    var x = 0

    for (n in 1..userspecifiedinput step 2){
        x += n
    }
    println(x)
}

fun grades(mark: Int) = when (mark) {
    in 0..39   -> "Fail"
    in 40..69  -> "Pass"
    in 70..100 -> "Distinction"
    else       -> "?"
}


fun main(args: Array<String>){
    for (x in args) {
        println(x)
        println(grades(x.toInt()))
    }
}
fun main(){

    println("PIZZA MENU \n \n (a) Margherita \n (b) Quattro Stagioni \n (c) Seafood \n (d) Hawaiian \n \n Choose your pizza (a-d):")


    do{
        var userChoice = readln().lowercase()
    }
    while (userChoice.length != 1 || userChoice !in "a".."d")

    println("\n Order Accepted")


}
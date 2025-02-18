
class Player{
val tries =  6

fun enterName() :String{
    println("Entrez votre nom : ")
    val name = readlnOrNull()

    return ("Bienvenue $name"+ "Vous disposez de $tries essais")
}
}


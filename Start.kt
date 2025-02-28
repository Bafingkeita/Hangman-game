class Start {


    fun gamestart(){
        val player = Player()
        var name = player.enterName()
    }

    //Method choose randomly some words

    fun chooseWords(){
        val words = arrayListOf("Chat","Lune", "Pomme", "Table", "Soleil")
        words.shuffle()
        val randomWords = words.first
        val numberofChar = randomWords.length
        println("Vous devez trouvez" + numberofChar + "Caratères")
    }

    fun verificationWord(){


    }

    fun playerEntry() {
        println("Veuillez saisir un caractère")
        var playerLetter = System.`in`.read().toChar()

    }


}
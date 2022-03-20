class HogwartsHat {

    fun chooseHouse(): String {

        val housesOfHogwarts = arrayOf("Gryffindor", "Hufflepuff", "Ravenclaw", "Slytherin")
        return housesOfHogwarts.random()
    }
}
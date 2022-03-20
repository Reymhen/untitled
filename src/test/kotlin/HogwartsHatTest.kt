import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue
import kotlin.test.fail

class HogwartsHatTest {

    private val hogwartsHat: HogwartsHat = HogwartsHat()

    @Test
    fun testHouseSelection() {
        val hogwartsHouse = hogwartsHat.chooseHouse()

        assertNotNull(hogwartsHouse)
        assertTrue { arrayOf("Gryffindor", "Hufflepuff", "Ravenclaw", "Slytherin").contains(hogwartsHouse) }
//        fail("Not yet implemented")
    }
}
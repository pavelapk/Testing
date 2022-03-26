import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ParityOutlierTest {

    @Test
    internal fun testFirstOdd() {
        val parityOutlier = ParityOutlier()
        val result = parityOutlier.find(arrayOf(1, 2, 4, 6, 8, 10))
        assertEquals(1, result)
    }

    @Test
    internal fun testFirstEven() {
        val parityOutlier = ParityOutlier()
        val result = parityOutlier.find(arrayOf(2, 1, 3, 5, 7))
        assertEquals(2, result)
    }

    @Test
    internal fun testAllNegative() {
        val parityOutlier = ParityOutlier()
        val result = parityOutlier.find(arrayOf(-2, -1, -3, -5, -7))
        assertEquals(-2, result)
    }

    @Test
    internal fun testNegativeAndPositive() {
        val parityOutlier = ParityOutlier()
        val result = parityOutlier.find(arrayOf(1, -1, 2, 3, -3))
        assertEquals(2, result)
    }

    @Test
    internal fun testAllEven() {
        val parityOutlier = ParityOutlier()
        val result = parityOutlier.find(arrayOf(0, 0, 0))
        assertEquals(null, result)
    }

    @Test
    internal fun testAllOdd() {
        val parityOutlier = ParityOutlier()
        val result = parityOutlier.find(arrayOf(-1, 1, -1))
        assertEquals(null, result)
    }

    @Test
    internal fun testMaxInteger() {
        val parityOutlier = ParityOutlier()
        val result = parityOutlier.find(arrayOf(Int.MAX_VALUE, 0, 1))
        assertEquals(0, result)
    }


    @Test
    internal fun testMinInteger() {
        val parityOutlier = ParityOutlier()
        val result = parityOutlier.find(arrayOf(Int.MIN_VALUE, 0, 1))
        assertEquals(1, result)
    }


    @Test
    internal fun testMaxAndMinInteger() {
        val parityOutlier = ParityOutlier()
        val result1 = parityOutlier.find(arrayOf(Int.MAX_VALUE, 0, Int.MIN_VALUE))
        val result2 = parityOutlier.find(arrayOf(Int.MAX_VALUE, 1, Int.MIN_VALUE))
        assertAll(
            { assertEquals(Int.MAX_VALUE, result1) },
            { assertEquals(Int.MIN_VALUE, result2) }
        )
    }


    @Test
    internal fun testLongArray() {
        val input = Array(1000) { 100 }
        input[500] = 123
        val parityOutlier = ParityOutlier()
        val result = parityOutlier.find(input)
        assertEquals(123, result)
    }


    @Test
    internal fun testShortArray() {
        val parityOutlier = ParityOutlier()
        assertThrowsExactly(IndexOutOfBoundsException::class.java) {
            parityOutlier.find(arrayOf(0, 1))
        }
    }

    @Test
    internal fun testEmptyArray() {
        val parityOutlier = ParityOutlier()
        assertThrowsExactly(IndexOutOfBoundsException::class.java) {
            parityOutlier.find(arrayOf())
        }
    }


}
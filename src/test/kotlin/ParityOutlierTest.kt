import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ParityOutlierTest {

    @Test
    internal fun testFirstOdd() {
        val parityOutlier = ParityOutlier()
        val result = parityOutlier.find(arrayOf(1, 2, 4, 6, 8))
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
    internal fun testMaxAndMinInteger() {
        val parityOutlier = ParityOutlier()
        val result1 = parityOutlier.find(arrayOf(Int.MAX_VALUE, 0, Int.MIN_VALUE))
        val result2 = parityOutlier.find(arrayOf(Int.MAX_VALUE, 1, Int.MIN_VALUE))
        assertEquals(Int.MAX_VALUE, result1)
        assertEquals(Int.MIN_VALUE, result2)
    }


}
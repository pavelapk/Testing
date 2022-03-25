import kotlin.math.abs

class ParityOutlier {

    fun find(integers: Array<Int>): Int? {
        val parity = listOf(integers[0], integers[1], integers[2])
            .map { abs(it) % 2 }.sorted()[1]
        return integers.find { abs(it) % 2 != parity }
    }
}
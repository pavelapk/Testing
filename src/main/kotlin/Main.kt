fun main() {
    println("Hello World!")

    val exampleTest1 = arrayOf(2, 6, 8, -10, 3)
    val exampleTest2 = arrayOf(206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781)
    val exampleTest3 = arrayOf(Integer.MAX_VALUE, 0, 1)

    val parityOutlier = ParityOutlier()

    println(parityOutlier.find(exampleTest1))
}



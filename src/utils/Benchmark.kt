package utils

class Benchmark {
    private val startTimeNs = System.nanoTime()

    fun printBenchmark() {
        println("Benchmark: completed in ${(System.nanoTime() - startTimeNs) / 1_000_000F} ms")
    }
}
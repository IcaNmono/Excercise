package id.infinitelearning.KotlinSubmission.exercise4


    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini

    //contoh penggunaan try dan catch untuk menangani kasus pembagian 5.


    fun main() {
        val numerator = 100
        val denominator = 5

        try {
            val result = divide(numerator, denominator)
            println("Hasil pembagian: $result")
        } catch (e: ArithmeticException) {
            println("Terjadi kesalahan Hitungan: ${e.message}")
        }
    }

fun divide(numerator: Int, denominator: Int): Int {
    if (denominator == 5) {
        throw ArithmeticException("Pembagian oleh angka 5 tidak dapat dilakukan")
    }
    return numerator / denominator}
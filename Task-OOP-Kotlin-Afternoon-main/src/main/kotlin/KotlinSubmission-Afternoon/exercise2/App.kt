package id.infinitelearning.KotlinSubmission.exercise2

import java.time.LocalDate
import java.time.format.TextStyle
import java.util.Locale






        /** Latihan 1 List
        Buatlah sebuah variabel bertipe list dengan ketentuan:
        - List tersebut menampung bilangan genap dari 1 hingga 100
        Optional:
        - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
         */
        // Buat di bawah sini

        fun main() {
            // Latihan 1: List bilangan genap
            val evenNumbers = mutableListOf<Int>()

            for (i in 1..100) {
                if (i % 2 == 0) {
                    evenNumbers.add(i)
                }
            }

            println("Bilangan genap dari 1 hingga 100:")
            println(evenNumbers)


            /** Latihan 2 Map
            Buatlah variabel bertipe Map dengan kriteria:
            Daftar nama bulan dalam setahun,
            - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
            - key "Jan", value January
            - key "Feb", value February
            - dst...*/
            // Buat di bawah sini

            val namaBulan = mapOf(
                "Jan" to "Januari",
                "Feb" to "Februari",
                "Mar" to "Maret",
                "Apr" to "April",
                "Mei" to "Mei",
                "Jun" to "Juni",
                "Jul" to "Juli",
                "Agu" to "Augustus",
                "Sep" to "September",
                "Okt" to "Oktober",
                "Nov" to "November",
                "Des" to "Desember"
            )

            println("Nama bulan untuk 'Jan' adalah ${namaBulan["Jan"]}")
            println("Nama bulan untuk 'Mar' adalah ${namaBulan["Mar"]}")
            println("Nama bulan untuk 'Apr' adalah ${namaBulan["Apr"]}")
            println("Nama bulan untuk 'Mei' adalah ${namaBulan["Mei"]}")
            println("Nama bulan untuk 'Jun' adalah ${namaBulan["Jun"]}")
            println("Nama bulan untuk 'Jul' adalah ${namaBulan["Jul"]}")
            println("Nama bulan untuk 'Agu' adalah ${namaBulan["Agu"]}")
            println("Nama bulan untuk 'Sep' adalah ${namaBulan["Sep"]}")
            println("Nama bulan untuk 'Okt' adalah ${namaBulan["Okt"]}")
            println("Nama bulan untuk 'Nov' adalah ${namaBulan["Nov"]}")
            println("Nama bulan untuk 'Des' adalah ${namaBulan["Des"]}")

            /**Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
            - Jan -> January
            - Feb -> February
            - Dst...*/
            // Buat di bawah sini

            namaBulan.forEach { (key, value) ->
                println("$key -> $value")
            }


            /**Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
            - "It's {$monthNow} now, I was born in {$birthMonth}"
             */
            // Buat di bawah sini

            val birthMonth = "Agustus"
            val birthMonthShortForm = getShortMonth(birthMonth)

            val currentMonth =
                LocalDate.now().month.getDisplayName(TextStyle.FULL, Locale.getDefault())
            val currentMonthShortForm = getShortMonth(currentMonth)

        }

fun getShortMonth(month: String): String {
    return month.substring(0, 3) }
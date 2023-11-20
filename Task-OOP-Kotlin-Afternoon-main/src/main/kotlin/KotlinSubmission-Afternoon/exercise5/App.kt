package id.infinitelearning.KotlinSubmission.exercise5

fun main() {

    /**
     * Latihan 1
     * Buat variable dengan nama hero dibawah ini dan isi nilai variable tersebut dengan class Hero
     *
     */

    class Hero {
        fun jalan(times: Int) {
            println("Melakukan aksi jalan sebanyak $times kali")
        }

        fun lari(times: Int) {
            println("Melakukan aksi lari sebanyak $times kali")
        }

        fun makan(times: Int) {
            println("Melakukan aksi makan sebanyak $times kali")
        }

        fun minum(times: Int) {
            println("Melakukan aksi minum sebanyak $times kali")
        }

        fun lompat(times: Int) {
            println("Melakukan aksi lompat sebanyak $times kali")
        }

        fun duduk(times: Int) {
            println("Melakukan aksi duduk sebanyak $times kali")
        }
    }


    /**
     * Latihan 2
     * Set data profile dengan memanggil fungsi setProfile() dibawah ini
     * Dan isi argumen-argumen / data dari parameter sesuai data diri Anda (Name, Age, Height)
     *
     */

    fun setProfile(name: String, age: Int, weight: Double, height: Double) {
        println("Data Profile:")
        println("Nama: $name")
        println("Usia: $age tahun")
        println("Berat: $weight kg")
        println("Tinggi: $height cm")
    }

    setProfile("Ixan", 20, 72.0, 175.0)




    /**
     * Latihan 3
     * Tampilkan data profile dibawah ini, sebelum melakukan aktivitas
     *
     */

    fun showProfileBeforeActivity() {
        // Panggil fungsi setProfile() dengan data yang sesuai di sini jika belum dipanggil sebelumnya
    }


    /**
    Challenge:

    ===============Class B Afternoon===============
    Vortex -> jalan 2x, lari 1x, makan 2x, minum 1x, lompat 2x, duduk 4x

     **/


    /**
     * Latihan 4
     * Jalankan aktivitas-aktivitas dengan memanggil fungsi-fungsi sesuai challenge diatas
     *
     */

    fun runActivities() {
        val activities = mapOf(
            "Vortex" to listOf(2, 1, 2, 1, 2, 4),

            )

        for ((className, activity) in activities) {
            val hero = Hero()
            hero.jalan(activity[0])
            hero.lari(activity[1])
            hero.makan(activity[2])
            hero.minum(activity[3])
            hero.lompat(activity[4])
            hero.duduk(activity[5])

            println("===$className===")
            println("$className -> jalan ${activity[0]}x, lari ${activity[1]}x, makan ${activity[2]}x, minum ${activity[3]}x, lompat ${activity[4]}x, duduk ${activity[5]}x")
        }
    }

    runActivities()


    /**
     * Latihan 5
     * Panggil fungsi profile dibawah ini untuk menampilkan status terkini setelah melakukan aktivitas
     *
     */
    fun profile() {
        // Tampilkan status terkini setelah melakukan aktivitas
    }

    profile()
}




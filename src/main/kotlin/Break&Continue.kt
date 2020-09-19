fun main() {
    loop@ for (i in 1..10) {
        println("Saya umur 16 tahun")

        for (j in 1..10) {
            println("Halo saya Vera")
            if (j > 5) break@loop
        }
    }
}
package ejercicios

fun ejecutarBloque4() {
    println("\n CICLOS ")

    // 16. Conteo Simple
    println(" For de los numeros del 1 al 10")
    for (i in 1..10) {
        print(i)
    }
    println()

    // 17. Cuenta regresiva
    println("Cuenta atras del 10 al 1")
    for (i in 10 downTo 1) {
        print(i)
    }
    println()

    // 18. Saltos de 3
    println("Saltos de a 3 (1-30): ")
    for (i in 1..30) {
        print(i)
    }
    println()

    // 19. While Infinito (Casi)
    var energia = 10
    print("Descargandose: ")
    while (energia > 0) {
        println("Energia que falta: $energia")
        energia--
    }
    println("No tiene energia")

    // 20. Do-While
    var contrasena: String
    var intentos = 0
    do {
        contrasena = if (intentos < 2) "abcd" else "1234"
        println(" Intentos ${intentos + 1}: Ingresando '$contrasena'")
        intentos++
    } while (contrasena != "1234")
    println(" Se concedio el acceso")
}
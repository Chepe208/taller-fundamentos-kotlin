package ejercicios

fun saludar(nombre: String): String {
    return "¡Hola $nombre un saludo!"
}

fun sumar(a: Int, b: Int) = a + b

fun crearRectangulo(ancho: Int, alto: Int = 10) {
    println("Rectangulo de: ancho= $ancho x alto= $alto")
}

fun convertidor(dolares: Double): Double {
    val tasaCambio = 4000.0
    return dolares * tasaCambio
}

fun ejecutarBloque5() {
    println("\n FUNCIONES ")

    // 21. Saludo Personalizado
    println(" ${saludar("Jóse")}")

    // 22. Suma Expres
    println(" Suma de 10 y 20 ${sumar(10, 20)}")

    // 23. Parametro por Defecto
    println(" Creando el rectangulo: ")
    crearRectangulo(5)

    // 24. Argumentos Nombrados
    println(" Creando el rectangulo con argumentos nombrados: ")
    crearRectangulo(ancho = 20)

    // 25. Conversor
    val usd = 40.0
    println("25. $usd USD equivalen a ${convertidor(usd)} de moneda local")
}

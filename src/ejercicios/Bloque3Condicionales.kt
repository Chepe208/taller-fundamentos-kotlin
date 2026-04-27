package ejercicios

fun ejecutarBloque3() {
    println("\n CONDICIONALES ")

    // 11. Mayoria de edad
    val edad: Int = 20
    if (edad >=18) {
        println(" Puede votar ")
    } else {
        println(" No puede votar ")
    }

    // 12. If como expresion
    val nota = 75
    val resultado = if (nota >=60) "Aprobado" else "Reprobado"
    println("Resultado: $resultado")

    // 13. Semaforo
    val colorSemaforo = "Rojo"
    print("Semaforo en $colorSemaforo: ")
    when (colorSemaforo) {
        "Rojo" -> println("Pare")
        "Amarillo" -> println("Desminuya")
        "Verde" -> println("Siga")
        else -> println("Color Invalido")
    }

    // 14. Rangos en When
    val temperaturas = 24
    print("Temperaturas: $temperaturas°C: ")
    when {
        temperaturas < 15 -> println("Frio")
        temperaturas in 15..25 -> println("Templado")
        temperaturas > 25 -> println("Calor")
    }

    // 15. Verificacion de TIpo
    val variable: Any = "Hola Mundo"
    println(" Verificacion de Dato: ")
    when (variable) {
        is String -> println("$variable is a String")
        is Int -> println("$variable is a Int")
        else -> println("Tipo de Dato desconocido")
    }

}
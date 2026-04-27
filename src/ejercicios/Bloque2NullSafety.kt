package ejercicios

fun ejecutarBloque2() {
    println("\n NULL SAFETY ")

    // 6. El Opcional
    val apodo: String? = null
    println(" Apodo: $apodo")

    // 7. Operador Elvis
    val nombre = apodo ?: "Sin apodo"
    println(" Nombre Elvis: $nombre")

    // 8. Llamada Segura
    println(" El apodo tiene ${apodo?.length} caracteres")

    // 9. Uso de Let
    val correo: String? = "Jose@correo.com"
    correo?.let {
        println("El Correo se envio a: $it")
    } ?: println(" No hay correo que se pueda enviar")

    val textoNulo: String? = ("Kotlin")
    println(" Longitud de texto Nulo: ${textoNulo!!.length}")

}
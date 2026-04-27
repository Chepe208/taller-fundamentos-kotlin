package ejercicios

object Constants {
    const val velLuz = 299792458
}

fun ejecutarBloque1() {
    println("\n VARIABLES ")

    // // 1. Perfil de Usuario
    val nombre = "Jóse Ruiz"
    var ciudad = "Santa Marta"
    println("Nombre: $nombre, Primera ciudad: $ciudad")
    ciudad = "Bello"
    println("Ciudad Cambiada: $ciudad")

    // 2. Calculadora de Años
    val anioNacimiento = 2008
    val anioActual = 2026
    val edad = anioActual - anioNacimiento
    println("Año nacimiento: $anioNacimiento, Tienes: $edad años de edad")

    // 3. Tipos Explícitos
    val precioCarne: Double = 29999.99
    val pesoBallena: Float = 180.0F
    val arbolesMundo: Long = 3000000000000L
    println(" La carne cuesta: $$precioCarne, La ballena pesa: ${pesoBallena}ton, Hay ${arbolesMundo} de arboles en el mundo.")

    // 4. Inferencia
    val estaLloviendo= false
    println(" ¿Esta lloviendo ? $estaLloviendo")

    // 5. Constantes Reales
    println(" Esta es la velocidad de la luz: ${Constants.velLuz} m/s")
}
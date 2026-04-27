package ejercicios

fun Int.negativo(): Boolean = this < 0

fun String.quitarEspacios(): String = this.replace(" ", "")

fun ejecutarBloque6() {
    println("\n COLECCIONES Y EXTENSIONES ")

    // 26. Lista de Compras
    val lista = mutableListOf("Arroz", "Papas", "Huevos")
    println(" Primera lista: $lista")
    lista.add("Cilantro")
    lista.removeAt(1)
    println(" Lista de compras modificada: $lista")

    // 27. Filtro de Precios
    val precio= listOf(200, 120, 45, 67, 100, 28)
    val baratos = precio.filter { it < 50 }
    println(" Precios que son menores a 50: $baratos")

    // 28. Buscador
    val amigos = listOf("Jose", "Cristina", "Andres", "Elvira")
    val conA = amigos.find { it.startsWith("A") }
    println(" Amigos que empiecen con A: $conA")

    // 29. Extension de Int
    val numero = -28
    println(" ¿El numero $numero es negativo?: ${numero.negativo()}")

    // 30. Extension de String
    val textoEspacios = "H o la des de Ko t l in"
    println(" Texto de Espacios: $textoEspacios")
    println(" Texto sin los espacios: '${textoEspacios.quitarEspacios()}'")
}
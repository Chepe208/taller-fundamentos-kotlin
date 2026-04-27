# Taller de Fundamentos de Kotlin

Este proyecto contiene la resolución de 30 ejercicios prácticos para consolidar los conocimientos en el lenguaje Kotlin.

## Estudiante
- **Nombre:** Jóse Manuel Ruiz Zapata
- **Ficha:** 3144585

## Descripción del Proyecto
El proyecto está organizado en 6 bloques temáticos que cubren los aspectos fundamentales de Kotlin:

### Bloque 1: Variables y Tipos de Datos
- Perfil de usuario con `val` y `var`.
- Cálculo de edad a partir del año de nacimiento.
- Uso de tipos explícitos (`Double`, `Float`, `Long`).
- Inferencia de tipo con un valor booleano.
- Constantes de tiempo de compilación (`const val`) dentro de un `object`.

### Bloque 2: Null Safety
- Declaración de variables nulables (`String?`).
- Operador Elvis (`?:`) para proporcionar valores por defecto.
- Llamadas seguras (`?.`) para acceder a propiedades sin riesgo de NPE.
- Uso de `let` para ejecutar código solo si el valor no es nulo.
- Aserción no nula (`!!`) con advertencia de posible crash.

### Bloque 3: Condicionales
- Evaluación de mayoría de edad con `if-else`.
- `if` como expresión para asignar "Aprobado" o "Reprobado".
- Estructura `when` para simular un semáforo.
- Clasificación de temperatura usando rangos (`in`, `until`).
- Verificación de tipo con `is` en `when` para `Any`.

### Bloque 4: Ciclos
- Conteo simple con `for in 1..10`.
- Cuenta regresiva con `downTo`.
- Saltos personalizados con `step`.
- Bucle `while` que decrementa una variable de energía.
- Bucle `do-while` que simula la validación de una contraseña.

### Bloque 5: Funciones
- Función que retorna un saludo personalizado.
- Función de una sola línea para sumar dos números.
- Parámetro por defecto (`alto = 10`) en una función.
- Llamada con argumentos nombrados.
- Conversor de dólares a moneda local con tasa configurable.

### Bloque 6: Colecciones y Extensiones
- Lista mutable (`mutableListOf`) para agregar y eliminar productos.
- Filtrado de precios menores a 50 usando `filter`.
- Búsqueda del primer nombre que empieza con 'A' usando `find`.
- Función de extensión para `Int`: `esNegativo()`.
- Función de extensión para `String`: `quitarEspacios()`.

## Cómo Ejecutar
1. Navega hasta el archivo `src/Main.kt` (o ejecuta cualquier archivo de bloque directamente).
2. Haz clic derecho sobre `main()` y selecciona **Run 'MainKt'**.
5. Los resultados de todos los ejercicios se mostrarán en la consola de forma secuencial.

## Estructura del Proyecto

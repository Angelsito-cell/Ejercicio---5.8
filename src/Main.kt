fun main() {
    val empleados = listOf(
        Gerente("Carlos", 5000.0, 5),
        Desarrollador("María", 3000.0, "Mid"),
        Desarrollador("Juan", 4000.0, "Senior")
    )

    empleados.forEach { println("${it.nombre} - Bono: ${it.calcularBono()}") }
}

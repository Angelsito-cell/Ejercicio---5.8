class Desarrollador(nombre: String, salario: Double, private val nivel: String) : Empleado(nombre, salario) {
    override fun calcularBono(): Double {
        return when (nivel) {
            "Junior" -> salario * 0.05
            "Mid" -> salario * 0.1
            "Senior" -> salario * 0.2
            else -> 0.0
        }
    }
}

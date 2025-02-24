class Gerente(nombre: String, salario: Double, private val equipo: Int) : Empleado(nombre, salario) {
    override fun calcularBono(): Double = salario * (0.1 + equipo * 0.02)
}

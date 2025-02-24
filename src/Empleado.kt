open class Empleado(val nombre: String, val salario: Double) {
    open fun calcularBono(): Double = salario * 0.1
}

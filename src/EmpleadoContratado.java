public class EmpleadoContratado extends Empleado {
    private float horasTrabajadas;
    private float valorHora; 
    
    public EmpleadoContratado(String nombre, float sueldo, float horasTrabajadas, float valorHora) {
        super(nombre, sueldo);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSueldo() {
        return this.horasTrabajadas * this.valorHora;
    }
}

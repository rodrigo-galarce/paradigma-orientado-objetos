public class CuentaBancaria {
    private float saldo;
    private String titular;

    public CuentaBancaria(float saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;         //this referencia a los objetos de la clase
    }

    public float depositar(float deposito) {
        this.saldo += deposito;
        return this.saldo;  
    }

    public float extraer(float extraccion) {
        this.saldo -= extraccion;
        return extraccion;
    }
}

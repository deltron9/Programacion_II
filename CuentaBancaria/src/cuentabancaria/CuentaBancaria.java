package cuentabancaria;
/*
5. Clase CuentaBancaria:
-. Define una clase CuentaBancaria con atributos saldo, titular, y numeroDeCuenta.
-. Implementa métodos para depositar y retirar dinero, asegurándote de que no se permita retirar
más de lo que hay en el saldo.
-. Crea un método para consultar el saldo actual de la cuenta.
*/
public class CuentaBancaria {
    private double saldo;
    private String titular;
    private String numeroDeCuenta;
    
    public CuentaBancaria () {
        this.saldo = 0.0;
        this.titular = titular;
        this.numeroDeCuenta = numeroDeCuenta;       
    }
    
    public void depositarDinero(double monto) {
        if (monto > 0) {
            saldo +=  monto; }
    }
    
    public void extraerDinero(double montoExtraer) {
        if (saldo < montoExtraer){
            comunicarSaldoInsuficiente(); }
        saldo -= montoExtraer;
    }
    
    public String comunicarSaldoInsuficiente(){
        return "Usted no posee saldo suficiente para realizar esta transacción.";
    }
    
    public String consultarSaldo() {
        return "Su saldo actual es de " + saldo;
    }
}

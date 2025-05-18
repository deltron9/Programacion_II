package integrador1posnet;

public class TarjetaDeCredito {
    private EntidadFinanciera entidadFinanciera;
    private String entidadBancaria;
    private String nroTarjeta;
    private double saldoDisponible;
    
    public TarjetaDeCredito (EntidadFinanciera entidadFinanciera, String entidadBancaria, String nroTarjeta, double saldoDisponible) {
    
    this.entidadBancaria = entidadBancaria;
    this.nroTarjeta = nroTarjeta;
    this.entidadFinanciera = entidadFinanciera;
    this.saldoDisponible = saldoDisponible;
    }
}
    
    
}

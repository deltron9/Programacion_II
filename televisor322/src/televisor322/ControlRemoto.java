package televisor322;

public class ControlRemoto {
    
    private Televisor tv;
    
    public ControlRemoto(Televisor tv) {
        vincularTelevisor(tv);
    }
    
    private void verificarVinculo() {
        if(tv == null) {
            throw new IllegalStateException("No hay tv vinculada.");
        }
    }
    
    public void vincularTelevisor(Televisor tv) {
        this.tv = tv;
    }
    
    public void desvilcularTelevision() {
        tv = null;
    }
    
    public int getSerialTV() {
        return tv.getNroDeSerie();
    }
    
    public void power() {
        verificarVinculo();
        if(tv.encenderTelevision()) {
            tv.apagarTelevision();
        }
        else{
            tv.encenderTelevision();
        }
    }
    
    public void subirCanal() {
        verificarVinculo();
        tv.subirCanal();
    }
}

package models.genericos;

public class Par <K, V>{
    private K clave;
    private V valor;

    public void establecerClave(K clave){
        this.clave = clave;
    }

    public K obtenerClave(){
        return clave;
    }

    public void establecerValor(V valor){
        this.valor = valor;
    }

    public V obtenerValor(){
        return valor;
    }
}

package periferico;

public class Periferico {
    //atributos
    private String nombre;
    private float costoDelProducto;
    private int aniosGarantia;

    //getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getCostoDelProducto() {
        return costoDelProducto;
    }

    public void setCostoDelProducto(float costoDelProducto) {
        this.costoDelProducto = costoDelProducto;
    }

    public int getAniosGarantia() {
        return aniosGarantia;
    }

    public void setAniosGarantia(int aniosGarantia) {
        this.aniosGarantia = aniosGarantia;
    }

    //constructor

    public Periferico(){
        this.aniosGarantia = 1;
    }

    public Periferico(String nombre){
        setNombre(nombre);
        setAniosGarantia(1);
    }

    //equals
    public boolean equals(Periferico periferico){
        return getNombre().equals(periferico.getNombre());
    }

    //toString
    @Override
    public String toString(){
        return "nombre: " + getNombre() + ", costo: " + getCostoDelProducto() + ", anios de garantia: "
                + getAniosGarantia();
    }

    public void incrementarCosto(float porcentaje){
        setCostoDelProducto(getCostoDelProducto() * (1.0f + porcentaje));
    }

    public void incrementarCosto(double costo){
        setCostoDelProducto((float) (getCostoDelProducto() + costo));
    }
}

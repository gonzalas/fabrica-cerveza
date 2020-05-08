import java.util.ArrayList;

public class Fabrica {
    private int id;
    private String nombre;
    private String direccion;
    private ArrayList<Cerveza>cervezas;

    public Fabrica(int id, String nombre, String direccion){
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cervezas = new ArrayList<Cerveza>();
    }

    public void agregarCerveza(Cerveza c){
        boolean repetida = validarRepetida(c);  //si es false no está en el listado y se puede agregar
        if(!repetida){
            this.cervezas.add(c);
        }
    }

    private boolean validarRepetida(Cerveza c){
        boolean repetida = false;
        for(Cerveza cz : this.getCervezas()){
            if(c.getNombre().equals(cz.getNombre())){
                repetida = true;
            }
        }
        return repetida;
    }

    public void quitarCerveza(int id){
        Cerveza c = obtenerCervezaPorID(id);
        this.cervezas.remove(c);
    }

    private Cerveza obtenerCervezaPorID(int id){
        Cerveza buscada = null;
        for(Cerveza c : this.getCervezas()){
            if(c.getId() == id){
                buscada = c;
            }
        }
        return buscada;
    }

    public void listarCervezas(){
        for(Cerveza c : cervezas){
            System.out.println(c);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Cerveza> getCervezas() {
        return cervezas;
    }

    public void setCervezas(ArrayList<Cerveza> cervezas) {
        this.cervezas = cervezas;
    }

    @Override
    public String toString(){
        return "Fábrica: id= " + this.getId() + ", nombre= " + this.getNombre() + ", dirección= " + this.getDireccion() + ", cervezas= " + this.getCervezas();
    }
}

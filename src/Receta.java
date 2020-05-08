import java.util.ArrayList;

public class Receta {
    private int id;
    private String nombre;
    private String pais;
    private ArrayList<Ingrediente>ingredientes;

    public Receta(int id, String nombre, String pais, ArrayList<Ingrediente> ingredientes) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
        this.ingredientes = ingredientes;
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

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void agregarIngrediente(Ingrediente i){
        this.ingredientes.add(i);
    }

    public void quitarIngrediente(Ingrediente i){
        this.ingredientes.remove(i);
    }

    @Override
    public String toString(){
        return "Receta: " + this.getNombre() + ", id: " + this.getId() + ", país: " + this.getPais() + ", ingredientes: " + this.getIngredientes();
    }
}

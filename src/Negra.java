public class Negra extends TipoCerveza{
    public Negra(int id, String nombre, float precio, float ABV, String descripcion, boolean gluten, Receta receta, float complejidad) {
        super(id, nombre, precio, ABV, descripcion, gluten, receta, complejidad);
    }

    @Override
    public float calcularCostoFabricacion() {
        float costoInicial = super.calcularCostoFabricacion();
        return (costoInicial * (float) 1.2);
    }

    @Override
    public String toString(){
        return "- CERVEZA NEGRA -\n" + super.toString();
    }
}

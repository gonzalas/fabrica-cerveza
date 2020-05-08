public class Roja extends TipoCerveza{
    public Roja(int id, String nombre, float precio, float ABV, String descripcion, boolean gluten, Receta receta, float complejidad) {
        super(id, nombre, precio, ABV, descripcion, gluten, receta, complejidad);
    }

    @Override
    public float calcularCostoFabricacion() {
        float costoInicial = super.calcularCostoFabricacion();
        return (costoInicial * (float) 1.15);
    }

    @Override
    public String toString(){
        return "- CERVEZA ROJA -\n" + super.toString();
    }
}

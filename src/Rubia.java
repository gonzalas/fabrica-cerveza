public class Rubia extends TipoCerveza{
    public Rubia(int id, String nombre, float precio, float ABV, String descripcion, boolean gluten, Receta receta, float complejidad) {
        super(id, nombre, precio, ABV, descripcion, gluten, receta, complejidad);
    }

    @Override
    public float calcularCostoFabricacion() {
        float costoInicial = super.calcularCostoFabricacion();
        return (costoInicial * (float) 1.1);
    }

    @Override
    public String toString(){
        return "- CERVEZA RUBIA -\n" + super.toString();
    }
}

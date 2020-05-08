public abstract class TipoCerveza extends Cerveza {
    private boolean gluten;
    private Receta receta;
    private float porcentajeComplejidad;

    public TipoCerveza(int id, String nombre, float precio, float ABV, String descripcion, boolean gluten, Receta receta, float complejidad) {
        super(id, nombre, precio, ABV, descripcion);
        this.gluten = gluten;
        this.receta = receta;
        this.porcentajeComplejidad = complejidad;
    }

    public boolean isGluten() {
        return gluten;
    }

    public void setGluten(boolean gluten) {
        this.gluten = gluten;
    }

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }

    public float getPorcentajeComplejidad() {
        return porcentajeComplejidad;
    }

    public void setPorcentajeComplejidad(float porcentajeComplejidad) {
        this.porcentajeComplejidad = porcentajeComplejidad;
    }

    public void fabricarConSinGluten(Receta re, boolean gluten){
        this.setGluten(gluten);
        this.setReceta(re);
    }

    public float calcularCostoFabricacion(){
        float costo = 0;

        for(Ingrediente i : this.receta.getIngredientes()){
            costo += (i.getPrecioUnidad() * i.getCantidad());
        }

        //Si el tipo de cerveza es sin gluten el costo aumenta un 2%
        if(!this.isGluten()){
            costo *= 0.2;
        }

        return costo;
    }

    @Override
    public String toString(){
        return super.toString() + ", gluten: " + this.isGluten() + ", receta: " + this.getReceta() + ", porcentajeComplejidad: " + this.getPorcentajeComplejidad();
    }

}

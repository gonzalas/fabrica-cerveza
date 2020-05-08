import java.util.ArrayList;

public class Main {

    public static void main(String[]args){

        /*FÁBRICA*/
        Fabrica fabrica = new Fabrica(100, "Cerveceros", "Calle Birra 6666");

        //INGREDIENTES
        Ingrediente agua = new Ingrediente(100, "Agua", "", 1000, 100);
        Ingrediente cebada = new Ingrediente(101, "Cebada", "", 175, 1000);
        Ingrediente lupulo = new Ingrediente(102, "Lúpulo", "", 3, 500);
        Ingrediente levadura = new Ingrediente(103, "Levadura", "", 1, 200);
        Ingrediente azucar = new Ingrediente(104, "Azúcar", "", 6, 150);
        Ingrediente malta = new Ingrediente(105, "Malta", "", 200, 1200);
        Ingrediente maltaPale = new Ingrediente(106, "Malta Pale", "", 350, 3000);
        Ingrediente avena = new Ingrediente(107, "Avena", "", 50, 80);


        //LISTADO DE INGREDIENTES

        //Pilsen
        ArrayList<Ingrediente> ingredientesPilsen = new ArrayList<>();
        ingredientesPilsen.add(malta);
        ingredientesPilsen.add(lupulo);
        ingredientesPilsen.add(levadura);

        //Porter
        ArrayList<Ingrediente>ingredientesPorter = new ArrayList<>();
        ingredientesPorter.add(maltaPale);
        ingredientesPorter.add(lupulo);
        ingredientesPorter.add(levadura);
        ingredientesPorter.add(avena);

        //Red Ale
        ArrayList<Ingrediente>ingredientesRedAle = new ArrayList<>();
        ingredientesRedAle.add(malta);
        ingredientesRedAle.add(maltaPale);
        ingredientesRedAle.add(lupulo);
        ingredientesRedAle.add(azucar);
        ingredientesRedAle.add(levadura);


        //RECETAS
        Receta recetaPilsen = new Receta(100, "Pilsen", "Alemania", ingredientesPilsen);
        Receta recetaPorter = new Receta(101, "Porter", "USA", ingredientesPorter);
        Receta recetaRedAle = new Receta(102, "Red Ale", "Inglaterra", ingredientesRedAle);

        //CERVEZAS
        Cerveza rubiaPilsen = new Rubia(100, "Pilsen", 160, (float) 3.5, "", false, recetaPilsen, 20);
        Cerveza negraPorter = new Negra(101, "Porter", 160, (float) 4.8, "", false, recetaPorter, 35);
        Cerveza rojaRedAle = new Roja(102, "Red Ale", 170, (float) 5.6, "", false, recetaRedAle, 30);


        System.out.println(rubiaPilsen);
        System.out.println("Costo fabricación: " + rubiaPilsen.calcularCostoFabricacion());

        System.out.println(negraPorter);
        System.out.println("Costo fabricación: " + negraPorter.calcularCostoFabricacion());

        System.out.println(rojaRedAle);
        System.out.println("Costo fabricación: " + rojaRedAle.calcularCostoFabricacion());
    }
}

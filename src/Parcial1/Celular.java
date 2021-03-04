package Parcial1;

/**
 *
 * @author neutroms
 */
public class Celular {
    //atributos
    //sintaxis para crear una variable
    //modificador_de_acceso + tipo + nombre
    //Lower camel case
    
    private String marca;
    private String capacidad;
    private String tamaño;
    private String color;
    private double precio;
    private String modelo;
    private boolean chino;
   
    
    //metodos
    //metodo especial (constructor)
    //sintaxis creación constructor
    //modificador publico + Nombre*Clase
    public Celular(){}
    
    //metodos o funciones
    //sintaxis creación de metodos
    //modaccess tipoRetorno Nombre (tipoDato nombreParam, tipoDato nombre2)
    //parametros =>  variable locales
    
    public void Llamar (int numero){
        System.out.println("Marcando al número: "+numero+ "...");
    
    }
    
    public String ObtenerMarcar(){
    return marca;
    }
}

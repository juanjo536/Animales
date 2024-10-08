
package Main;
import animales.Animal;
import animales.Gato;
import animales.Leon;
import animales.Perro;
import animales.Lobo;


public class Prueba {
    public static void main(String[] args) {
        Animal [] animales = new Animal[4];
        
        animales[0] = new Gato();
        animales[1] = new Perro();
        animales[2] = new Lobo();
        animales[3] = new Leon();
        
        for (int i=0; i < animales.length; i++){
            
            System.out.println(animales[i].getNombre_Cientifico());
            System.out.println("sonido: " + animales[i].getSonido());
            System.out.println("alimentos: "+ animales[i].getAlimentos());
            System.out.println("Habitat: " + animales[i].getHabitad());
            System.out.println();
            
        }
        
        
            }
    
}

/*
Diseñe e implemente un algoritmo; de tal manera, que le permita crear la clase Sensor_Infrarrojo
y que extienda a las clases Sharp y Line_Tracking con respecto al paper ” DISEÑO EXPERIMENTAL DE VEHÍCULO AUTÓNOMO UTILIZANDO REDES
NEURONALES“
 */

package sensor_infrarrojo;
/**
 *
 * @author ALEX BELTRAN
 */

interface Sharp{
    public default void Identificar(){
        System.out.println("\n\nEl sensor permite identificar y medir distancias"
                + " a los alrededores del vehiculo.");   
    } 
}
interface Line_Tracking{
    public default void Identificar(){
        System.out.println("\n\nEl senor permite identificar unalinea trasada en"
                + " el piso para seguir su trayectoria.");
    } 
}
public class Sensor_Infrarrojo implements Sharp,Line_Tracking{

   @Override
    public void Identificar(){
        //se puede elegir la implementacion de una interfaz
        //por ejemplo ,escogemos que sea TransmisionMecanica
        Sharp.super.Identificar();
    }
   
    /*@Override
    public void Identificar(){
    //se puede elegir la implementacion de una interfaz
    //por ejemplo,escogemos que sea VehiculosGasolina
    Line_Tracking.super.Identificar();
    
    }*/
    public static void main(String[] args) {
     
        System.out.println("\t\tUniversidad de las Fuerzas Armadas ESPE-L");
        System.out.println("\n\t\t\t   Ingeniería Automotriz");
        System.out.println("\t\t\t\tProgramación");
        System.out.println("\n\t\t\t Docente: Ing. Luis Guerra");
        System.out.println("\t\t\t Estudiante: Alex Beltran");
        
        Sensor_Infrarrojo sensor=new  Sensor_Infrarrojo();
        sensor.Identificar();
        
    }
    
}

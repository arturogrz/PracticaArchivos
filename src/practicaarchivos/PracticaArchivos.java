package practicaarchivos;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
public class PracticaArchivos {
    public static void main(String[] args) {
        //Creamos array con nombres
        String nombres[] = {
            "Ricardo",
            "Jorge",
            "Pedro",
            "Fernando",
            "Juan",
            "Oscar",
            "Angel",
            "Eduardo",
            "Marco",
            "Humberto",
            "Maria",
            "Paola",
            "Alejandra",
            "Susana",
            "Teresa",
        };
        //Recorremos el arreglo
        for(int nom = 0; nom < nombres.length; nom++){
        try {
        //imprimimos los nombres en el archivo
        Files.write(Paths.get("nombres.txt"),
                ( nombres[nom] + "\r\n").getBytes(),
                StandardOpenOption.APPEND);
        //System.out.println(nombres[nom]);
        }catch (IOException e){}   
        }  
    }
}

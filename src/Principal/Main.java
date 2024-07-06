package Principal;

import Modelos.Libro;
import Service.APIService;
import Service.ConvierteDatos;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // 1. Covertir el Json a un texto legible.
    // 2. Obtener un top 10
    // 3. Crear un metodo para buscar
    // 4. Mostrar estadistica


    public static void main(String[] args) {
        APIService apiService = new APIService();
        ConvierteDatos conversor = new ConvierteDatos();

        var json = apiService.obtenerDatos("https://gutendex.com/books/?search=dickens%20great");
        Libro datos = conversor.obtenerDatos(json, Libro.class);
        System.out.println(json);
        System.out.println(datos);
        }

    }

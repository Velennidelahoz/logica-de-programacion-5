import java.util.*;

public class Traductor {
  public static void main(String[] args) {
    Traductor traductor = new Traductor();
    traductor.palabrasAleatorias();
  }

  public void palabrasAleatorias(){

    System.out.println("Bienvenid@ a su traductor de confianza");
    System.out.println("---------------------------------------");

    Scanner scanner = new Scanner(System.in);

    Map<String, String> traductor = new HashMap<>();

    traductor.put("Mesa", "Table");
    traductor.put("Pelota", "Ball");
    traductor.put("Canción", "Song");
    traductor.put("Cine", "Cinema");
    traductor.put("Bosque", "Forest");
    traductor.put("Oro", "Gold");
    traductor.put("Sueño", "Dream");
    traductor.put("Viaje", "Journey");
    traductor.put("Río", "River");
    traductor.put("Calor", "Heat");
    traductor.put("Frío", "Cold");
    traductor.put("Reloj", "Clock");
    traductor.put("Teléfono", "Telephone");
    traductor.put("Camino", "Path");
    traductor.put("Guitarra", "Guitar");
    traductor.put("Nube", "Cloud");
    traductor.put("Diente", "Tooth");
    traductor.put("Leche", "Milk");
    traductor.put("Carro", "Car");
    traductor.put("Avión", "Airplane");

    Random aleatorio = new Random();
    ArrayList<String> palabras = new ArrayList<>(traductor.keySet());
    ArrayList<String> palabrasElegidas = new ArrayList<>();
    Map<String, String> respuestas = new HashMap<>();

    for (int i = 0; i < 5; i++) {
      palabrasElegidas.add(palabras.get(aleatorio.nextInt(palabras.size())));
    }

    for (String palabra : palabrasElegidas){
      System.out.println("Escriba en ingles la siguiente palabra: " + palabra);
      String palabraIngles = scanner.nextLine();

      if (traductor.containsValue(palabraIngles.toLowerCase())){
        respuestas.put(palabra, traductor.get(palabra));
      }
    }

    System.out.println("Tus respuestas correctas fueron: ");
    respuestas.forEach((palabraEsp, palabraIng) -> System.out.println(palabraEsp + " : " + palabraIng));

    scanner.close();
  }
}
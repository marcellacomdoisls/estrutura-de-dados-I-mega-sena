import java.util.*;

public class MegaSena {
  public static void main(String[] args) {
    ArrayList<Integer> lista = new ArrayList<>();
    Random aleatorio = new Random();
    int[] numerosSorteados = { 1, 15, 16, 25, 32, 36 };
    int sequenciaCount = 0;

    for (int i = 0; i < 51000000; i++) {
      lista.add(aleatorio.nextInt(60000000) + 1);
    }

    for (int i = 0; i < lista.size(); i++) {
      if (lista.get(i) == numerosSorteados[sequenciaCount]) {
        sequenciaCount++;
        if (sequenciaCount == numerosSorteados.length) {
          System.out.println("Sequência encontrada na posição: " + (i - sequenciaCount + 1));
          sequenciaCount = 0;
        }
      } else {
        sequenciaCount = 0;
      }
    }

    Collections.reverse(lista);
    sequenciaCount = 0;
    for (int i = 0; i < lista.size(); i++) {
      if (lista.get(i) == numerosSorteados[sequenciaCount]) {
        sequenciaCount++;
        if (sequenciaCount == numerosSorteados.length) {
          System.out.println("Sequência encontrada na posição (ordem inversa): " + (i - sequenciaCount + 1));
          sequenciaCount = 0;
        }
      } else {
        sequenciaCount = 0;
      }
    }
  }
}

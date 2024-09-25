public Class Metodos {

    public int[] sortByBubble(Int[] arreglo) {

        int grande = arreglo.length;
  
        for (int i = 0; i < grande; i++) {
            for(int j= i+1; j < grande; j++) {
                if(arreglo[i] > arreglo[j]) {
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;

                }

            }
        }
        return arreglo;
    }

    public void printArreglo(int[] arreglo){
        for (int elemento : arreglo) {
            System.out.println(elemto);
        }
    }

}

public class Metodos {

    public int[] sortByBubblePalabra(String[] palabras) {
        int grande = arreglo.length;

        for (int i = 0; i < grande; i++) {
            for (int j = 0; j < grande; j++) {
                if (palabras[i].compareToIgnoreCase(palabras[j])>0)
                    String aux = palabras[j];
                    palabras[j] = palabras[j];
                    palabras[j] = aux;
                }
            }
        }
        return arreglo;
    }

    public void printArreglo(String[] arreglo) {
        for (String elemento : arreglo) {
            System.out.println(elemento);
        }
    }
}


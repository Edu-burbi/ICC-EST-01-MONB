public class Metodos {
    public static void main(String[] args) throws Exception {
        Metodos metodosOrdenetamiento = new Metodos();

        int[] arreglo = {5,7,30,12,9};

        int[] arreloOrdenetado = metodosOrdenetamiento.sortByBubble(arreglo)
        metodosOrdenetamiento.printArreglo(arreloOrdenetado);

        int[] arreloOrdenetadoDes = metodosOrdenetamiento.sortByBubble(arreglo)
        metodosOrdenetamiento.printArreglo(arreloOrdenetadoDes);
        

        String cadena = "Este es un ejemplo de texto para ordenar";
        String[] palabras = cadena.split(regex:" ");
        String[] palabrasOrdenara = mO.sortByBubblePalabra(palabras);
        intArreglo(palabrasOrdenara);
    }
}    
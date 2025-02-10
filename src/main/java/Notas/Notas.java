package Notas;

public class Notas {
    double[] listaNotas;

    public Notas() {
        listaNotas = new double[5];
    }

    double calcularPromedio() {
        double suma = 0;

        for (int i = 1 ; i < listaNotas.length; i ++) {
            suma = suma + listaNotas[i];
        }
        return (suma / listaNotas.length);
    }

    double calcularDesviacion() {
        double prom = calcularPromedio();

        double suma = 0;

        for (double listaNota : listaNotas) {
            suma += Math.pow(listaNota - prom, 2);
        }
        return Math.sqrt(suma / listaNotas.length);
    }

    double calcularMenor() {
        double menor = listaNotas[0];

        for (int i = 0; listaNotas[i] < menor; i++) {
            menor = listaNotas[i];
        }
        return menor;
    }

    double calcularMayor() {
        double mayor = listaNotas[0];

        for (double listaNota : listaNotas) {
            if (listaNota > mayor) {
                mayor = listaNota;
            }
        }
        return mayor;
    }
}

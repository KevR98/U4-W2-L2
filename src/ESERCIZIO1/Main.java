package ESERCIZIO1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    // Per poterlo utilizzare sempre
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            // VARIABILI
            int n;
            String[] array;
            String parola;

            // CHIEDO ALL'UTENTE N VOLTE DA INSERIRE
            System.out.print("Inserisci quanti elementi vuoi inserire: ");
            n = Integer.parseInt(scanner.nextLine());

            // AGGIUNGO N VOLTE ALL'ARRAY
            array = new String[n];

            System.out.println("Inserisci " + n + " parola/e");

            // CICLO PER INSERIRE LE PAROLE NELL'ARRAY
            for (int i = 0; i < array.length; i++) {
                System.out.print((i + 1) + "a" + " parola: ");
                parola = scanner.nextLine();
                array[i] = parola;
            }

            // STAMPO L'ARRAY INSERITO
            System.out.println("Il tuo array:");
            System.out.println(Arrays.toString(array));


            // VARIABILI
            Set<String> paroleDistinte = new HashSet<>();
            Set<String> paroleDuplicate = new HashSet<>();

            // TROVA DUPLICATE E DISTINTE
            for (String found : array) {
                if (!paroleDistinte.add(found)) {
                    paroleDuplicate.add(found);
                }
            }

            // CONTROLLO DELLE PAROLE DUPLICATE
            System.out.println(" ");
            System.out.println("Parole duplicate:");
            if (paroleDuplicate.isEmpty()) {
                System.out.println("Nessuna parola duplicata trovata");
            } else {
                for (String dup : paroleDuplicate) {
                    System.out.println(dup);
                }
            }

            // STAMPA NUMERO PAROLE DISTINTE
            System.out.println(" ");
            System.out.println("Numero di parole distinte: " + paroleDistinte.size());

            // STAMPO L'ELENCO DISTINTO
            System.out.println("Elenco delle parole distinte:");
            for (String found1 : paroleDistinte) {
                System.out.println(found1);
            }

            scanner.close();

        } catch (NumberFormatException err) {
            System.out.println("Errore, non hai inserito un valore intero!");
        }
    }
}

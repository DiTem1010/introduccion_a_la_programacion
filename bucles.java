package com.open_bootcamp;

public class Estructuras{

    public static void main(String[] args) {
        // if, Else if y Else
        int numberif = 0;

        if (numberIf < 0){
            System.out.println("La variable numberIf " + numberIf + " es negativo");
        }
        else if(numberIf > 0){
            System.out.println("La variable numberIf " + numberIf + " es positivo");
        } else {
            System.out.println("La variable numberIf es 0");
        }

        //while
        int numberWhile = 1;

        while(numberWhile < 3){
            numberWhile++;
            System.out.println("La variable numberWhile ahora vale: " + numberWhile);
        }

        //do while
        int numberDoWhile = 3;
        do{
            numberDoWhile++;
            System.out.println("La variable numeroDoWhile ahora vale: " + numberDoWhile);
           }
        while(numberDoWhile < 3);

        //for
        for(int numberFor = 0; numberFor <= 5; numberFor++){
            System.out.println("La variable numeroFor ahora vale: " + numberFor);
        }

        //Switch
        String Estacion = "Otoño";
        switch(Estacion) {
            case "Verano":
                System.out.println("Estamos en verano");
                break;
            case "Invierno":
                System.out.println("Estamos en invierno");
                break;
            case "Primavera":
                System.out.println("Estamos en primavera");
                break;
            case "Otoño":
                System.out.println("Estamos en otoño");
                break;
            default:
                System.out.println("No es una estación");
        }
    }
}

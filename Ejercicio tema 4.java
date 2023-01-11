//Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año.
//Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está.
//También habrá que poner un default para cuando el valor de la variable no sea una estación.

public class Main {
    public static void main (String[] args) {
        var estacion = "Invierno";
        switch (estacion) {
            case "Primavera":
                System.out.println("Es primavera");
                break;
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            default:
                System.out.println("No es una estacion")
        }
    }
}

//Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3,
//se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

public class Main {
    public static void main (String[] args) {
        var contador = 0;
        for (var <= 3; contador++) {
            System.out.println(contador);
        }
    }
}

//Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

public class Main {
    public static void main (String[] args) {
        int contador = 0
        do {
            System.out.println(contador);
            contador++
        } while (contador < 3);
    }
}

//Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
//Incrementar el valor de la variable en uno cada vez que se ejecute.
//Mostrarlo por pantalla cada vez que se ejecute.

public class Main {
    public static void main (String[] args) {
        int contador = 0

        while (contador < 3) {
            System.out.println(contador);
            contador contador++;
        }
    }
}

//Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
//Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

public class Main {
    public static void main (String[] args) {
        int numero = 5;

        if (numero < 0) {
            System.out.println("Es negativo");
        } else if (numero > 0) {
            System.out.println("Es positivo");
        } else {
            System.out.println("Es igual a cero")
        }

    }
}
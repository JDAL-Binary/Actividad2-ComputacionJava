import java.util.Scanner; // para leer las entradas que capture el usuario

class Alumno {
    public String nombreAlumno;
    public int[] calificaciones; // se declara el arreglo para almacenar calificaciones capturadas

    public Alumno(String nombreAlumno, int[] calificaciones) {  // constructor alumno con sus parametros de nombre y calificaciones
        this.nombreAlumno = nombreAlumno;
        this.calificaciones = calificaciones;
    }

    // bucle for each
    public double calcularPromedio() { // double para obtener resultado mas preciso y que es mas usado
        int suma = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }
        return (double) suma / calificaciones.length;
    } // //  se crea variable calificacion de tipo entero para que opere for each y en el bucle solo va un campo,
    // se pone el tipo de dato del arreglo y es de tipo entero y le damos el nombre calificacion, con :calificaciones se copian todos los elementos del arreglo calificaciones

    public char calificacionFinal(double promedio) {
        if (promedio <= 50) {
            return 'F';
        } else if (promedio <= 60) {
            return 'E';
        } else if (promedio <= 70) {
            return 'D';
        } else if (promedio <= 80) {
            return 'C';
        } else if (promedio <= 90) {
            return 'B';
        } else {
            return 'A';
        }
    }

    // bucle for, establecemos un indice, donde i es la calificacion de materia 1, materia 2 y asi sucesivamente
    public void imprimirResultado() {
        double promedio = calcularPromedio();
        char calificacionFinal = calificacionFinal(promedio);
        System.out.println("Nombre del estudiante: " + nombreAlumno);
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificacion " + (i + 1) + ": " + calificaciones[i]);
        }
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificacion: " + calificacionFinal);
    }

    //escaner para ingresar nombre del alumnno y de la calificacion
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Captura el nombre del estudiante
        System.out.print("Ingrese el nombre del alumno: "); // para capturar el nombre del alumno
        String nombre = scanner.nextLine();

        // Capturar las calificaciones
        int[] calificaciones = new int[5]; // length es para el tamaño del arreglo
        for (int i = 0; i < calificaciones.length; i++) { // bucle for para leer las 5 calificaciones del alumno
            System.out.print("Ingrese la calificacion " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextInt();
        }

        // Objeto Alumno con sus atributos nombre y calificaciones
        Alumno alumno = new Alumno(nombre, calificaciones);

        // Imprime los resultados
        alumno.imprimirResultado();
    } // metodo main
} //clase alumno
import java.util.Scanner;

public class menuPricipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        genero rock = new genero("rock",
                "120bpm",
                "EU",
                "Chuck Berry",
                "festival de California",
                1950);

        genero pop = new genero("pop",
                "130bpm",
                "UK",
                "Ed Sheeran",
                "concerty",
                2023);

        genero hip_hop = new genero("hip-hop",
                "155bpm",
                "EU",
                "Eminem",
                "Coachella",
                1988);

        rock.setAnio(1900);

        System.out.println("Año rock: " + rock.getAnio());
        System.out.println("Año Hip hop: " + hip_hop.getAnio());
        System.out.println("Año pop: " + pop.getAnio());

        int anio_ingreso;

        System.out.print("Ingrese el año de rock: ");
        anio_ingreso = sc.nextInt();
        rock.setAnio(anio_ingreso);

        System.out.println("Nuevo año de rock: " + rock.getAnio());

        System.out.println("DATOS ROCK: ");
        rock.imprimirDatos();
        System.out.println("DATOS HIP HOP: ");
        hip_hop.imprimirDatos();
        System.out.println("DATOS POP: ");
        pop.imprimirDatos();
    }
}

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class examenAlumno {
    public static void main(String[] args) {
        Set alumnos = new HashSet();
        alumnos.add("Diego Lopez Martinez");
        alumnos.add("Laura Lopez Martinez");
        alumnos.add("Yesenia Heraz Samaniego");
        alumnos.add("Ricardo Montes Cruz");

        Iterator i = alumnos.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

}

package arrayList;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListCadenasMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System .in); 
		ArrayList <String> a = new ArrayList();
		int menu;
		do {
			System.out.println("1. Añadir String");
			System.out.println("2. Buscar String");
			System.out.println("3. Borrar String");
			System.out.println("4. Listar Array");
			System.out.println("5. Salir");
			menu=teclado.nextInt();
			switch (menu) {
			case 1:
				System.out.println("Introduce el String");
				a.add(teclado.next());
				break;
			case 2:
				String buscar;
				System.out.println("Introduce el String a buscar");
				buscar = teclado.next();
				if (a.contains(buscar)) {
					System.out.println("Esta en el array");
				}
				else {
					System.out.println("No esta en el Array");
				}
				break;
			case 3:
				System.out.println("Introduce el String a eliminar");
				a.remove(teclado.next());
				break;
			case 4:
				for (int i = 0; i<a.size();i++) {
					System.out.println(a.get(i));
				}
				
				for (String var:a) {
					System.out.println(var);
				}
				
				Iterator<String> i = a.iterator();
				while (i.hasNext()) {
				 System.out.println(i.next());
				}
				
				ListIterator<String> li = a.listIterator();
				while (li.hasNext()) {
				 System.out.println(li.next());
				}
				
				break;
			case 5:
				System.out.println("Agur!");
				break;
			}
		}while(menu!=5);
	}
}

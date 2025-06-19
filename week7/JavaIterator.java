import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class JavaIterator {
	public static void main(String[] args) {
		ArrayList<String> bikes=new ArrayList<>(Arrays.asList("fz", "pulsar","bullet"));
		Iterator<String> it=bikes.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
			if (bikes.equals("pulsar")) {
				it.remove();
			}
		}
		
	}

}
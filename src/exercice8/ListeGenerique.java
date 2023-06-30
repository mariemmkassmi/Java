package exercice8;
import java.util.*;

public class ListeGenerique<T> {
	 private List<T> elements;

	    public ListeGenerique() {
	        elements = new ArrayList<>();
	    }

	    public void ajouterElement(T element) {
	        elements.add(element);
	    }

	    public List<T> getElements() {
	        return elements;
	    }

	    public T getElement(int index) {
	        return elements.get(index);
	    }

	    public int taille() {
	        return elements.size();
	    }

	    public void vider() {
	        elements.clear();
	    }
}

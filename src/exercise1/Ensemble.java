package exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Ensemble {

    private List<Integer> elements = new ArrayList<>();

    public Ensemble(Integer... elements) {
        Arrays.stream(elements).forEach(this::ajoute);
    }

    public Ensemble(List<Integer> elements) {
        elements.forEach(this::ajoute);
    }

    public void ajoute(Integer a) {
        if (!elements.contains(a)) {
            elements.add(a);
        }
    }

    public int taille() {
        return elements.size();
    }

    public int occurence(Integer a) {
        return (int) elements.stream().filter(element -> element.equals(a)).count();
    }

    public Integer getElement(int i) {
        return elements.get(i);
    }

    public Ensemble union(Ensemble x) {
        Ensemble union = new Ensemble(this.elements);
        x.elements.forEach(union::ajoute);
        return union;
    }

    Ensemble intersection(Ensemble x) {
        Ensemble result = new Ensemble();
        this.elements.forEach(element -> {
            if (x.elements.contains(element)) {
                result.ajoute(element);
            }
        });
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ensemble ensemble = (Ensemble) o;
        return Objects.equals(elements, ensemble.elements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(elements);
    }

    @Override
    public String toString() {
        return elements.toString();
    }
}

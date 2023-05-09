import java.util.Comparator;

public class HumanNameComporator <E extends GenThreeItem> implements Comparator<E> {
    @Override
    public int compare(E human1, E human2) {
        return human1.getName().compareTo(human2.getName());
    }
}

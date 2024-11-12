package homework_44.containers_and_parcels;

import java.util.Iterator;
import java.util.List;

public class Container implements Iterable<Box> {
    private final String label;
    private final List<Box> boxes;

    public Container(String label, List<Box> boxes) {
        this.label = label;
        this.boxes = boxes;
    }

    public String getLabel() {
        return label;
    }

    public List<Box> getBoxes() {
        return boxes;
    }

    @Override
    public Iterator<Box> iterator() {
        return boxes.iterator();
    }

    public int getTotalParcels() {
        return boxes.stream().mapToInt(Box::getParcelCount).sum();
    }
}

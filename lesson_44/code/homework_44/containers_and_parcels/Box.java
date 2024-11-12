package homework_44.containers_and_parcels;

import java.util.Iterator;
import java.util.List;

public class Box implements Iterable<Parcel> {
    private final List<Parcel> parcels;

    public Box(List<Parcel> parcels) {
        this.parcels = parcels;
    }

    public List<Parcel> getParcels() {
        return parcels;
    }

    @Override
    public Iterator<Parcel> iterator() {
        return parcels.iterator();
    }

    public int getParcelCount() {
        return parcels.size();
    }
}

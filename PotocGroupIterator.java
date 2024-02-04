import java.util.List;

import javax.swing.GroupLayout.Group;
import javax.swing.text.html.HTMLDocument.Iterator;

public class PotocGroupIterator implements Iterator<Potoc> {

    private int count;

    private final List<Potoc> potocList;

    public PotocGroupIterator(PotocGroup potocGroup) {
        this.count = 0;
        this.potocList = potocGroup.getPotocList();
    }

    @Override
    public boolean hasNext() {
        return count < potocList.size() - 1;
    }

    @Override
    public Potoc next() {
        if (!hasNext()) {
            return null;

        }
        count ++;
        return potocList.get(count);
    }

    @Override
    public void remove() {
        potocList.remove(count);
    }

    
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PotocGroupService {

    private PotocGroup potocGroup;

    public List<Potoc> getSortedPotocList() {
        List<Potoc> potocList = new ArrayList<>(potocGroup.getPotocList());
        Collections.sort(potocList);
        return potocList;
    }

    public List<Potoc> getSortedPotocByNG() {
        List<Potoc> potocList = new ArrayList<>(potocGroup.getPotocList());
        potocList.sort(new PotocComparator());
        return potocList;
    }
    
}

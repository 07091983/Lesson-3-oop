public class PotocComparator implements Comparator<Potoc> {
    @Override
    public int compare(Potoc o1, Potoc o2) {
        int resultofComparing = o1.getNumberGroup().compareTo(o2.getNumberGroup());
        if (resultofComparing == 0) {

        }else {
            return resultofComparing;
        }
    }
    
}

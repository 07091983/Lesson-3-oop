public class Potoc implements Comparable<Potoc>{

    private Long potocId;

    public Long getPotocId() {
        return potocId;
    }

    public void setPotocId(Long potocId) {
        this.potocId = potocId;
    }

    private String numberGroup;

    public String getNumberGroup() {
        return numberGroup;
    }

    public void setNumberGroup(String numberGroup) {
        this.numberGroup = numberGroup;
    }

    @Override
    public int compareTo(Potoc o) {
        // TODO Auto-generated method stub
        return this.potocId.compareTo(o.potocId);
    }
}

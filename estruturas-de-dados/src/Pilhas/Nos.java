package Pilhas;

public class Nos {
    private int dado;
    private Nos refNo = null;

    public Nos() {

    }

    public Nos(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public Nos getRefNo() {
        return refNo;
    }

    public void setRefNo(Nos refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "Nos{" +
                "dado=" + dado +
                '}';
    }
}

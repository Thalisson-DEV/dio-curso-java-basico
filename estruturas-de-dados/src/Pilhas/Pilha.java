package Pilhas;

public class Pilha {

    private Nos refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public void push(Nos novoNo) {
        Nos refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public Nos pop() {
        if (!isEmpty()) {
            Nos noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    public Nos top() {
        return refNoEntradaPilha;
    }

    public boolean isEmpty() {
        return refNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "-----------\n";
        stringRetorno += "     Pilha\n";
        stringRetorno += "-----------\n";

        Nos noAuxiliar = refNoEntradaPilha;

        while (true) {
            if(noAuxiliar != null) {
                stringRetorno += "[No{dadp=" + noAuxiliar.getDado()  +"}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            } else {
                break;
            }
        }

        stringRetorno += "===========\n";
        return stringRetorno;
    }
}

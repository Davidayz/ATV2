public class PilhaDinamica {
    NoInteiro topo;

    public PilhaDinamica() {
        this.topo = new NoInteiro(null);
    }

    public void empilhar(int numero) {
        if (estaVazia()) {
            this.topo.setConteudo(numero);
        } else {
            NoInteiro novoNo = new NoInteiro(numero);
            novoNo.setProx(this.topo);
            this.topo = novoNo;
        }
        System.out.println("Número " + numero + " empilhado com sucesso.");
    }

    public void desempilhar() {
        if (!estaVazia()) {
            System.out.println("Número " + this.topo.getConteudo() + " desempilhado.");
            if (this.topo.getProx() == null) {
                this.topo.setConteudo(null);
            } else {
                this.topo = this.topo.getProx();
            }
        }
    }

    public void topo() {
        if (!estaVazia()) {
            System.out.println("Topo da pilha: " + this.topo.getConteudo());
        }
    }

    public void exibir() {
        if (!estaVazia()) {
            NoInteiro aux = this.topo;
            while (aux != null) {
                if (aux.getConteudo() != null) {
                    System.out.println(aux.getConteudo());
                }
                aux = aux.getProx();
            }
        }
    }

    private boolean estaVazia() {
        if (this.topo.getConteudo() == null) {
            System.out.println("A pilha está vazia!");
            return true;
        }
        return false;
    }
}
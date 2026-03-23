public class PilhaSimples {
    Integer[] pilha;

    public PilhaSimples(int tamanho) {
        this.pilha = new Integer[tamanho];
    }

    public void empilhar(int numero) {
        if (!estaCheia()) {
            for (int i = 0; i < this.pilha.length; i++) {
                if (this.pilha[i] == null) {
                    this.pilha[i] = numero;
                    System.out.println("Número " + numero + " empilhado com sucesso.");
                    return;
                }
            }
        }
    }

    public void desempilhar() {
        if (!estaVazia()) {
            for (int i = this.pilha.length - 1; i >= 0; i--) {
                if (this.pilha[i] != null) {
                    System.out.println("Número " + this.pilha[i] + " desempilhado.");
                    this.pilha[i] = null;
                    return;
                }
            }
        }
    }

    public void topo() {
        if (!estaVazia()) {
            for (int i = this.pilha.length - 1; i >= 0; i--) {
                if (this.pilha[i] != null) {
                    System.out.println("Topo da pilha: " + this.pilha[i]);
                    return;
                }
            }
        }
    }

    public void exibir() {
        if (!estaVazia()) {
            for (int i = this.pilha.length - 1; i >= 0; i--) {
                if (this.pilha[i] != null) {
                    System.out.println(this.pilha[i]);
                }
            }
        }
    }

    private boolean estaCheia() {
        if (this.pilha[this.pilha.length - 1] != null) {
            System.out.println("A pilha está cheia!");
            return true;
        }
        return false;
    }

    private boolean estaVazia() {
        if (this.pilha[0] == null) {
            System.out.println("A pilha está vazia!");
            return true;
        }
        return false;
    }
}
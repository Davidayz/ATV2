public class MainPilhaDinamica {
    static void main() {
        PilhaDinamica pilhaDinamica = new PilhaDinamica();

        pilhaDinamica.empilhar(10);
        pilhaDinamica.empilhar(20);
        pilhaDinamica.empilhar(30);
        pilhaDinamica.exibir();
        pilhaDinamica.topo();
        pilhaDinamica.desempilhar();
        pilhaDinamica.exibir();
        pilhaDinamica.desempilhar();
        pilhaDinamica.desempilhar();
        pilhaDinamica.desempilhar();
    }
}

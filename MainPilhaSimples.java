public class MainPilhaSimples {
    static void main() {
        PilhaSimples pilhaSimples = new PilhaSimples(4);
        pilhaSimples.empilhar(10);
        pilhaSimples.empilhar(20);
        pilhaSimples.empilhar(30);
        pilhaSimples.empilhar(40);
        pilhaSimples.empilhar(50);
        pilhaSimples.exibir();
        pilhaSimples.topo();
        pilhaSimples.desempilhar();
        pilhaSimples.exibir();
    }
}

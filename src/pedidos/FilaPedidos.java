package pedidos;

import java.util.LinkedList;
import java.util.Queue;

public class FilaPedidos {
    private final Queue<Pedidos> fila = new LinkedList<>();
    private final int capacidade;

    public FilaPedidos (int capacidade){
        this.capacidade = capacidade;
    }
    public synchronized void adicionarPedido(Pedidos pedidos) throws InterruptedException{ //ira trabalhar de forma sincronizada

    }
}

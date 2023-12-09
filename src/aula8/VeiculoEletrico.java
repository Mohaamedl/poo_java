package aula8;

public interface VeiculoEletrico{
    public int autonomia(); // devolve autonomia restante
    public void carregar(int percentagem); // simula um carregamento até ‘percentagem’
}
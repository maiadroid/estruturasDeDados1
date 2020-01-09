package exerc_aulas;

public interface IListaInteiros {
	
	// Define os n�meros e suas posi��es
	public void inserirInicio(Integer num);
	public void inserirFim(Integer num);
	public void inserirPosicao(Integer num, Integer p);
	
	// Altera a posi��o de um n�mero
	public void alterar(Integer p, Integer num);
	
	// Remove n�meros e posi��es
	public void removerInicio();
	public void removerFim();
	public void removerPosicao(Integer p);
	public void remover(Integer num);
	
	// Retorna n�meros e posi��es
	public Integer getNumero(Integer p);
	public Integer posicao(Integer num); 
	
	// Verifica poss�veis estados da lista
	public boolean pertence(Integer num);
	public boolean estaVazia();
	
	// Retorna a quantidade de intens da lista
	public Integer quantidade();
	
	// Esvazia a lista
	public void removerTodos();
}

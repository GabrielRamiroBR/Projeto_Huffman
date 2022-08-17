
public class Arvbin
{
	protected char simbolo;
	protected int frequencia;
	protected Arvbin esq, dir;
	

	public Arvbin(char simbolo, int frequencia)
	{
		this.simbolo = simbolo;
		this.frequencia = frequencia;

	}

	public Arvbin(char simbolo, int frequencia, Arvbin esq, Arvbin dir)
	{
		this.simbolo = simbolo;
		this.frequencia = frequencia;
		this.esq = esq;
		this.dir = dir;
	}
	

	public void mostra()
	{
		System.out.print(" ( "+ frequencia);
		if(esq == null && dir == null)
			System.out.print(" "+ simbolo);

		if(esq != null){
			this.esq.mostra();
		}
		if(dir != null){
			this.dir.mostra();
		}
		System.out.print(" ) ");

	}
	


	public void mostraCodigo(String str)
	{
		if(this.esq == null && this.dir == null){
			System.out.println("Simbolo: "+ simbolo + " Codificacao: " + str);
			return;
		}
		if(esq != null)
			esq.mostraCodigo(str + "0");
		if(dir != null)
			dir.mostraCodigo(str + "1");
	}
}
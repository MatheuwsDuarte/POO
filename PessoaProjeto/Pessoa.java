public class Pessoa{

	private int cpf;
	private String nome;
	private Endereco ender = new Endereco();
	private Cidade cid = new Cidade();

	public Pessoa(){
	
		cpf= 10;
		nome= "";
		ender = new Endereco();	

	}

	public Pessoa(int cpf, String nome, Endereco ender){
	
		this.cpf = cpf;
		this.nome = nome;
		this.ender = ender;	

	}

	public Cidade getCid(){
		
		return cid;	

	}
	public void setCid(Cidade cid){
	
		this.cid = cid;

	}

//===============================================

	public Endereco getEnder(){
		return ender;
	}

	public void setEnder(Endereco ender){
		this.ender = ender;
	}

//===============================================

	public int getCpf(){
		return cpf;
	}

	public String getNome(){
		return nome;
	}

	public void setCpf(int cpf){
		this.cpf = cpf;
	}

	public void setNome(String nome){
		this.nome = nome;
	}
	
}
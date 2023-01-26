public class Endereco{

	private String rua ="";
	private int num = 0;
	private Cidade cid = new Cidade();

	public Cidade getCid(){
		
		return cid;	

	}
	public void setCid(Cidade cid){
	
		this.cid = cid;

	}

	public int getNum(){
		return num;
	}

	public String getRua(){
		return rua;
	}

	public void setNum(int num){
		this.num = num;
	}

	public void setRua(String rua){
		this.rua = rua;
	}
	
}
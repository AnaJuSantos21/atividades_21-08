package curso21_08;

public class fornecedor {
	int id;
	String razaoSocial;
	String nomeFantasia;
	String cnpj;
	String endereco;
	String fone;
	String email;
	String inscricaoEstadual;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomefantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public String getCnpj() { 
		return cnpj;
	}
	public void setCnpj(String cnpj) { 
		this.cnpj = cnpj;
	}
	public String getEndereco() { 
		return endereco;
	}
	public void setEndereco(String endereco) { 
		this.endereco = endereco;

	}
	public String getFone() { 
		return fone;
	}
	public void setFone(String fone) { 
		this.fone = fone;

	}
	public String getEmail() { 
		return email;
	}
	public void setEmail(String email) { 
		this.email = email;

	}
	public String getInscricaoEstadual() { 
		return inscricaoEstadual;
	}
	public void setInscricaoEstadual(String inscricaoEstadual) { 
		this.inscricaoEstadual = inscricaoEstadual;

	}
	
	public String vender() {
		return "Vendendo";
	}
	public String comunicar() {
		return "comunicando";
	}

	


}



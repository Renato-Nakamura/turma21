package Lista5;

public class Cliente {
	protected String nome, email, cpf, cep;
	private int anoNascimento;
	private char genero;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}
	
	public void Infos() {
		System.out.printf("O nome do cliente � : %s \n",nome);
		System.out.printf("O email do cliente � : %s \n",email);
		System.out.printf("O CPF do cliente � : %s \n",cpf);
		System.out.printf("O CEP do cliente � : %s \n",cep);
		System.out.printf("O ano de nascimento do cliente � : %d \n",anoNascimento);
		System.out.printf("O genero do cliente � : %c \n",genero);
		
	}

}

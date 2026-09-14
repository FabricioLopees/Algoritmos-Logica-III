package laboratorio;

public class Laboratorio {

	public static void main(String[] args) {
		
		class Pessoa {
			private String nome;
			private String sobrenome;
			
			public String getNome() {
				return this.nome;
			}
			
			public String getSobrenome() {
				return this.sobrenome;
			}
			
			public void setNome(String nome) {
				this.nome = nome;
			}
			
			public void setSobrenome(String sobrenome) {
				this.sobrenome = sobrenome;
			}
			
			Pessoa(String nome, String sobrenome){
				this.nome = nome;
				this.sobrenome = sobrenome;
			}
		}
		
		
		Pessoa ref1 = new Pessoa("Fabricio", "Lopes");
		Pessoa ref2 = ref1;
		
		System.out.println("ORIGINAL: "+ref1.getNome()+" "+ref1.getSobrenome());
		
		// Alterar somente ref2 e exibir ref1 para ver se mudou também na ref1 - o esperado é que mude, pois ambos apontam para o mesmo objeto
		
		ref2.setNome("Fabricin");
		ref2.setSobrenome("Xavier");
		
		System.out.println("ALTERADO O REF2 E EXIBIDO REF1: "+ref1.getNome()+" "+ref1.getSobrenome());
	}

}

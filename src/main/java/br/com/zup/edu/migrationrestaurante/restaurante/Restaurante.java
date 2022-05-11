package br.com.zup.edu.migrationrestaurante.restaurante;

import javax.persistence.*;

@Entity
@Table(name = "restaurante")
public class Restaurante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String nome_fantasia;
	
	@Column(nullable = false, unique = true)
	private String cnpj;
	
	@Column(nullable = false)
	private String endereco;
	
	private String bairro;
	
	private String cidade;
	
	private String estado;
	
	private String cep;
	
	private String telefone;
	
	private String celular;
	
	private String email;
	
	private String site;

	private Boolean usaCupom;

	@Enumerated(EnumType.STRING)
	private ClassificacaoRestaurante classificacao;
	
	public Restaurante() {
	}
	
}

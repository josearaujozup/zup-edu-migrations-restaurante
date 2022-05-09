package br.com.zup.edu.migrationrestaurante.restaurante;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
	
	public Restaurante() {
	}
	
}

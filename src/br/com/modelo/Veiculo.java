package br.com.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Veiculo {
	@Id
	@SequenceGenerator(name="IdVeiculo", sequenceName="seq_veiculo")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="IdVeiculo")
	private Long id;
	
	@NotEmpty(message="O campo marca n�o deve ser vazio!")
	private String marca;
	
	@NotEmpty(message="O campo modelo n�o deve ser vazio!")
	private String modelo;
	
	@NotEmpty(message="O campo placa n�o deve ser vazio!")
	@Column(unique=true)
	private String placa;
	
	/*@NotEmpty(message="O campo Ano de Fabrica��o n�o deve ser vazio!")*/
	private Integer anoFabricacao;
	
	/*@NotEmpty(message="O campo Ano de Modelo n�o deve ser vazio!")*/
	private Integer anoModelo;
	
	@ManyToOne
	private Cliente cliente;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public Integer getAnoModelo() {
		return anoModelo;
	}
	public void setAnoModelo(Integer anoModelo) {
		this.anoModelo = anoModelo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
}
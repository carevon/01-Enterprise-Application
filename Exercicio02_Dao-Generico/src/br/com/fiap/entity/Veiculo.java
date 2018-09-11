package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_VEICULO")
@SequenceGenerator(allocationSize=1, name="veiculo", sequenceName="SQ_T_VEICULO")
public class Veiculo {
	
	@Id
	@Column(name="cd_veiculo",nullable=false)
	@GeneratedValue(generator="veiculo", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="ds_placa", nullable=false, length=9)
	private String placa;
	
	@Column(name="ds_cor",nullable=false, length=20)
	private String cor;
	
	@Column(name="nr_ano")
	private int ano;

	
	//Construtor Cheio
	public Veiculo(String placa, String cor, int ano) {
		super();
		setPlaca(placa);
		setCor(cor);
		setAno(ano);
	}

	//Construtor Vazio
	public Veiculo() {
		super();
	}


	//Getter's and Setter's
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
}

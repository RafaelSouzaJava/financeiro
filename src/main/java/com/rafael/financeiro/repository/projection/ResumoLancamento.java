package com.rafael.financeiro.repository.projection;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.rafael.financeiro.model.TipoLancamento;

public class ResumoLancamento {
	
	private Long codigo;
	private String descricao;
	private LocalDate dataVenciemnto;
	private LocalDate dataPagamento;
	private BigDecimal valor;
	private TipoLancamento tipo;
	private String categoria;
	private String pessoa;
	
	
	
	public ResumoLancamento(Long codigo, String descricao, LocalDate dataVenciemnto, LocalDate dataPagamento,
			BigDecimal valor, TipoLancamento tipo, String categoria, String pessoa) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.dataVenciemnto = dataVenciemnto;
		this.dataPagamento = dataPagamento;
		this.valor = valor;
		this.tipo = tipo;
		this.categoria = categoria;
		this.pessoa = pessoa;
	}
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDate getDataVenciemnto() {
		return dataVenciemnto;
	}
	public void setDataVenciemnto(LocalDate dataVenciemnto) {
		this.dataVenciemnto = dataVenciemnto;
	}
	public LocalDate getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(LocalDate dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public TipoLancamento getTipo() {
		return tipo;
	}
	public void setTipo(TipoLancamento tipo) {
		this.tipo = tipo;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getPessoa() {
		return pessoa;
	}
	public void setPessoa(String pessoa) {
		this.pessoa = pessoa;
	}
	
	

}

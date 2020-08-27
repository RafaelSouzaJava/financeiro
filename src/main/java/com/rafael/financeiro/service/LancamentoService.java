package com.rafael.financeiro.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.rafael.financeiro.model.Lancamento;
import com.rafael.financeiro.model.Pessoa;
import com.rafael.financeiro.repository.LancamentoRepository;
import com.rafael.financeiro.repository.PessoaRepository;
import com.rafael.financeiro.service.exception.PessoaInexistenteOuInativaException;


@Service
public class LancamentoService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	LancamentoRepository lancamentoRepository;

	public Lancamento salvar(@Valid Lancamento lancamento) {
		Pessoa pessoa = pessoaRepository.findById(lancamento.getPessoa().getCodigo())
				.orElseThrow(() -> new EmptyResultDataAccessException(1));
		if (pessoa == null || pessoa.isInativo() ) {
			throw new PessoaInexistenteOuInativaException();
		}		
		return lancamentoRepository.save(lancamento);
	}
	
	

}


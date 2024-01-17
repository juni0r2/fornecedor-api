package br.com.microservice.loja.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.microservice.loja.domain.model.InfoFornecedor;
import br.com.microservice.loja.domain.repository.InfoFornecedorRepository;

@Service
public class InfoFornecedorService {

	@Autowired
	private InfoFornecedorRepository infoFornecedorRepository;

	public InfoFornecedor getRetornaEstadoFornecedor(String estado) {
		return this.infoFornecedorRepository.findByEstado(estado);
	}

}

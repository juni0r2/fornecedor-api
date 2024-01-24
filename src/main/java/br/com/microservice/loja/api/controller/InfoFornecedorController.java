package br.com.microservice.loja.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.microservice.loja.api.assembler.InfoFornecedorAssembler;
import br.com.microservice.loja.api.dto.InfoFornecedorDTO;
import br.com.microservice.loja.domain.model.InfoFornecedor;
import br.com.microservice.loja.domain.service.InfoFornecedorService;

@RestController
@RequestMapping("/info")
public class InfoFornecedorController {

	private static final Logger LOG = LoggerFactory.getLogger(InfoFornecedorController.class);
	
	@Autowired
	private InfoFornecedorService infoFornecedorService;
	
	@Autowired
	private InfoFornecedorAssembler infoFornecedorAssembler;
	
	@GetMapping("/{estado}")
	public InfoFornecedorDTO getRetornaFornecedor(@PathVariable String estado) {
		LOG.info("recebido pedido de informações do fornecedor de {}", estado);
		InfoFornecedor infoFornecedor = this.infoFornecedorService.getRetornaEstadoFornecedor(estado);
		return this.infoFornecedorAssembler.toDto(infoFornecedor);
	}
}

package br.com.microservice.loja.api.assembler;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.microservice.loja.api.dto.InfoFornecedorDTO;
import br.com.microservice.loja.domain.model.InfoFornecedor;

@Component
public class InfoFornecedorAssembler {

	@Autowired
	private ModelMapper modelMapper;

	public InfoFornecedorDTO toDto(InfoFornecedor infoFornecedor) {
		return modelMapper.map(infoFornecedor, InfoFornecedorDTO.class);
	}
}

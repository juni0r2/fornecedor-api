package br.com.microservice.loja.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.microservice.loja.domain.model.InfoFornecedor;

@Repository
public interface InfoFornecedorRepository extends CrudRepository<InfoFornecedor, Long> {
	
	InfoFornecedor findByEstado(String estado);
}

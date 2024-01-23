package br.com.microservice.loja.domain.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.microservice.loja.domain.model.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, Long>{

}

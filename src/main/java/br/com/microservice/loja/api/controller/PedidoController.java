package br.com.microservice.loja.api.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.microservice.loja.api.dto.ItemDoPedidoDTO;
import br.com.microservice.loja.domain.model.Pedido;
import br.com.microservice.loja.domain.service.PedidoService;

@RestController
@RequestMapping("pedido")
public class PedidoController {

	private static final Logger LOG = LoggerFactory.getLogger(PedidoController.class);
	
	@Autowired
	private PedidoService pedidoService;
	
	@GetMapping("/{id}")
	public Pedido getPedidoPorId(@PathVariable Long id) {
		return pedidoService.getPedidoPorId(id);
	}
	
	@PostMapping
	public Pedido realizaPedido(@RequestBody List<ItemDoPedidoDTO> produtos) {
		LOG.info("Pedido recebido");
		return pedidoService.realizaPedido(produtos);
	}
}

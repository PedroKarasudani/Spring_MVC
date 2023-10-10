package br.com.alura.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Apple iPhone 15");
		pedido.setUrlImagem("https://m.media-amazon.com/images/I/41RpmPYWXLL._AC_SX679_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/Apple-iPhone-15-256-GB/dp/B0CHXRDKQF");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}

}

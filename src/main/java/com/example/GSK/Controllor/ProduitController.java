package com.example.GSK.Controllor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.GSK.Model.Produit;
import com.example.GSK.Model.User;
import com.example.GSK.Services.ProduitService;
import com.example.GSK.Services.UserService;

@RestController
@RequestMapping("/api/produit/")
@CrossOrigin(origins = "*")
public class ProduitController {
	@Autowired
	private ProduitService produitService;
	@Autowired
	private UserService userService;
	@GetMapping(path = "all")
	public Iterable<Produit> produits() {
		return produitService.findAll();
	}

	@PostMapping(path = "/add/{id}")
	public Produit addProduit(@RequestBody Produit p,@PathVariable int id) {
	User user=	this.userService.findbyid(id).get() ;
	p.setUser(user);
		return produitService.create(p);
	}

	@DeleteMapping("/{id}")
	public void deleteProduit(@PathVariable int id) {
		produitService.Delete(id);

	}

}

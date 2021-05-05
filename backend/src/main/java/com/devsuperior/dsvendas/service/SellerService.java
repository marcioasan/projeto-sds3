package com.devsuperior.dsvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsvendas.dto.SellerDTO;
import com.devsuperior.dsvendas.entities.Seller;
import com.devsuperior.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findAll() {
		List<Seller> result = repository.findAll();
		
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList()); //Semana Spring React Episódio 2.mp4 - 1h - A função map converte a coleção retornada do repository em uma nova coleção, no caso, de um SellerDTO. Para cada x da lista original, cria um objeto SellerDTO com o x como argumento. Converte essa nova lista em uma nova lista com o collect. 
	}
}

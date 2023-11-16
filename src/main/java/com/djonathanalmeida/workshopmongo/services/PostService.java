package com.djonathanalmeida.workshopmongo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.djonathanalmeida.workshopmongo.domain.Post;
import com.djonathanalmeida.workshopmongo.repository.PostRepository;
import com.djonathanalmeida.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	 
	@Autowired
	private PostRepository repo;
	
	
	public Post findById(String id){
		Post user = repo.findById(id).orElse(null);
		if(user == null) {
			throw new ObjectNotFoundException("Objeto não encontrado");
		}
		return user;
	}
	
	
}

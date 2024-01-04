package com.generation.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.blogpessoal.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>{

	public List <Postagem> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);
	// JPA => trás todos os metodos para manipular o BD
	// cadatrar, atualizar, ...
	
	// SELECT * FROM tb_postagens
	// INSERT ... from tb_postagens
	// DELETE ... tb_postagens
}

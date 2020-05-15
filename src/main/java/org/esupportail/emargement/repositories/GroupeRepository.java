package org.esupportail.emargement.repositories;

import java.util.List;

import org.esupportail.emargement.domain.Groupe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupeRepository extends JpaRepository<Groupe, Long> {
	
	List<Groupe> findByNom(String nom);
	
	Long countByNom(String nom);
    
}

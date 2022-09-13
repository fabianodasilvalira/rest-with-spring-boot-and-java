package br.com.fabiano.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fabiano.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {}
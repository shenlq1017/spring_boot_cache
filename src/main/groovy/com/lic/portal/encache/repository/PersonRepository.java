package com.lic.portal.encache.repository;

import com.lic.portal.encache.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
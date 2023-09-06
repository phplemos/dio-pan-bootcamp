package com.phplemos.apirest.Old;

import com.phplemos.apirest.Old.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {

}

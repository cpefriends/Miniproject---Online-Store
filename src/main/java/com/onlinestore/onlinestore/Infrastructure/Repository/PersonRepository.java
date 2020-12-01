package com.onlinestore.onlinestore.Infrastructure.Repository;

import com.onlinestore.onlinestore.Infrastructure.Entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Long> {

    PersonEntity findByName(String name);
}

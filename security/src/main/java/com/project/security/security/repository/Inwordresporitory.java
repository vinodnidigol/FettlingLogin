package com.project.security.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.project.security.security.pojo.Inword;



@Component
@Repository
public interface Inwordresporitory extends JpaRepository<Inword, Integer> {

}

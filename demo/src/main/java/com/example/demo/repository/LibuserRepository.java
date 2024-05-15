package com.example.demo.repository;

import com.example.demo.entity.Libuser;
import com.example.demo.model.UserSpecification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface LibuserRepository extends JpaRepository<Libuser, Integer>, JpaSpecificationExecutor<Libuser> {

}
package com.example.demo.model;

import com.example.demo.entity.Libuser;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import lombok.Data;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;

@Data
public class UserSpecification implements Specification<Libuser> {
    private UserDto body;

    public UserSpecification(UserDto body) {
        this.body = body;
    }


    @Override
    public Predicate toPredicate(Root<Libuser> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
        List<Predicate> predicates = new ArrayList<>();
        if (body.getId() != null) {
            predicates.add(criteriaBuilder.equal(root.get("id"), body.getId()));
        }
        if (body.getName() != null) {
            predicates.add(criteriaBuilder.equal(root.get("name"), body.getName()));
        }
        if (body.getEmail() != null) {
            predicates.add(criteriaBuilder.equal(root.get("email"), body.getEmail()));
        }
        return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
    }
}

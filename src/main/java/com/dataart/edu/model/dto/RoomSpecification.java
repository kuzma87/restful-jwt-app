package com.dataart.edu.model.dto;

import com.dataart.edu.model.Room;
import com.dataart.edu.model.Room_;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by akuzmenko on 3/20/2017.
 */
public class RoomSpecification {

    public static Specification<Room> findByCriteria(Long hotelId, RoomSearchCriteria criteria) {

        return (root, criteriaQuery, criteriaBuilder) -> {

            List<Predicate> predicates = new ArrayList<>();

            predicates.add(criteriaBuilder.equal(root.get(Room_.hotelId), hotelId));

            if (criteria.getHasTv()!= null) {
                predicates.add(criteriaBuilder.equal(root.get(Room_.hasTv), criteria.getHasTv()));
            }

            if (criteria.getHasBalcony() != null) {
                predicates.add(criteriaBuilder.equal(root.get(Room_.hasBalcony), criteria.getHasBalcony()));
            }

            if (criteria.getHasAirCond() != null) {
                predicates.add(criteriaBuilder.equal(root.get(Room_.hasAirCond), criteria.getHasAirCond()));
            }

            return criteriaBuilder.and(predicates.toArray(new Predicate[]{}));
        };
    }
}

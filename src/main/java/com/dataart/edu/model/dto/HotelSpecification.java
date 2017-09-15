package com.dataart.edu.model.dto;

import com.dataart.edu.model.Hotel;
import com.dataart.edu.model.Hotel_;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by akuzmenko on 3/20/2017.
 */
public class HotelSpecification {

    public static Specification<Hotel> findByCriteria(HotelSearchCriteria criteria) {

        return (root, criteriaQuery, criteriaBuilder) -> {

            List<Predicate> predicates = new ArrayList<>();

            if (criteria.getHasPool() != null) {
                predicates.add(criteriaBuilder.equal(root.get(Hotel_.hasPool), criteria.getHasPool()));
            }

            if (criteria.getHasSlides() != null) {
                predicates.add(criteriaBuilder.equal(root.get(Hotel_.hasSlides), criteria.getHasSlides()));
            }

            if (criteria.getHasTennis() != null) {
                predicates.add(criteriaBuilder.equal(root.get(Hotel_.hasTennis), criteria.getHasTennis()));
            }

            return criteriaBuilder.and(predicates.toArray(new Predicate[]{}));
        };
    }
}

package com.dataart.edu.repository;

import com.dataart.edu.model.Hotel;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Collection;
import java.util.List;

/**
 * Created by akuzmenko on 2/28/2017.
 */
public interface HotelRepository  extends JpaRepository<Hotel, Long>, JpaSpecificationExecutor {
    Collection<Hotel> findByName(String name);
}

package com.dataart.edu.repository;

import com.dataart.edu.model.Room;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by akuzmenko on 3/6/2017.
 */
public interface RoomRepository extends JpaRepository<Room, Long>, JpaSpecificationExecutor {
}

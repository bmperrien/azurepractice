package com.revature.azurepractice.beans.repos;

import com.revature.azurepractice.beans.entities.Complaints;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComplaintRepository extends JpaRepository<Complaints, Integer> {
    List<Complaints> findByName(String name);
}

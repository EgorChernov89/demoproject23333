package com.example.demoproject23333.repositories;

import com.example.demoproject23333.model.ObjParams;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObjParamsRepository extends JpaRepository<ObjParams,Long> {
    ObjParams findByObjName(String objName);
}

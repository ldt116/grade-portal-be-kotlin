package com.hcmut.gradeportal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcmut.gradeportal.entities.SheetMark;

@Repository
public interface SheetMarkRepository extends JpaRepository<SheetMark, String> {

}

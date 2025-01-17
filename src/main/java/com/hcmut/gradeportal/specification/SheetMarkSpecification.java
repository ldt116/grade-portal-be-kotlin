package com.hcmut.gradeportal.specification;

import org.springframework.data.jpa.domain.Specification;

import com.hcmut.gradeportal.entities.SheetMark;
import com.hcmut.gradeportal.entities.enums.SheetMarkStatus;

public class SheetMarkSpecification {

    public static Specification<SheetMark> hasStudentId(String studentId) {
        return (root, query, builder) -> (studentId == null || studentId.equals("")) ? null
                : builder.equal(root.get("student").get("id"), studentId);
    }

    public static Specification<SheetMark> hasTeacherId(String teacherId) {
        return (root, query, builder) -> (teacherId == null || teacherId.equals("")) ? null
                : builder.equal(root.get("teacher").get("id"), teacherId);
    }

    public static Specification<SheetMark> hasCourseCode(String courseCode) {
        return (root, query, builder) -> (courseCode == null || courseCode.equals("")) ? null
                : builder.equal(root.get("courseClass").get("id").get("courseCode"), courseCode);
    }

    public static Specification<SheetMark> hasSemesterCode(String semesterCode) {
        return (root, query, builder) -> (semesterCode == null || semesterCode.equals("")) ? null
                : builder.equal(root.get("courseClass").get("id").get("semesterCode"), semesterCode);
    }

    public static Specification<SheetMark> hasClassName(String className) {
        return (root, query, builder) -> (className == null || className.equals("")) ? null
                : builder.equal(root.get("courseClass").get("id").get("className"), className);
    }

    public static Specification<SheetMark> hasSheetMarkStatus(SheetMarkStatus sheetMarkStatus) {
        return (root, query, builder) -> sheetMarkStatus == null ? null
                : builder.equal(root.get("sheetMarkStatus"), sheetMarkStatus);
    }

    public static Specification<SheetMark> hasNonNullFinalMark() {
        return (root, query, builder) -> builder.isNotNull(root.get("finalMark"));
    }

}
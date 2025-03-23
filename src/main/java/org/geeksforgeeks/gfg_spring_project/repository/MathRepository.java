package org.geeksforgeeks.gfg_spring_project.repository;

import org.springframework.stereotype.Repository;

@FunctionalInterface
@Repository
public interface MathRepository {

    void save();
}

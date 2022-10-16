package org.simplilearn.app.dao;

import java.util.List;
import java.util.Optional;

import org.simplilearn.app.entities.Emp;

public interface EmDao {
 void insert(Emp e);
 void delete(int eno);
 List<Emp>getAll();
 Optional<Emp> get(int eno);
}

package model.dao;

import model.entities.Department;

import java.util.List;

public interface DepartmentDao {
    public void insert(Department dpt);
    public void update(Department dpt);
    public void deleteById(Integer id);
    public Department findById(Integer id);
    public List<Department> findAll();
}

package model.dao;

import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public interface SellerDao {
    public void insert(Seller dpt);
    public void update(Seller dpt);
    public void deleteById(Integer id);
    public Seller findById(Integer id);
    public List<Seller> findAll();
    public List<Seller> findByDepartment(Department department);
}


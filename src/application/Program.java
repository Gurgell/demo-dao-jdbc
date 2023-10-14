package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById =====");
        Seller seller = sellerDao.findById(3);

        System.out.println("\n=== TEST 2: seller findByDepartments =====");
        Department department = new Department(1, null);
        List<Seller> listSellers = sellerDao.findByDepartment(department);

        for (Seller sl: listSellers
             ) {
            System.out.println(sl);
        }

        System.out.println("\n=== TEST 3: seller findAll =====");
        listSellers = sellerDao.findAll();

        for (Seller sl: listSellers
        ) {
            System.out.println(sl);
        }
    }
}

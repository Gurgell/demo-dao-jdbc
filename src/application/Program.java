package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById =====");
        Seller seller = sellerDao.findById(3);

        System.out.println("\n=== TEST 2: seller findByDepartments =====");
        Department department = new Department(2, null);
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

        System.out.println("\n=== TEST 4: seller insert =====");
        Seller seller2 = new Seller("Greg", "greg@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(seller2);
        System.out.println("\nInserted! New id = " + seller2.getId());

        System.out.println("\n=== TEST 5: seller update =====");
        seller = sellerDao.findById(1);
        seller.setName("Martha Wayne");
        seller.setEmail("martha@hmail.com");
        sellerDao.update(seller);
        System.out.println("Upddate completed");

        System.out.println("\n=== TEST 6: seller delete =====");
        System.out.println("Enter id for delete test: ");
        int id = sc.nextInt();
        sc.close();
        sellerDao.deleteById(id);

        System.out.println("Delete completed!");

    }
}

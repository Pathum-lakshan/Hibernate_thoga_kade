package lk.ijse.hibernate;

import lk.ijse.hibernate.entity.Customer;
import lk.ijse.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {

    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        //  Customer

/** ===Create Customer====  */

        Customer customer1 = new Customer("C001", "Pathum", "Panadura", "076 1236545");
        Customer customer2 = new Customer("C002", "Lakshan", "colombo", "076 2546321");
        Customer customer3 = new Customer("C003", "Herath", " kaluthara", "076 2587463");

        session.save(customer1);
        session.save(customer2);
        session.save(customer3);

/** ===Read Customer====  */

        Customer c001 = session.get(Customer.class, "C001");
        Customer c002 = session.get(Customer.class, "C002");

        System.out.println(c001);
        System.out.println(c002);

/** ===Update Customer====  */

        customer1.setCustomer_address("candy");
        session.update(customer1);

/** ===Delete Customer====  */

        session.delete(session.get(Customer.class,"C003"));








        transaction.commit();

        session.close();

    }
}

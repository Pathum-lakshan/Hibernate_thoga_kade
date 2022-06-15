package lk.ijse.hibernate;

import lk.ijse.hibernate.entity.*;
import lk.ijse.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {

    public static void main(String[] args) {

        Customer customer1 = new Customer("C001", "Pathum", "Panadura", "076 1236545");
        Customer customer2 = new Customer("C002", "Lakshan", "colombo", "076 2546321");
        Customer customer3 = new Customer("C003", "Herath", " kaluthara", "076 2587463");

        Item item1 = new Item("I001", "ice cream", 160, 500);
        Item item2 = new Item("I002", "coca-cola", 195, 250);
        Item item3 = new Item("I003", "soda", 180, 600);


        Orders order1 = new Orders("OR-001",customer1);
        Orders order2 = new Orders("OR-002",customer1);
        Orders order3 = new Orders("OR-003",customer2);
        Orders order4 = new Orders("OR-004",customer2);

        OrderDetail orderDetail1 = new OrderDetail("OD-001", order1, item1, 15, item1.getItem_unitPrice());
        OrderDetail orderDetail2 = new OrderDetail("OD-002", order1, item1, 2, item1.getItem_unitPrice());
        OrderDetail orderDetail3 = new OrderDetail("OD-003", order1, item2, 17, item2.getItem_unitPrice());
        OrderDetail orderDetail4 = new OrderDetail("OD-004", order2, item2, 5, item2.getItem_unitPrice());
        OrderDetail orderDetail5 = new OrderDetail("OD-005", order2, item1, 7, item1.getItem_unitPrice());
        OrderDetail orderDetail6 = new OrderDetail("OD-006", order2, item2, 3, item2.getItem_unitPrice());

        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();


//---------------------------------Customer----------------------------------------------------------------------------------


/** ===Create Customer====  */




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


//---------------------------------Item----------------------------------------------------------------------------------


/** ===Create Item====  */




        session.save(item1);
        session.save(item2);
        session.save(item3);


/** ===Read Item====  */


        Item i001 = session.get(Item.class, "I001");
        Item i002 = session.get(Item.class, "I002");

        System.out.println(i001);
        System.out.println(i002);


/** ===Update Item====  */


        item3.setItem_qty(170);

        session.update(item3);


/** ===Delete Item====  */


        session.delete(session.get(Item.class,"I003"));


//---------------------------------Order----------------------------------------------------------------------------------


/** ===Create Order====  */



        session.save(order1);
        session.save(order2);
        session.save(order3);
        session.save(order4);


/** ===Read Order====  */



        Orders orders = session.get(Orders.class, "OR-001");

        System.out.println(orders);


/** ===Update Order====  */


        order1.setOrder_customer(customer2);
        session.update(order1);


/** ===Delete Order====  */


        session.delete(session.get(Orders.class,"OR-003"));


//---------------------------------OrderDetail----------------------------------------------------------------------------------


/** ===Create OrderDetail====  */




        session.save(orderDetail1);
        session.save(orderDetail2);
        session.save(orderDetail3);
        session.save(orderDetail4);
        session.save(orderDetail5);
        session.save(orderDetail6);


/** ===Read OrderDetail====  */


        OrderDetail orderDetail = session.get(OrderDetail.class, "OD-005");

        System.out.println(orderDetail);


/** ===Update OrderDetail====  */


        orderDetail1.setOderDetail_qtyOnHand(3);
        session.update(orderDetail1);


/** ===Delete OrderDetail====  */


        session.delete(session.get(OrderDetail.class,"OD-005"));

//---------------------------------------------------------------------------------------------------------------------------------------------



        Ghh ghh = new Ghh(4);

        System.out.println(ghh);



        transaction.commit();

        session.close();

    }
}

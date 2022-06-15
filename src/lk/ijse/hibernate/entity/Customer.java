/**
 * @author : ALE_IS_TER
 * Project Name: Hibernate_thoga_kade
 * Date        : 6/14/2022
 * Time        : 4:09 AM
 */

package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer {
    @Id
    private String customer_id;
    private String customer_name;
    private String customer_address;
    private String customer_number;
    @OneToMany(mappedBy = "order_customer" ,fetch = FetchType.LAZY)
    private List<Orders> ordersList = new ArrayList<>();

    public Customer() {
    }

    public Customer(String customer_id, String customer_name, String customer_address, String customer_number) {
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.customer_address = customer_address;
        this.customer_number = customer_number;
    }

    public Customer(String customer_id, String customer_name, String customer_address, String customer_number, List<Orders> ordersList) {
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.customer_address = customer_address;
        this.customer_number = customer_number;
        this.ordersList = ordersList;
    }

    public Customer(String customer_id, String customer_address) {
        this.customer_id = customer_id;
        this.customer_address = customer_address;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }

    public String getCustomer_number() {
        return customer_number;
    }

    public void setCustomer_number(String customer_number) {
        this.customer_number = customer_number;
    }

    public List<Orders> getOrderList() {
        return ordersList;
    }

    public void setOrderList(List<Orders> ordersList) {
        this.ordersList = ordersList;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customer_id='" + customer_id + '\'' +
                ", customer_name='" + customer_name + '\'' +
                ", customer_address='" + customer_address + '\'' +
                ", customer_number='" + customer_number + '\'' +
                ", ordersList=" + ordersList +
                '}';
    }
}

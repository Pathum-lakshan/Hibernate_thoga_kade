/**
 * @author : ALE_IS_TER
 * Project Name: Hibernate_thoga_kade
 * Date        : 6/14/2022
 * Time        : 4:15 AM
 */

package lk.ijse.hibernate.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Orders {
    @Id
    private String order_id;
    @CreationTimestamp
    private LocalDate order_date;
    @ManyToOne
    private Customer order_customer;

    @OneToMany(mappedBy = "orderDetail_orders")
    private List<OrderDetail> orderDetailsList = new ArrayList<>();

    public Orders() {
    }

    public Orders(String order_id, Customer order_customer) {
        this.order_id = order_id;
        this.order_customer = order_customer;
    }

    public Orders(String order_id, LocalDate order_date, Customer order_customer) {
        this.order_id = order_id;
        this.order_date = order_date;
        this.order_customer = order_customer;
    }

    public Orders(String order_id, LocalDate order_date, Customer order_customer, List<OrderDetail> orderDetailsList) {
        this.order_id = order_id;
        this.order_date = order_date;
        this.order_customer = order_customer;
        this.orderDetailsList = orderDetailsList;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public LocalDate getOrder_date() {
        return order_date;
    }

    public void setOrder_date(LocalDate order_date) {
        this.order_date = order_date;
    }

    public Customer getOrder_customer() {
        return order_customer;
    }

    public void setOrder_customer(Customer order_customer) {
        this.order_customer = order_customer;
    }

    public List<OrderDetail> getOrderDetailsList() {
        return orderDetailsList;
    }

    public void setOrderDetailsList(List<OrderDetail> orderDetailsList) {
        this.orderDetailsList = orderDetailsList;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "order_id='" + order_id + '\'' +
                ", order_date=" + order_date +
                ", order_customer=" + order_customer +
                ", orderDetailsList=" + orderDetailsList +
                '}';
    }
}

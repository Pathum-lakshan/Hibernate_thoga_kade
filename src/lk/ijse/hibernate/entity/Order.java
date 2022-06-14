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
import java.time.LocalDate;
@Entity
public class Order {
    @Id
    private String order_id;
    @CreationTimestamp
    private LocalDate order_date;
    @ManyToOne
    private Customer order_customer;

    public Order() {
    }

    public Order(String order_id, LocalDate order_date, Customer order_customer) {
        this.order_id = order_id;
        this.order_date = order_date;
        this.order_customer = order_customer;
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

    @Override
    public String toString() {
        return "Order{" +
                "order_id='" + order_id + '\'' +
                ", order_date=" + order_date +
                ", order_customer=" + order_customer +
                '}';
    }
}

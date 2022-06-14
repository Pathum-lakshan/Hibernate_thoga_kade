/**
 * @author : ALE_IS_TER
 * Project Name: Hibernate_thoga_kade
 * Date        : 6/14/2022
 * Time        : 4:31 AM
 */

package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class OrderDetail {
    @Id
    private
    String id;
    @ManyToOne
    private
    Orders orderDetail_orders;
    @ManyToOne
    private
    Item oderDetail_item;
    private int oderDetail_qtyOnHand;
    private double oderDetail_unitPrice;

    public OrderDetail() {
    }

    public OrderDetail(String orderDetail_id, Orders orderDetail_orders, Item oderDetail_item, int oderDetail_qtyOnHand, double oderDetail_unitPrice) {
        this.id = orderDetail_id;
        this.orderDetail_orders = orderDetail_orders;
        this.oderDetail_item = oderDetail_item;
        this.oderDetail_qtyOnHand = oderDetail_qtyOnHand;
        this.oderDetail_unitPrice = oderDetail_unitPrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Orders getOrderDetail_order() {
        return orderDetail_orders;
    }

    public void setOrderDetail_order(Orders orderDetail_orders) {
        this.orderDetail_orders = orderDetail_orders;
    }

    public Item getOderDetail_item() {
        return oderDetail_item;
    }

    public void setOderDetail_item(Item oderDetail_item) {
        this.oderDetail_item = oderDetail_item;
    }

    public int getOderDetail_qtyOnHand() {
        return oderDetail_qtyOnHand;
    }

    public void setOderDetail_qtyOnHand(int oderDetail_qtyOnHand) {
        this.oderDetail_qtyOnHand = oderDetail_qtyOnHand;
    }

    public double getOderDetail_unitPrice() {
        return oderDetail_unitPrice;
    }

    public void setOderDetail_unitPrice(double oderDetail_unitPrice) {
        this.oderDetail_unitPrice = oderDetail_unitPrice;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "orderDetail_id='" + id + '\'' +
                ", orderDetail_orders=" + orderDetail_orders +
                ", oderDetail_item=" + oderDetail_item +
                ", oderDetail_qtyOnHand=" + oderDetail_qtyOnHand +
                ", oderDetail_unitPrice=" + oderDetail_unitPrice +
                '}';
    }
}

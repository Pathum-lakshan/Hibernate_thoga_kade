/**
 * @author : ALE_IS_TER
 * Project Name: Hibernate_thoga_kade
 * Date        : 6/14/2022
 * Time        : 4:24 AM
 */

package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Item {
    @Id
    private String item_code;
    private String item_description;
    private double item_unitPrice;
    private int item_qty;

    @OneToMany(mappedBy = "oderDetail_item")
    private List<OrderDetail> orderDetailsList = new ArrayList<>();

    public Item() {
    }

    public Item(String item_code, String item_description, double item_unitPrice, int item_qty) {
        this.item_code = item_code;
        this.item_description = item_description;
        this.item_unitPrice = item_unitPrice;
        this.item_qty = item_qty;
    }

    public Item(String item_code, String item_description, double item_unitPrice, int item_qty, List<OrderDetail> orderDetailsList) {
        this.item_code = item_code;
        this.item_description = item_description;
        this.item_unitPrice = item_unitPrice;
        this.item_qty = item_qty;
        this.orderDetailsList = orderDetailsList;
    }

    public String getItem_code() {
        return item_code;
    }

    public void setItem_code(String item_code) {
        this.item_code = item_code;
    }

    public String getItem_description() {
        return item_description;
    }

    public void setItem_description(String item_description) {
        this.item_description = item_description;
    }

    public double getItem_unitPrice() {
        return item_unitPrice;
    }

    public void setItem_unitPrice(double item_unitPrice) {
        this.item_unitPrice = item_unitPrice;
    }

    public int getItem_qty() {
        return item_qty;
    }

    public void setItem_qty(int item_qty) {
        this.item_qty = item_qty;
    }

    public List<OrderDetail> getOrderDetailsList() {
        return orderDetailsList;
    }

    public void setOrderDetailsList(List<OrderDetail> orderDetailsList) {
        this.orderDetailsList = orderDetailsList;
    }

    @Override
    public String toString() {
        return "Item{" +
                "item_code='" + item_code + '\'' +
                ", item_description='" + item_description + '\'' +
                ", item_unitPrice=" + item_unitPrice +
                ", item_qty=" + item_qty +
                ", orderDetailsList=" + orderDetailsList +
                '}';
    }
}

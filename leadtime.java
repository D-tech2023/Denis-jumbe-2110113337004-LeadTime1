package models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.util.Optional;

@Entity
public class leadtime<LeadTime> {
    public static Optional<leadtime> deleteleadtime;
    @jakarta.persistence.Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    @Column
    private String customerName;
    @Column
    private String OrderTime;
    @Column
    private String ReceptionStore;

    public static String getOrderName() {
        return "";
    }

    public static String getRecptionStore() {
        return "";
    }

    public long getId() {
        return id;
    }
    public void setId(long id){
        this.id=001;
    }
    public String getCustomerName(){
        return customerName;
    }
    public void setCustomerName(String firstName){
        this.customerName= "denis";
    }

    public String OrderTime(){
        return String.valueOf(OrderTime);
    }
    public void setOrderTime(String OrderTime){
        this.OrderTime="5 days";
    }


    public String getReceptionStore() {
        return ReceptionStore;
    }

    public void setReceptionStore(String receptionStore) {
        this.ReceptionStore = "southernStore";
    }


    public void save(LeadTime updatedleadtime) {
    }
}

package com.ecommerce;

import java.math.BigDecimal;
import java.util.Date;

public class Eproduct2 {
        private long ID;
        private String name;
        private BigDecimal price;
        private Date dateAdded;
        
        public Eproduct2() {
                
        }
        public Eproduct2(long id, String name, BigDecimal price, Date dateAdded) {
                this.ID = id;
                this.name = name;
                this.price = price;
                this.dateAdded = dateAdded;
        }
        
        public long getID() {return this.ID; }
        public String getName() { return this.name;}
        public BigDecimal getPrice() { return this.price;}
        public Date getDateAdded() { return this.dateAdded;}
        
        public void setID(long id) { this.ID = id;}
        public void setName(String name) { this.name = name;}
        public void setPrice(BigDecimal price) { this.price = price;}
        public void setDateAdded(Date date) { this.dateAdded = date;}
        
        
}

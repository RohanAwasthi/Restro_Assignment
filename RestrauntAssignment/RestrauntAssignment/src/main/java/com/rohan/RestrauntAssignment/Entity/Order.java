package com.rohan.RestrauntAssignment.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_food")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Order {

    @Id
    private int oid;
    private String oname;

}

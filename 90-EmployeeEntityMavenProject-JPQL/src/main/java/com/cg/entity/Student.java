package com.cg.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity

@Table(name = "STUDENT")

public class Student {

       

        @Id

        @GeneratedValue(strategy = GenerationType.AUTO)

        private int sid;

       

        private String sname;

       

        @ManyToOne(cascade = CascadeType.ALL)

        @JoinColumn(name= "AID")

        private Address address;

 

        public int getSid() {

                return sid;

        }

        public void setSid(int sid) {

                this.sid = sid;

        }

        public String getSname() {

                return sname;

        }

        public void setSname(String sname) {

                this.sname = sname;

        }

        public Address getAddress() {

                return address;

        }

        public void setAddress(Address address) {

                this.address = address;

        }

}
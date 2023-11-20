package com.cg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name = "ADDRESS")

public class Address {

       

        @Id

        private int aid;

       

        private String city;

 

        private String zipcode;

 

        public int getAid() {

                return aid;

        }

        public void setAid(int aid) {

                this.aid = aid;

        }

        public String getCity() {

                return city;

        }

        public void setCity(String city) {

                this.city = city;

        }

        public String getZipcode() {

                return zipcode;

        }

        public void setZipcode(String zipcode) {

                this.zipcode = zipcode;

        }

}
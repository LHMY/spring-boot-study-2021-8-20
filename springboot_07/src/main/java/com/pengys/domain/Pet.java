package com.pengys.domain;

public class Pet {

    private String petName="peter";
    private String petAge="3";

    public String getPetAge() {
        return petAge;
    }

    public void setPetAge(String petAge) {
        this.petAge = petAge;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }


    @Override
    public String toString() {
        return "Pet{" +
                "petName='" + petName + '\'' +
                ", petAge='" + petAge + '\'' +
                '}';
    }
}

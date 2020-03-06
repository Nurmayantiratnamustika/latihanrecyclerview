package com.example.latihanrecyclerview.model;

import java.util.ArrayList;

public class mahasiswa {
    private String namanya;
    private boolean tombolnya;
    private String alamat;
    private String jeniskelamin;

    public mahasiswa(String namanya, boolean tombolnya,String jeniskelamin,String alamat) {
        this.namanya = namanya;
        this.tombolnya = tombolnya;
        this.alamat =  alamat;
        this.jeniskelamin= jeniskelamin;
    }

    public String getNamanya() {
        return namanya;
    }

    public void setNamanya(String namanya) {
        this.namanya = namanya;
    }

    public boolean isTombolnya() {
        return tombolnya;
    }

    public void setTombolnya(boolean tombolnya) {
        this.tombolnya = tombolnya;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJeniskelamin() {
        return jeniskelamin;
    }

    public void setJeniskelamin(String jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }

    public  static  ArrayList<mahasiswa> createmhslist (int numContact){
        ArrayList<mahasiswa> contacts = new ArrayList<mahasiswa>();
        for (int i = 1; i<=numContact; i++){
            contacts.add(new mahasiswa("Mhs : "+i,i <= numContact/2,"Jenis Kelamin : Perempuan","Alamat  :Trenggalek"));

        }
        return  contacts;
    }
}

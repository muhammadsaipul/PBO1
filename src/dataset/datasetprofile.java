/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;

import java.util.ArrayList;
import kos.profile_akos;

/**
 *
 * @author Asus
 */
public class datasetprofile {
    private ArrayList<String> nama;
    private ArrayList<String> alamat;
    private ArrayList<String> notelp;
    private ArrayList<String> email;
    private ArrayList<String> status;
    private ArrayList<String> jeniskelamin;
    private ArrayList<Integer> idanakkos;
   
    public datasetprofile(){
        nama= new ArrayList<>();
        alamat= new ArrayList<>();
        notelp= new ArrayList<>();
        email= new ArrayList<>();
        status= new ArrayList<>();
        jeniskelamin= new ArrayList<>();
        idanakkos= new ArrayList<>();
}
    public void addNama (String value){
        this.nama.add(value);
    }
    
    public ArrayList<String> getDataNama(){
        return this.nama;
    }
    public void addAlamat (String value){
        this.alamat.add(value);
    }
    
    public ArrayList<String> getDataAlamat(){
        return this.alamat;
    }
    public void addNotelp (String value){
        this.notelp.add(value);
    }
    
    public ArrayList<String> getDataNotelp(){
        return this.notelp;
    }
    public void addEmail (String value){
        this.email.add(value);
    }
    
    public ArrayList<String> getDataEmail(){
        return this.email;
    }
    public void addStatus (String value){
        this.status.add(value);
    }
    
    public ArrayList<String> getDataStatus(){
        return this.status;
    }
    public void addJeniskelamin (String value){
        this.jeniskelamin.add(value);
    }
    
    public ArrayList<String> getDataJeniskelamin(){
        return this.jeniskelamin;
    }
    public void addIdanakkos(int value){
        idanakkos.add(value);
    }
    
    public ArrayList<Integer> getDataIdanakkos(){
        return this.idanakkos;
    }
    public void Tambahprofile (String nama, String alamat, String notelp, String status, 
            String jeniskelamin, int idanakkos){
        
      addNama(nama);
      addAlamat(alamat);
      addNotelp(notelp);
      addStatus(status);
      addJeniskelamin(jeniskelamin);
      addIdanakkos(idanakkos);
              
    }
}


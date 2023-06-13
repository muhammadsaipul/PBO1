/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;

import java.util.ArrayList;
import kos.owner;

/**
 *
 * @author Asus
 */
public class datasetowner {
    private ArrayList<String> nama;
    private ArrayList<String> alamat;
    private ArrayList<String> notelp;
    private ArrayList<String> email;
    private ArrayList<String> status;
    private ArrayList<String> jeniskelamin;
    private ArrayList<Integer> idowner;
   
    public datasetowner(){
        nama= new ArrayList<>();
        alamat= new ArrayList<>();
        notelp= new ArrayList<>();
        email= new ArrayList<>();
        status= new ArrayList<>();
        jeniskelamin= new ArrayList<>();
        idowner= new ArrayList<>();
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
    public void addIdowner(int value){
        idowner.add(value);
    }
    
    public ArrayList<Integer> getDataIdowner(){
        return this.idowner;
    }
    public void Tambahowner (String nama, String alamat, String notelp, String status, 
            String jeniskelamin, int idowner){
        
      addNama(nama);
      addAlamat(alamat);
      addNotelp(notelp);
      addStatus(status);
      addJeniskelamin(jeniskelamin);
      addIdowner(idowner);
              
    }
    
}

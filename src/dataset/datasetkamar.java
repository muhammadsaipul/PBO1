/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;

import java.util.ArrayList;
import kos.kamar;

/**
 *
 * @author Asus
 */
public class datasetkamar {
    private ArrayList<String> nomorkamar;
    private ArrayList<String> fasilitas;
    private ArrayList<String> picture;
    private ArrayList<String> status;
    private ArrayList<Integer> hargasewa;
    private ArrayList<Integer> idkamar;
    
    public datasetkamar(){
        nomorkamar= new ArrayList<>();
        fasilitas= new ArrayList<>();
        picture= new ArrayList<>();
        status= new ArrayList<>();
        hargasewa= new ArrayList<>();
        idkamar= new ArrayList<>();
}
    public void addNomorkamar (String value){
        this.nomorkamar.add(value);
    }
    
    public ArrayList<String> getDataNomorkamar(){
        return this.nomorkamar;
    }
    public void addFasilitas (String value){
        this.fasilitas.add(value);
    }
    
    public ArrayList<String> getDataFasilitas(){
        return this.fasilitas;
    }
    public void addPicture (String value){
        this.picture.add(value);
    }
    
    public ArrayList<String> getDataPicture(){
        return this.picture;
    }
    public void addStatus (String value){
        this.status.add(value);
    }
    
    public ArrayList<String> getDataStatus(){
        return this.status;
    }
    public void addHargasewa(int value){
        hargasewa.add(value);
    }
    
    public ArrayList<Integer> getDataHargasewa(){
        return this.hargasewa;
    }
    public void addIdkamar(int value){
        idkamar.add(value);
    }
    
    public ArrayList<Integer> getDataIdkamar(){
        return this.idkamar;
    }
    public void Tambahkamar (String nomorkamar, String fasilitas, String picture, String status, int hargasewa, int idkamar){
        
      addNomorkamar(nomorkamar);
      addFasilitas(fasilitas);
      addPicture(picture);
      addStatus(status);
      addHargasewa(hargasewa);
      addIdkamar(idkamar);
      
              
    }
}

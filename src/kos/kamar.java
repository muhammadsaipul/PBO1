package kos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class kamar {
    private String idkamar, idrumahkos, nomorkamar, fasilitas;
    private String picture, hargasewa, status;
    
    public kamar(){}
    
    public void setIdkamar (String idkamar){
        this.idkamar=idkamar;
    }
    public String getIdkamar(){
        return this.idkamar;
    }
    public void setIdrumahkos (String idrumahkos){
        this.idrumahkos=idrumahkos;
    }
    public String getIdrumahkos(){
        return this.idrumahkos;
    }
    public void setNomorkamar (String nomorkamar){
        this.nomorkamar=nomorkamar;
    }
    public String getNomorkamar(){
        return this.nomorkamar;
    }
    public void setFasilitas (String fasilitas){
        this.fasilitas=fasilitas;
    }
    public String getFasilitas(){
        return this.fasilitas;
    }
    public void setPicture (String picture){
        this.picture=picture;
    }
    public String getPicture(){
        return this.picture;
    }
    public void setHargasewa (String hargasewa){
        this.hargasewa=hargasewa;
    }
    public String getHargasewa(){
        return this.hargasewa;
    }
    public void setStatus (String status){
        this.status=status;
    }
    public String getStatus(){
        return this.status;
    }
}

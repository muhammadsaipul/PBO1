/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;
import kos.rumah_kos;

/**
 *
 * @author Asus
 */
public class datasetrumahkos {
    private ArrayList<String> namakos;
    private ArrayList<String> alamat;
    private ArrayList<String> notelp;
    private ArrayList<String> email;
    private ArrayList<Integer> idrumahkos;
    private ArrayList<Integer> idowner;
    
    public datasetrumahkos(){
        namakos= new ArrayList<>();
        alamat= new ArrayList<>();
        notelp= new ArrayList<>();
        email= new ArrayList<>();
        idrumahkos= new ArrayList<>();
        idowner= new ArrayList<>();
        

    }
    public void addNamakos (String value){
        this.namakos.add(value);
    }
    
    public ArrayList<String> getDataNamakos(){
        return this.namakos;
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
    public void addIdrumahkos(int value){
        idrumahkos.add(value);
    }
    
    public ArrayList<Integer> getDataIdrumahkos(){
        return this.idrumahkos;
    }
    public void addIdowner(int value){
        idowner.add(value);
    }
    
    public ArrayList<Integer> getDataIdowner(){
        return this.idowner;
    }
    public void Tambahrumahkos (String namakos, String alamat, String notelp, 
            int idrumahkos, int idowner){
        
      addNamakos(namakos);
      addAlamat(alamat);
      addNotelp(notelp);
      addIdrumahkos(idrumahkos);
      addIdowner(idowner);
              
    }
}
    
    

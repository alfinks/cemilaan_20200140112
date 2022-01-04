/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cemilan.cemilaan_20200140112;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Maulana Alfiansyah
 */
@Controller

public class sayurcontroller {
    private int hitung(int harga, int jml){
        int hargaAhr;
        int total = harga*jml;
        
            hargaAhr = total;
        return hargaAhr;
 }
 private int diskon(int harga, int total){
     int diskon;
     int total_diskon =total-harga;
     if (total_diskon <16000){
         
         diskon = 0;
     }
     else if (total_diskon >16000){
         diskon = total_diskon-(total_diskon *10/100);
     }
     else{
         diskon= total_diskon-(total_diskon *15/100);
     }
     return diskon;
     }
     
    @RequestMapping("/input")
    @ResponseBody
    public String getHasil(HttpServletRequest data, Model datasayur){
        String getNama = data.getParameter("Sayur");
        int getHarga = Integer.parseInt(data.getParameter("harga"));
        int getJumlah = Integer.parseInt(data.getParameter("jumlah"));
        int getBayar = Integer.parseInt(data.getParameter("bayar"));
       
        int compute = hitung(getHarga, getJumlah);
        int diskon = diskon(getHarga, getBayar);
        return getNama +String.valueOf(getHarga) +String.valueOf(getJumlah) +String.valueOf(getBayar) + String.valueOf(diskon) +String.valueOf(compute);
        
       
        
        }
}
          
        


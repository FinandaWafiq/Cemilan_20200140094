/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CemilanAneka_20200140094.example.Cemilan_20200140094;

/**
 *
 * @author LENOVO
 */
public class DataBeliCemilan {

     public Double harga(String HrgBuah){
        Double hargaa = Double.valueOf(HrgBuah);
        return hargaa;
    }
    public Double jumlahbeli(String JumBeli){
        Double jumlahbuah= Double.valueOf(JumBeli);
        return jumlahbuah;
    }
    public Double totalbayar(Double JumBayar, Double Diskon){
        Double totalbayar = JumBayar - Diskon;
        return totalbayar;
    }
    public Double jumlahbayar(Double HrgSayur, Double JumBeli){
        Double jumlahbayar = HrgSayur * JumBeli;
        return jumlahbayar;
    }
    public String Diskon (Double jumlahbayar){
    
        String Diskon = null;
        
        if (jumlahbayar < 16000) {
            Diskon = "0";
        }else if (jumlahbayar < 25000){
            Diskon = "10";
        }else{
            Diskon = "15";
        }
        return Diskon;
    }
    public Double JumDiskon(Double jumlahbayar, Integer Diskon){
        
        Double JumDiskon = jumlahbayar * Diskon/100;
    
        return JumDiskon;
    }
    public void HasilDiskon (Double totalbayar, Double jumlahbayar, Double JumDiskon, Integer Diskon){
        
        if(jumlahbayar < 16000){
            Diskon = 0;
            totalbayar = jumlahbayar - (jumlahbayar*Diskon/100);
            JumDiskon = jumlahbayar*Diskon/100;
            
        }else if(jumlahbayar < 25000){
            Diskon = 10;
            totalbayar = jumlahbayar - (jumlahbayar*Diskon/100);
            JumDiskon = jumlahbayar*Diskon/100;
        }else {
            Diskon = 15;
            totalbayar = jumlahbayar - (jumlahbayar*Diskon/100);
            JumDiskon = jumlahbayar*Diskon/100;
        }
    }
    
public String UangPembeli (Double duitbayar, Double totalbayar){
        Double kembalian = duitbayar - totalbayar;
        if(duitbayar >= totalbayar){
            return " Total Kembalian  : Rp."+kembalian;
        }else{
            return "Nominal uang yang diberikan tidak mencukupi Rp"+kembalian;
        }
}
}
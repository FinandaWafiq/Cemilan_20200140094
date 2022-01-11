/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CemilanAneka_20200140094.example.Cemilan_20200140094;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author LENOVO
 */
@Controller
public class TableController {
     @RequestMapping("/input")
    //@ResponseBody
    public String inputdata(HttpServletRequest data, Model Buah){
        DataBeliCemilan dbc = new DataBeliCemilan();
        
        String namasayur = data.getParameter("namabuah");
        String harga = data.getParameter("hargaperkg");
        String jumlah = data.getParameter("jumlahbeli");
        String uangpembeli = data.getParameter("uangpembeli");
        
        Double hargaa = dbc.harga(harga);
        Double jumlahsayur = dbc.jumlahbeli(jumlah);
        Double jumlahbayar = dbc.jumlahbayar(hargaa, jumlahsayur);
        String diskon = dbc.Diskon(jumlahbayar);
        Double jumlahdiskon = dbc.JumDiskon(jumlahbayar, Integer.valueOf(diskon));
        Double totalbayar = dbc.totalbayar(jumlahbayar, jumlahdiskon);
        dbc.HasilDiskon(totalbayar, jumlahbayar, jumlahdiskon, Integer.valueOf(diskon));
        String kembalian = dbc.UangPembeli(Double.valueOf(uangpembeli), totalbayar);
        
        
        Buah.addAttribute("nama", namasayur);
        Buah.addAttribute("harga", hargaa);
        Buah.addAttribute("jumlahbeli", jumlah);
        Buah.addAttribute("uangpembeli", uangpembeli);
        Buah.addAttribute("jumlahnormal", jumlahbayar);
        Buah.addAttribute("ddiskon", diskon);
        Buah.addAttribute("jumlahdiskon", jumlahdiskon);
        Buah.addAttribute("totalbayar", totalbayar);
        Buah.addAttribute("kembalian", kembalian);
      
        return "TableViewer";
    }
}
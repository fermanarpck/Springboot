package com.example.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public class Exam5 {
    private String klasorAdresi;
    private int size;
    private String sonucDosyasiAdi;


    public Exam5(String klasorAdresi, int size, String sonucDosyasiAdi) {
        this.klasorAdresi = klasorAdresi;
        this.size = size;
        this.sonucDosyasiAdi = sonucDosyasiAdi;
    }

    public String getKlasorAdresi() {
        return klasorAdresi;
    }

    public int getSize() {
        return size;
    }

    public String getSonucDosyasiAdi() {
        return sonucDosyasiAdi;
    }
}

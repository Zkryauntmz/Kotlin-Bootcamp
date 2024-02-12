package com.example.myapplication.Odev2


class Odev2(){

    fun kilometreToMile(kilometre: Double): Double {
        return kilometre * 0.621371
    }

    fun dikdörtgenAlan(kenar1 :Int, kenar2:Int){
            var alan : Int = kenar1 * kenar2
            println("Dikdörtgenin Alanı :  $alan")
        }

    fun faktoriyelHesapla(sayi: Int): Int {
        if (sayi < 0) {
            throw IllegalArgumentException("Sayi negatif olamaz.")
        }
        var sonuc = 1
        for (i in 1..sayi) {
            sonuc *= i
        }
        return sonuc
    }


    fun harfHesapla( kelime :String ): Int {
        return kelime.count { char -> char == 'e' }


    }

    fun hesaplaE(str: String): Int {
        var count = 0
        for (char in str) {
            if (char == 'e') {
                count++
            }
        }
        return count
    }
    fun icAciHesapla(kenarSayisi: Int): Double {
        if (kenarSayisi <= 2) {
            throw IllegalArgumentException("Kenar sayısı 2'den büyük olmalı.")
        }
        return (180.0 * (kenarSayisi - 2)) / kenarSayisi
    }

    fun maasHesapla(gunSayisi: Int): Int {
        val calismaSaati = gunSayisi * 8
        val normalMaas = calismaSaati * 40
        val mesaiSaati = calismaSaati - 150
        val mesaiUcreti = if (mesaiSaati > 0) mesaiSaati * 80 else 0
        return normalMaas + mesaiUcreti
    }


    fun otoparkUcretiHesapla(sure: Int): Int {
        val ilkSaatUcreti = 50
        val asmisSaatUcreti = 10
        val asmisSure = if (sure > 1) sure - 1 else 0
        return ilkSaatUcreti + (asmisSure * asmisSaatUcreti)
    }



}

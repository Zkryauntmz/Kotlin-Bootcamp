package com.example.myapplication.Odev2

fun main() {
    println(" SORU 1 ")
  //Soru1 Mil Hesaplama
    val kilometre = 100.0
    val mile = Odev2().kilometreToMile(kilometre)
    println("$kilometre kilometre $mile mil'e eşittir.")
    println("--------------------------------------")


    //Soru 2 Dikdörtgen Alan Bulma
    println(" SORU 2 ")
    Odev2().dikdörtgenAlan(10,15)
    println("--------------------------------------")

    //Soru 3  Faktoriyel hesaplama
    println(" SORU 3 ")
    val sayi = 5
    val faktoriyel = Odev2().faktoriyelHesapla(sayi)
    println("$sayi'nin faktöriyeli $faktoriyel'dir.")

    println("--------------------------------------")

    //Soru 4 Harf Bulma
    println(" SORU 4 ")

    val str = "Zekeriya Unutmaz"
    val hesaplaE = Odev2().hesaplaE(str)
    println("'$str' ifadesinde $hesaplaE adet 'e' harfi var.")
    println("--------------------------------------")
    //Soru 5 Kenar Sayısı
    println(" SORU 5 ")
    val kenarSayisi = 10
    val icAci = Odev2().icAciHesapla(kenarSayisi)
    println("$kenarSayisi kenarlı bir çokgenin her bir iç açısı $icAci derecedir.")
    println("--------------------------------------")
    //Soru 6 Maaş hesapla
    println(" SORU 6 ")
    val gunSayisi = 20
    val maas = Odev2().maasHesapla(gunSayisi)
    println("$gunSayisi gün çalışan bir işçinin maaşı $maas TL'dir.")
    println("--------------------------------------")

    //Soru 7 Park ücreti Hesapla
    println(" SORU 7 ")
    val sure = 7
    val ucret = Odev2().otoparkUcretiHesapla(sure)
    println("$sure saatlik otopark ücreti $ucret TL'dir.")

    println("--------------------------------------")

}

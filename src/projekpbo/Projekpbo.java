/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projekpbo;

import projekpbo.BangunDatar.*;
import projekpbo.BangunRuang.*;

public class Projekpbo {

    public static void main(String[] args) {
        
         // ======= Bangun Datar =======
        System.out.println("\n=== Bagun Datar ===");
        
        // Jajar Genjang
        try{
            JajarGenjang jajarGenjang = new JajarGenjang(10,7,5,6);
            System.out.println("\n-> Jajar Genjang \nalas = 10 & tinggi = 7 & sisi A = 5 & sisi B = 6");
            System.out.println("Luas Jajar Genjang : " + jajarGenjang.getLuasJajarGenjang()); 
            System.out.println("Keliling Jajar Genjang : " + jajarGenjang.getKelilingJajarGenjang());
        } catch(Exception e){
            System.out.println("Jajar Genjang tidak bisa dibuat dengan nilai alas dan tinggi bernilai 0 dan negatif!");
        }
        
        // Belah Ketupat
        try{
            BelahKetupat belahKetupat = new BelahKetupat(3,4,5);
            System.out.println("\n-> Belah Ketupat \nsisi = 3 & diagonal= 4.2");
            System.out.println("Luas Belah Ketupat : " + belahKetupat.getLuasJajarGenjang()); 
            System.out.println("Keliling Belah Ketupat : " + belahKetupat.getKelilingJajarGenjang());
        } catch(Exception e){
            System.out.println("Belah Ketupat tidak bisa dibuat dengan nilai diagonal dan sisi yang kurang dari 0 dan negatif! ");
        }
        
        // Layang-Layang
        try{
            LayangLayang layangLayang = new LayangLayang(20,10,12,22);
            System.out.println("\n-> Layang-layang\ndiagonal1 = 20 & diagonal2 = 10 & sisi pendek = 12 & sisi pendek 22");
            System.out.println("Luas Layang-layang : " + layangLayang.getLuasLayangLayang()); 
            System.out.println("Keliling Layang-layang : " + layangLayang.getKelilingLayangLayang());
        } catch(Exception e){
            System.out.println("Layang-layang tidak bisa dibuat dengan nilai diagonal dan sisi yang kurang dari 0 dan negatif!");
        }
        
        // Persegi
        try{
            Persegi persegi = new Persegi(10);
            System.out.println("\n-> Persegi\nsisi = 22");
            System.out.println("Luas Persegi : " + persegi.getLuasPersegi()); 
            System.out.println("Keliling Persegi: " + persegi.getKelilingPersegi());
        } catch(Exception e){
            System.out.println("Persegi tidak bisa dibuat dengan nilai sisi yang kurang dari 0 dan negatif!");
        }
        
        // Persegi Panjang
        try{
            PersegiPanjang persegiPanjang = new PersegiPanjang(12,10);
            System.out.println("\n-> Persegi Panjang \npanjang= 12 & lebar = 10");
            System.out.println("Luas Persegi Panjang : " + persegiPanjang.getLuasPersegiPanjang()); 
            System.out.println("Keliling Persegi Panjang: " + persegiPanjang.getKelilingPersegiPanjang());
        } catch(Exception e){
            System.out.println("Persegi Panjang tidak bisa dibuat dengan nilai panjang dan lebar yang kurang dari 0 dan negatif!");
        }
        
        // Segitiga
        try{
            Segitiga segitiga = new Segitiga(12,10);
            System.out.println("\n-> Segitiga \n alas= 12 & tinggi= 10");
            System.out.println("Luas Segitiga : " + segitiga.getLuas()); 
            System.out.println("Keliling Segitiga: " + segitiga.getKeliling());
        } catch(Exception e){
            System.out.println("Segitiga tidak bisa dibuat dengan nilai alas dan tinggi yang kurang dari 0 dan negatif!");
        }
        
        // Trapesium
        try{
            Trapesium trapesium = new Trapesium(10,14,8,6);
            System.out.println("\n-> Trapesium \n alas atas = 10 & alas bawah = 14 & sisi miring = 8 & tinggi = 6");
            System.out.println("Luas Trapesium : " + trapesium.getLuas()); 
            System.out.println("Keliling Trapesium : " + trapesium.getKeliling());
        } catch(Exception e){
            System.out.println("Trapesium tidak bisa dibuat dengan nilai alas atas, alas bawah, sisi miring dan  tinggi yang kurang dari 0 dan negatif!");
        }
        
        // Lingkaran
        try{
            Lingkaran lingkaran = new Lingkaran(7);
            System.out.println("\n-> Lingkaran \n jari-jari = 14");
            System.out.println("Luas Lingkaran : " + lingkaran.getLuasLingkaran()); 
            System.out.println("Keliling Lingkaran : " + lingkaran.getKelilingLingkaran());
        } catch(Exception e){
            System.out.println("Lingkaran tidak bisa dibuat dengan nilai jari- jari yang kurang dari 0 dan negatif!");
        }
        
        // Juring Lingkaran
        try{
            Lingkaran lingkaran = new Lingkaran(7);
            JuringLingkaran juring = new JuringLingkaran(lingkaran, 90);
            System.out.println("\n-> JuringLingkaran\n jari-jari = 7 & sudut 90 derajat");
            System.out.println("Luas JuringLingkaran: " + juring.getLuasJuring()); 
            System.out.println("Keliling JuringLingkaran: " + juring.getKelilingJuring());
        } catch(Exception e){
            System.out.println("Juring Lingkaran tidak bisa dibuat dengan nilai jari- jari  yang kurang dari 0 dan negatif!");
        }
        
        // Tembereng Lingkaran
        try{
            Lingkaran lingkaran = new Lingkaran(7);
            TemberengLingkaran tembereng = new TemberengLingkaran(lingkaran, 90);
            System.out.println("\n->Tembereng Lingkaran\n jari-jari = 7 & sudut 90 derajat");
            System.out.println("Luas Tembereng Lingkaran: " + tembereng.getLuasTembereng()); 
            System.out.println("Keliling Tembereng Lingkaran: " + tembereng.getKelilingTembereng());
        } catch(Exception e){
            System.out.println("Tembereng Lingkaran tidak bisa dibuat dengan nilai jari- jari  yang kurang dari 0 dan negatif!");
        }
        
        // ======= Bangun Ruang =======
        System.out.println("\n\n=== Bagun Ruang ===");
        // Persegi Panjang --> Balok, Limas Persegi Panjang dan Prisma Persegi Panjang
        try {
            System.out.println("\n->Balok \n panjang = 5 & blebar = 3 & tinggi = 4");
            PersegiPanjang persegiPanjang = new PersegiPanjang(5,3);
            Balok balok = new Balok(persegiPanjang,4);
            System.out.println("Volume Balok: " + balok.getVolume()); 
            System.out.println("Luas Permukaan Balok: " + balok.getLuasPermukaan());
        } catch (Exception e) {
            System.out.println("Maaf, tidak bisa membuat bangun ruang balok dengan nilai yang diberikan.");
        }
        
        try {
            System.out.println("\n->Limas Persegi Panjang \n panjang = 6 & lebar = 4 & tinggi = 10");
            LimasPersegiPanjang limasPersegiPanjang = new LimasPersegiPanjang(6,4,10);
            System.out.println("Volume LimasPersegiPanjang: " + limasPersegiPanjang.getVolume()); 
            System.out.println("Luas Permukaan LimasPersegiPanjang: " + limasPersegiPanjang.getLuasPermukaan());
        } catch (Exception e) {
            System.out.println("Maaf, tidak bisa membuat bangun ruang LimasPersegiPanjang dengan nilai yang diberikan.");
        }
        
        try {
            System.out.println("\n->Prisma Persegi Panjang \n panjang = 6 & lebar = 4 & tinggi = 10");
            PrismaPersegiPanjang prismaPersegiPanjang = new PrismaPersegiPanjang(6,4,10);
            System.out.println("Volume Prisma Persegi Panjang: " + prismaPersegiPanjang.getVolume()); 
            System.out.println("Luas Permukaan Prisma Persegi Panjang: " + prismaPersegiPanjang.getLuasPermukaan());
        } catch (Exception e) {
            System.out.println("Maaf, tidak bisa membuat bangun ruang Prisma Persegi Panjang dengan nilai yang diberikan.");
        }
        
        // Persegi --> Kubus, Limas Persegi dan Prisma Persegi
        try {
            System.out.println("\n->Kubus \n sisi = 10");
            Persegi persegi = new Persegi(10);
            Kubus kubus = new Kubus(persegi);
            System.out.println("Volume Kubus: " + kubus.getVolume()); 
            System.out.println("Luas Permukaan Kubus: " + kubus.getLuasPermukaan());
        } catch (Exception e) {
            System.out.println("Maaf, tidak bisa membuat bangun ruang kubus dengan nilai yang diberikan.");
        }
        
        try {
            System.out.println("\n->Limas Persegi\n sisi = 10, tinggi = 3");
            LimasPersegi limasPersegi = new LimasPersegi(10,3);
            System.out.println("Volume LimasPersegi: " + limasPersegi.getVolume()); 
            System.out.println("Luas Permukaan LimasPersegi: " + limasPersegi.getLuasPermukaan());
        } catch (Exception e) {
            System.out.println("Maaf, tidak bisa membuat bangun ruang limasPersegi dengan nilai yang diberikan.");
        }

        try {
            System.out.println("\n->Prisma Persegi\n sisi = 10, tinggi = 3");
            PrismaPersegi prismaPersegi = new PrismaPersegi(10,3);
            System.out.println("Volume PrismaPersegi: " + prismaPersegi.getVolume()); 
            System.out.println("Luas Permukaan LimasPersegi: " + prismaPersegi.getLuasPermukaan());
        } catch (Exception e) {
            System.out.println("Maaf, tidak bisa membuat bangun ruang Prisma Persegi dengan nilai yang diberikan.");
        }
        
        // Belah Ketupat --> Limas Belah Ketupat dan Prisma Belah Ketupat
        try {
            System.out.println("\n->Limas Belah Ketupat\n diagonal 1 = 6 & diagonal 2 = 10 & sisi = 12, tinggi = 8");
            LimasBelahKetupat limasBelahKetupat = new LimasBelahKetupat(6,10,12,8);
            System.out.println("Volume Limas Belah Ketupat: " + limasBelahKetupat.getVolume()); 
            System.out.println("Luas Permukaan Limas Belah Ketupat: " + limasBelahKetupat.getLuasPermukaan());
        } catch (Exception e) {
            System.out.println("Maaf, tidak bisa membuat bangun ruang Limas Belah Ketupatdengan nilai yang diberikan.");
        }
        
        try {
            System.out.println("\n->Prisma Belah Ketupat\n diagonal 1 = 5 & diagonal 2 = 10 & sisi = 4, tinggi = 3");
            PrismaBelahKetupat prismaBelahKetupat = new PrismaBelahKetupat(5,10,4,3);
            System.out.println("Volume Prisma Belah Ketupat: " + prismaBelahKetupat.getVolume()); 
            System.out.println("Luas Permukaan Prisma Belah Ketupat: " + prismaBelahKetupat.getLuasPermukaan());
        } catch (Exception e) {
            System.out.println("Maaf, tidak bisa membuat bangun ruang Prisma Belah Ketupatdengan nilai yang diberikan.");
        }  

        // Layang-Layang --> Limas Layang-Layang dan Prisma Layang-Layang
        try {
            System.out.println("\n->Limas Layang-Layang\n diagonal 1 = 10 & diagonal 2 = 5 & sisi pendek = 6 & sisi panjang = 12 & tinggi = 8");
            LimasLayangLayang limasLayangLayang = new LimasLayangLayang(10,5,6,12,8);
            System.out.println("Volume Limas Layang-Layang: " + limasLayangLayang.getVolume()); 
            System.out.println("Luas Permukaan Limas Layang-Layang: " + limasLayangLayang.getLuasPermukaan());
        } catch (Exception e) {
            System.out.println("Maaf, tidak bisa membuat bangun ruang Limas Layang-Layang dengan nilai yang diberikan.");
        }
        
        try {
            System.out.println("\n->Prisma Layang-Layang\n diagonal 1 = 10 & diagonal 2 = 5 & sisi pendek = 6 & sisi panjang = 12 & tinggi = 8");
            PrismaLayangLayang prismaLayangLayang = new PrismaLayangLayang(10,5,6,12,8);
            System.out.println("Volume Prisma  Layang-Layang: " + prismaLayangLayang.getVolume()); 
            System.out.println("Luas Permukaan Prisma  Layang-Layang: " + prismaLayangLayang.getLuasPermukaan());
        } catch (Exception e) {
            System.out.println("Maaf, tidak bisa membuat bangun ruang Prisma  Layang-Layang dengan nilai yang diberikan.");
        }
        
        // Jajar Genjang --> Limas Jajar Genjang dan Prisma Jajar Genjang
        try {
            System.out.println("\n->Limas Jajar Genjang\n alas jajar genjang = 10 & tinggi jajar genjang = 7 & sisi A = 5 & sisi B = 6 & tinggi prisma = 12");
            JajarGenjang jajarGenjang = new JajarGenjang(10,7,5,6);
            LimasJajarGenjang limasJajarGenjang = new LimasJajarGenjang(jajarGenjang,12);
            System.out.println("Volume Limas Jajar Genjang: " + limasJajarGenjang.getVolume()); 
            System.out.println("Luas Permukaan Limas Jajar Genjang: " + limasJajarGenjang.getLuasPermukaan());
        } catch (Exception e) {
            System.out.println("Maaf, tidak bisa membuat bangun ruang Limas Jajar Genjang dengan nilai yang diberikan.");
        }       
        
        try {
            System.out.println("\n->Prisma Jajar Genjang\n alas jajar genjang = 10 & tinggi jajar genjang = 7 & sisi A = 5 & sisi B = 6 & tinggi prisma = 8");
            PrismaJajarGenjang prismaJajarGenjang = new PrismaJajarGenjang(10,5,6,7,8);
            System.out.println("Volume Prisma Jajar Genjang: " + prismaJajarGenjang.getVolume()); 
            System.out.println("Luas Permukaan Prisma Jajar Genjang: " + prismaJajarGenjang.getLuasPermukaan());
        } catch (Exception e) {
            System.out.println("Maaf, tidak bisa membuat bangun ruang Prisma Jajar Genjang dengan nilai yang diberikan.");
        }        
        
        // Segitiga --> Limas Segitiga dan Prisma Segitiga
        try {
            System.out.println("\n->Limas Segitiga\n tinggi prisma = 10 & sisi segitga = 5 & tinggi segitiga = 6 ");
            Segitiga alas = new Segitiga(5,6);
            LimasSegitiga limasSegitiga = new LimasSegitiga(alas, 10);
            System.out.println("Volume Limas Segitiga: " + limasSegitiga.getVolume()); 
            System.out.println("Luas Permukaan Limas Segitiga: " + limasSegitiga.getLuasPermukaan());
        } catch (Exception e) {
            System.out.println("Maaf, tidak bisa membuat bangun ruang Limas Segitiga dengan nilai yang diberikan.");
        } 

        try {
            System.out.println("\n->Prisma Segitiga\n tinggi prisma = 10 & sisi segitga = 5 & tinggi segitiga = 6 ");
            Segitiga alas = new Segitiga(5,6);
            PrismaSegitiga prismaSegitiga = new PrismaSegitiga(alas, 10);
            System.out.println("Volume Prisma Segitiga: " + prismaSegitiga.getVolume()); 
            System.out.println("Luas Permukaan PrismaSegitiga: " + prismaSegitiga.getLuasPermukaan());
        } catch (Exception e) {
            System.out.println("Maaf, tidak bisa membuat bangun ruang Prisma Segitiga dengan nilai yang diberikan.");
        }
        
        // Trapesium --> Limas Trapesium dan Prisma Trapesium
        try {
            System.out.println("\n->Limas Trapesium\n alas atas = 10 & alas bawah = 14 & sisi miring = 8 & tinggi trapesium = 8 & tinggi limas = 8");
            Trapesium alas = new Trapesium(10,14,8,6);
            LimasTrapesium limasTrapesium = new LimasTrapesium(alas, 10);
            System.out.println("Volume Limas Trapesium: " + limasTrapesium.getVolume()); 
            System.out.println("Luas Permukaan Limas Trapesium: " + limasTrapesium.getLuasPermukaan());
        } catch (Exception e) {
            System.out.println("Maaf, tidak bisa membuat bangun ruang Limas Trapesium dengan nilai yang diberikan.");
        }
        
        try {
            System.out.println("\n->Prisma Trapesium\n alas atas = 10 & alas bawah = 14 & sisi miring = 8 & tinggi trapesium = 8 & tinggi limas = 8");
            Trapesium alas = new Trapesium(10,14,8,6);
            PrismaTrapesium prismaTrapesium = new PrismaTrapesium(alas, 10);
            System.out.println("Volume Prisma Trapesium: " + prismaTrapesium.getVolume()); 
            System.out.println("Luas Permukaan Prisma Trapesium: " + prismaTrapesium.getLuasPermukaan());
        } catch (Exception e) {
            System.out.println("Maaf, tidak bisa membuat bangun ruang Prisma Trapesium dengan nilai yang diberikan.");
        }
        
        // Lingkaran --> Bola, Kerucut, Tabung
        try {
            System.out.println("\n->Bola \n jari-jari = 7");
            Bola bola = new Bola(7);
            System.out.println("Volume Bola: " + bola.getVolume()); 
            System.out.println("Luas Permukaan Bola: " + bola.getLuasPermukaan());
        } catch (Exception e) {
            System.out.println("Maaf, tidak bisa membuat bangun ruang Bola dengan nilai yang diberikan.");
        }  
        
        try {
            System.out.println("\n->Tabung \n jari-jari = 7 & tinggi = 5");
            Tabung tabung = new Tabung(7,5);
            System.out.println("Volume Tabung: " + tabung.getVolume()); 
            System.out.println("Luas Permukaan Tabung: " + tabung.getLuasPermukaan());
        } catch (Exception e) {
            System.out.println("Maaf, tidak bisa membuat bangun ruang Tabung dengan nilai yang diberikan.");
        }        
        
        try {
            System.out.println("\n->Kerucut \n jari-jari = 7 & tinggi = 5");
            Kerucut kerucut = new Kerucut(7,5);
            System.out.println("Volume Kerucut: " + kerucut.getVolume()); 
            System.out.println("Luas Permukaan Kerucut: " + kerucut.getLuasPermukaan());
        } catch (Exception e) {
            System.out.println("Maaf, tidak bisa membuat bangun ruang Kerucut dengan nilai yang diberikan.");
        } 
        
        try {
            System.out.println("\n->Kerucut Terpancung \n jari-jari atas = 3 & jari-jari bawah = 5 & tinggi terpancung = 4");
            KerucutTerpancung kerucutTerpancung = new KerucutTerpancung(3,5,4);
            System.out.println("Volume KerucutTerpancung: " + kerucutTerpancung.getVolume()); 
            System.out.println("Luas Permukaan KerucutTerpancung: " + kerucutTerpancung.getLuasPermukaan());
        } catch (Exception e) {
            System.out.println("Maaf, tidak bisa membuat bangun ruang KerucutTerpancung dengan nilai yang diberikan.");
        } 
                
        try {
            System.out.println("\n->Juring Bola\n jari-jari = 7 & sudut  = 90 derajat");
            Bola bola = new Bola(7);
            JuringBola juringBola = new JuringBola(bola,90);
            System.out.println("Volume Juring Bola: " + juringBola.getVolume()); 
            System.out.println("Luas Permukaan Juring Bola: " + juringBola.getLuasPermukaan());
        } catch (Exception e) {
            System.out.println("Maaf, tidak bisa membuat bangun ruang Juring Bola dengan nilai yang diberikan.");
        }
        
        try {
            System.out.println("\n->Cincin Bola\n jari-jari = 7 & tinggi cincin = 3");
            Bola bola = new Bola(7);
            CincinBola cincinBola = new CincinBola(bola,3);
            System.out.println("Volume Cincin Bola: " + cincinBola.getVolume()); 
            System.out.println("Luas Permukaan Cincin Bola: " + cincinBola.getLuasPermukaan());
        } catch (Exception e) {
            System.out.println("Maaf, tidak bisa membuat bangun ruang Cincin Bola dengan nilai yang diberikan.");
        }   
    
        try {
            System.out.println("\n->Tembereng Bola\n jari-jari = 7 & tinggi tembereng = 5");
            Bola bola = new Bola(7);
            TemberengBola temberengBola = new TemberengBola(bola,5);
            System.out.println("Volume Tembereng Bola: " + temberengBola.getVolume()); 
            System.out.println("Luas Permukaan Tembereng Bola: " + temberengBola.getLuasPermukaan());
        } catch (Exception e) {
            System.out.println("Maaf, tidak bisa membuat bangun ruang Tembereng Bola dengan nilai yang diberikan.");
        }  
               
               
        
    }
    
}
package com.example.e_upsunas;

public class Konfigurasi {
    //Dibawah ini merupakan Pengalamatan dimana Lokasi Skrip CRUD PHP disimpan
    //Pada tutorial Kali ini, karena kita membuat localhost maka alamatnya tertuju ke IP komputer
    //dimana File PHP tersebut berada
    //PENTING! JANGAN LUPA GANTI IP SESUAI DENGAN IP KOMPUTER DIMANA DATA PHP BERADA
    public static final String URL_ADD_LOKET_SATU="http://upstestingunas.000webhostapp.com/daftarAntrianLoketSatu.php";
    public static final String URL_GET_DATA_LOKET_SATU = "http://upstestingunas.000webhostapp.com/tampilDataLoketSatu.php";

    //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Skrip PHP
    public static final String KEY_ID = "id";
    public static final String KEY_NAMA = "nama";
    public static final String KEY_NPM = "npm"; //

    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID = "id";
    public static final String TAG_ANTRIAN_SEBELUM = "antrian";
    public static final String TAG_NAMA = "nama";
    public static final String TAG_NPM = "npm";

    //ID karyawan
    //emp itu singkatan dari Employee
    static final String ANT_ID = "ant_id";
}

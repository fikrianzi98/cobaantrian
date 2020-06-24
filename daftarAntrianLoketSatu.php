<?php
    if ($_SERVER["REQUEST_METHOD"]=='POST') {
        //mendapatkan nilai untuk variabel
        $nama = $_POST['nama'];
        $npm = $_POST['npm'];

        //pembuatan sintaks SQL
        $sql = "INSERT INTO loket_satu (nama, npm) VALUES ('$nama','$npm')";

        //import file koneksi ke database
        require_once('koneksi.php');

        //Eksekusi query database
        if (mysqli_query($con, $sql)) {
            echo 'Daftar berhasil';
        } else{
            echo 'Gagal daftar';
        }
        mysqli_close($con);
    }
?>
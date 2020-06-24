-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 07 Jul 2019 pada 16.34
-- Versi server: 10.1.38-MariaDB
-- Versi PHP: 7.3.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `antrian_tiket`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `loket_dua`
--

CREATE TABLE `loket_dua` (
  `id` int(50) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `notelp` decimal(15,0) NOT NULL,
  `alamat` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `loket_dua`
--

INSERT INTO `loket_dua` (`id`, `nama`, `notelp`, `alamat`) VALUES
(1, 'Ooniki', '897657567778', 'Cijerah'),
(2, 'Ooni', '897657567778', 'Cije'),
(3, 'Hesa', '89', 'Hehehe'),
(4, 'Hesyol', '87656543557', 'CIPAGERAN'),
(5, '', '0', ''),
(6, '', '0', ''),
(7, '', '0', ''),
(8, 'Pedikyua', '89765656556', 'Hanjuang'),
(9, 'konspirasi', '97676767', 'Saitama'),
(10, 'Saitama', '2277876576', 'Jepang');

-- --------------------------------------------------------

--
-- Struktur dari tabel `loket_satu`
--

CREATE TABLE `loket_satu` (
  `id` int(50) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `notelp` decimal(15,0) NOT NULL,
  `alamat` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `loket_satu`
--

INSERT INTO `loket_satu` (`id`, `nama`, `notelp`, `alamat`) VALUES
(1, 'Yeye', '897657567657', 'Cijantung'),
(2, 'Ooniki', '897657567778', 'Cijerah'),
(3, 'Hesa', '89', 'Hehehe'),
(4, 'Hesyol', '87656543557', 'CIPAGERAN'),
(5, '', '0', ''),
(6, '', '0', ''),
(7, '', '0', ''),
(8, '', '0', ''),
(9, 'Pedikyua', '89765656556', 'Hanjuang'),
(10, 'hayoloh', '986767', 'Semarang'),
(11, 'Fitrah', '87675434464', 'Sekeloa');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `loket_dua`
--
ALTER TABLE `loket_dua`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `loket_satu`
--
ALTER TABLE `loket_satu`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `loket_dua`
--
ALTER TABLE `loket_dua`
  MODIFY `id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT untuk tabel `loket_satu`
--
ALTER TABLE `loket_satu`
  MODIFY `id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

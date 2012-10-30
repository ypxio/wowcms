-- phpMyAdmin SQL Dump
-- version 3.4.10.1deb1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jun 22, 2012 at 09:50 AM
-- Server version: 5.5.22
-- PHP Version: 5.3.10-1ubuntu3.1

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `wowcms`
--

-- --------------------------------------------------------

--
-- Table structure for table `comment`
--

CREATE TABLE IF NOT EXISTS `comment` (
  `id_comment` int(2) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `content` text,
  `date` varchar(255) DEFAULT NULL,
  `id_posts` int(2) DEFAULT NULL,
  PRIMARY KEY (`id_comment`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=27 ;

--
-- Dumping data for table `comment`
--

INSERT INTO `comment` (`id_comment`, `name`, `email`, `content`, `date`, `id_posts`) VALUES
(24, 'yuri', 'yuri@gmail.com', 'hidup teknikkk!!!', 'Thu Jun 21 12:45:43 WIT 2012', 12),
(25, 'aang', 'aang@gmail.com', 'selamatkan kearifan lokal!!', 'Thu Jun 21 12:45:57 WIT 2012', 11),
(26, 'aang', 'aang@kl.com', 'ini komen', 'Thu Jun 21 13:22:04 WIT 2012', 12);

-- --------------------------------------------------------

--
-- Table structure for table `posts`
--

CREATE TABLE IF NOT EXISTS `posts` (
  `id_post` int(2) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `content` text,
  `date` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_post`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=14 ;

--
-- Dumping data for table `posts`
--

INSERT INTO `posts` (`id_post`, `username`, `title`, `content`, `date`) VALUES
(11, 'yurigantengs', 'Kearifan Lokal Sebagai Tren Untuk Memperbaiki Kerusakan Lingkungan', 'Kerusakan lingkungan mendorong manusia untuk menciptakan langkah-langkah perbaikan. Reboisasi, pengembangan energi alternatif, perjanjian internasional, dan teknologi baru yang ramah lingkungan merupakan beberapa lang kah perbaikan tersebut. Namun, beberapa langkah tersebut merupakan konsep dari lur yang diterapkan dalam kehidupan masyarakat, padahal, memperbaiki kerusakan lingkungan dapat berawal dari pelestarian kearifan lokal seperti mitos dan adat istiadat masyarakat.', 'Thu Jun 21 12:38:01 WIT 2012'),
(12, 'yurigantengs', 'judul', 'Terhitung sejak tanggal 27 oktober 2011, sebenarnya menurut SK, Teknik Informatika, Teknik Komputer, dan Sistem Informasi sudah bukan di bawah Fakultas Teknik, namun sudah dinaungi oleh program baru yang langsung berada di bawah Universitas Brawijaya, yaitu Program Teknologi Informasi dan Ilmu Komputer.     Namun, beliau mengatakan hal ini bukan berarti tidak serta merta langsung lepas dan terpisah dari Fakultas Teknik. Harus ada sebuah masa persiapan dimana semua unsur dan elemen yang terlibat di dalamnya harus menyesuaikan dengan keadaan yang baru, termasuk nasib kemahasiswaan mahasiswa Teknik Informatika, Teknik Komputer dan Sistem Informasi di ranah fakultas mengingat banyaknya mahasiswa informatika yang sedang aktif di kelembagaan fakultas, serta urusan akademis dan non akademis, yang kemudian masa persiapan dan penyesuaian ini disebut sebagai masa transisi.     Menurut beliau, masa transisi ini kemungkinan besar akan berakhir di pergantian semester genap ke ganjil beberapa bulan mendatang ini, sehingga untuk semester depan Teknik Informatika, Sistem Informasi, dan Teknik Komputer sudah harus lepas dari fakultas teknik baik dari sisi kemahasiswaan, akademis, dan non akademis.     Beliau juga menghimbau pada masa transisi ini, seluruh mahasiswa yang terlibat di dalam proses pembentukan ini, khususnya mahasiswa tif, tekom, si yang sedang aktif di kelembagaan fakultas supaya bersiap siap untuk menyesuaikan diri dengan situasi dan kondisi yang nantinya akan terjadi.     Namun, jika semua keputusan dan kebijakan nantinya mengharuskan untuk pisah dan lepas, diharapkan seluruh elemen mahasiswa sudah memiliki kesiapan dan bisa mandiri khususnya dari mahasiswa Teknik Informatika, Teknik Komputer, dan Sistem Informasi', 'Thu Jun 21 12:39:28 WIT 2012');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `username` varchar(255) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

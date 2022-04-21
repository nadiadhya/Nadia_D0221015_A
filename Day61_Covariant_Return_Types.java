impor  jawa . saya _ Pembaca Buffered ;
impor  jawa . saya _ IOException ;
impor  jawa . saya _ InputStreamReader ;

//Lengkapi kelas-kelas di bawah ini
kelas  Bunga {
    String  whatsYourName () {
        return  "Saya punya banyak nama dan tipe." ;
    }
}

kelas  Melati  memanjang  Bunga {
    @ Ganti
    String  whatsYourName () {
        kembali  "Melati" ;
    }
}

kelas  Lily  memanjang  Bunga {
    @ Ganti
    String  whatsYourName () {
        kembali  "Lili" ;
    }
}

kelas  Lotus  memanjang  Bunga {
    @ Ganti
    String  whatsYourName () {
        kembalikan  "Teratai" ;
    }
}

kelas  Wilayah {
    Bunga  BungaNasional Anda () {
        kembalikan  Bunga baru  ();
    }
}

class  WestBengal  memperluas  Wilayah {
    @ Ganti
    Melati  BungaNasional Anda () {
        kembalikan  Jasmine baru  ();
    }
}

kelas  Karnataka  memperluas  Wilayah {
    @ Ganti
    Teratai  BungaNasional Anda () {
        kembalikan  Lotus baru  ();
    }
}

class  AndhraPradesh  memperluas  Wilayah {
    @ Ganti
    Lily  BungaNasional Anda () {
        kembalikan  Lily baru  ();
    }
}

 Solusi kelas  publik {
    public  static  void  main ( String [] args ) melempar  IOException {
         Pembaca BufferedReader = new  BufferedReader ( InputStreamReader baru  ( System . in ));
        String  s = pembaca . readLine (). memangkas ();
        Wilayah  wilayah = null ;
        beralih ( s ) {
            kasus  "WestBengal" :
                wilayah = new  Benggala Barat ();
                istirahat ;
            kasus  "AndhraPradesh" :
                wilayah = baru  AndhraPradesh ();
                istirahat ;
        }
        Bunga  kembang = daerah . BungaNasional Anda ();
        Sistem . keluar . println ( bunga .whatsYourName ( ));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver_class;



/**
 *
 * @author Oracle-4
 */
public class mainSiswa {
   public static void main(String[] args) {
        siswa sw = new siswa();
//        sw.tampilkanNIK();
          sw.NIK="12345678";
          System.out.println(sw.NIK);
          sw.Nama="Ali";
          System.out.println(sw.Nama);
           sw.Kelas="XII OA";
          System.out.println(sw.Kelas);
           sw.JenisKelamin="Laki-laki";
          System.out.println(sw.JenisKelamin);

   }
}

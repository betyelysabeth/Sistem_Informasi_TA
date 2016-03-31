/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.informasi.ta;

/**
 *
 * @author Bety Elysabeth
 */
public class Aplikasi {
        private ArrayList<Dosen> daftarDosen = new ArrayList<>();
        private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        
        public void AddMahasiswa(String nama, String status, String nim, int maxMahasiswa){
            Mahasiswa m = new Mahasiswa(nama, status, nim);
                    for (int i = 0; i < maxMahasiswa; i++) {
                        daftarMahasiswa(m);
            }
        }
        
        public String getDosen(int i) {
            if (daftarDosen.get(i).getDosen(i)); {
                    return daftarDosen.get(i);
            }
        }
        
        public void createTA(Mahasiswa m, String judul){
            daftarMahasiswa.createTA(judul);
        }
        
        public void viewTA(String judul) {
            for (int i=0; i<daftarMahasiswa.judul(); i++){
                if(daftarMahasiswa.get(i).tugasAkhir.getJudul().dosen.getDosen()) {
                    return daftarMahasiswa.getJudul().getDosen();
                }
            }
        }
        
        public void viewDosenPembimbing(Mahasiswa m, String judul) {
            for (int i=0; i<daftarMahasiswa.judul(m); i++){
                if(daftarMahasiswa.get(i).tugasAkhir.getJudul(i).dosen.getDosen(i)) {
                    return daftarMahasiswa.getDosen(m);
                }
            }                
        }
        
        
}

//Nama 	: Rizki Pratama Firdaus
//Kelas 	: A11.4418
//NIM 	:  A11.2019.12220.
package mvc.Model;

public class Mahasiswa {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    private Integer id;
    private String nim;
    private String nama;
    private String jk;
    private String alamat;
}
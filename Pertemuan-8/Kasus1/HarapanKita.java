//Nama 	: Rizki Pratama Firdaus
//Kelas 	: A11.4418
//NIM 	:  A11.2019.12220
import java.util.Scanner;
import java.util.ArrayList;

class univHK {
    String namaMHS;
    String nimMHS;
    String matkulMHS;
    String matkulMHSinput;
    String jadwalMHS;
    int nilaiUtama;
    int nilaiTambahan;
    int nilaiAkhir;
    
    String namaDosen;
    String nipDosen;
    String matkulDosen;
    
    ArrayList<String> Dosen = new ArrayList<String>();
    public static ArrayList<ArrayList<String>> Jadwal = new ArrayList<ArrayList<String>>();
    public static ArrayList<ArrayList<String>> mahasiswa = new ArrayList<ArrayList<String>>();
    public static ArrayList<ArrayList<String>> binaan = new ArrayList<ArrayList<String>>();
    public static ArrayList<ArrayList<String>> ampu = new ArrayList<ArrayList<String>>();
    public static ArrayList<ArrayList<String>> matkul_mhs = new ArrayList<ArrayList<String>>();
    
    public void setNamaMHS() {
        Scanner input_mhs = new Scanner(System.in);
        System.out.print("Input nama mahasiswa : ");
        namaMHS = input_mhs.nextLine();
        this.namaMHS = namaMHS;
    }
    
    public void setNimMHS() {
        Scanner input_mhs = new Scanner(System.in);
        System.out.print("Input NIM mahasiswa : ");
        nimMHS = input_mhs.nextLine();
        this.nimMHS = nimMHS;
    }
    
    public void setInputMatkul() {
        Scanner input_mhs=new Scanner(System.in);
        System.out.print("Input Matakuliah yang ingin anda ambil:");
        matkulMHSinput=input_mhs.nextLine();
        this.matkulMHSinput = matkulMHSinput;
    }
    
    public void  setMatkulMHS(){
        this.matkulMHS=matkulMHS;

    } 
    
    public int setNilaiUtama(){
        Scanner input_nilai=new Scanner(System.in);
        System.out.print("Input masukan nilai matakuliah pokok:");
        nilaiUtama=input_nilai.nextInt();
        return nilaiUtama;

    }
    
    public int setNilaiTambahan(){
        Scanner input_nilaitambah=new Scanner(System.in);
        System.out.print("Input masukan nilai matakuliah tambah:");
        nilaiTambahan=input_nilaitambah.nextInt();
        return nilaiTambahan;
    } 
    
    public int getNilaiAkhir(){
        nilaiAkhir=(((60/100)*nilaiUtama)+((40/100)*nilaiTambahan));
        return nilaiAkhir;
    }

    public void setNamaDosen() {
        Scanner input_dsn = new Scanner(System.in);
        System.out.print("Input nama Dosen : ");
        namaDosen = input_dsn.nextLine();
        this.namaDosen = namaDosen;
    }

    public void setNipDosen() {
        Scanner input_dsn = new Scanner(System.in);
        System.out.print("Input NIP Dosen : ");
        nipDosen = input_dsn.nextLine();
        this.nipDosen = nipDosen;
    }
    
    public void setMatkulDosen(){
        Scanner input_data=new Scanner(System.in);
        System.out.print("Input masukan Matakuliah yang Dosen ampu:");
        matkulDosen=input_data.nextLine();
        this.matkulDosen = matkulDosen;
    } 

    public void getDataDosen(){
        System.out.println("Data Dosen:"+ampu);
    }
    
    public void setDosenAmpu(){
        int p=ampu.size();
        
        setNamaDosen();
        setNipDosen();
        setMatkulDosen();
        ampu.add(new ArrayList<>());
        ampu.get(p).add(0,namaDosen);
        ampu.get(p).add(1,nipDosen);
        ampu.get(p).add(2,matkulDosen);
    }
    
    public void setInputMatkulMHS(){
        int p=matkul_mhs.size();
        
        setNamaMHS();
        setNimMHS();
        setInputMatkul();
        matkul_mhs.add(new ArrayList<String>());
        matkul_mhs.get(p).add(0,namaMHS);
        matkul_mhs.get(p).add(1,nimMHS);
        matkul_mhs.get(p).add(2,matkulMHSinput);
    }

    public void getListMHS(){
        for(int i=0; i < matkul_mhs.size(); i++){
            for(int j=0; j < ampu.size(); j++){
                if(ampu.get(j).get(2).equals(matkul_mhs.get(i).get(2))){
                    int p=binaan.size();
                    binaan.add(new ArrayList<String>());
                    binaan.get(p).add(matkul_mhs.get(i).get(0));
                } 
            }
        }
    }  
    
    public void setJadwal(){
        Scanner input_jadwal=new Scanner(System.in);
        System.out.print("Silahkan input Jadwal mengajar Dosen:");
        jadwalMHS=input_jadwal.nextLine();
        int p=Jadwal.size();
            Jadwal.add(new ArrayList<String>());
            Jadwal.get(p).add(0,jadwalMHS);
    }
}

class Mhs extends univHK {
    
    public void set_InputMatkulMHS(){
        super.setInputMatkulMHS();
    }

    public void getDataMHS(){
        System.out.println("Data Mahasiswa:"+super.matkul_mhs);
    }

    public void getJadwal(){
        if(super.matkul_mhs.equals(super.matkulDosen)){
            System.out.println("anda memiliki jadwal pada"+super.Jadwal);
        }
    }
}

class mataKuliah extends univHK {
    
    public void setMatkul(){
        super.setMatkulMHS();
    }
    
}

class matkulUtama extends mataKuliah{
    
    ArrayList<String> matkulUtama=new ArrayList<String>();
    public void setMatkulUtama(String matakuliahUtama){
        matkulUtama.add(matakuliahUtama);

    }

    public void getMatkulUtama(){
        System.out.println("Matakuliah pokok:"+matkulUtama);
    }
}

class matkulTambahan extends mataKuliah{
    
    ArrayList<String> matkulTambahan = new ArrayList<String>();
    public void setMatkulTambahan(String matakuliahTambahan){
        matkulTambahan.add(matakuliahTambahan);

    }

    public void getmatkulTambahan(){
        System.out.println("Matakuliah Tambahan:"+matkulTambahan);
    }
}

class dosenAmpu extends univHK {
   
    public void pengampu(){
        super.setDosenAmpu();
    }
    
    public void getMatkulAmpu(){
        System.out.println("Daftar Dosen dan matakuliah yang diampu:"+super.ampu);
    }
    
}

class listMHS extends univHK {
    
    public void setDosen(){
        super.setDosenAmpu();
        super.setJadwal();
        super.getDataDosen();
    }
    
    public void setMHS(){
        super.setMatkulMHS();
    }
    
    public void getMHS_Ampu(){
        super.getListMHS();
    }
    
    public void get_list(){
        if(univHK.binaan.isEmpty()||super.matkulMHS.equals(super.matkulDosen)) {
            for(int i=0; i < univHK.ampu.size(); i++) { 
                System.out.println("Mahasiswa Yang  diampu Dosen "+univHK.ampu.get(i).get(0)+":"+univHK.binaan);
                System.out.println("Jam perkuliahan Mahasiswa pada : "+univHK.Jadwal.get(i).get(0));
            }
        }
        else {
            for(int i=0; i < univHK.Jadwal.size(); i++){
                System.out.println("Mahasiswa Yang  diampu Dosen "+univHK.ampu.get(i).get(0)+":"+univHK.binaan.get(i).get(0));
                System.out.println("Jam perkuliahan Mahasiswa pada : "+univHK.Jadwal.get(i).get(0));
            }
        }            
    }
}

public class HarapanKita {

    public static void main(String[] args) {
        matkulUtama matakuliah_Utama = new matkulUtama();
        matakuliah_Utama.setMatkulUtama("PBO");
        matkulTambahan matakuliah_Tambahan = new matkulTambahan();
        matakuliah_Tambahan.setMatkulTambahan("Basis Data");
        univHK universitas = new univHK();
        
        listMHS MHS_Ampu = new listMHS();
        MHS_Ampu.setDosen();
 
        matakuliah_Utama.getMatkulUtama();
        matakuliah_Tambahan.getmatkulTambahan();

        MHS_Ampu.setNamaMHS();
        MHS_Ampu.setNimMHS();
        MHS_Ampu.getMHS_Ampu();
        
        MHS_Ampu.get_list();
        universitas.getNilaiAkhir();
    }
    
}
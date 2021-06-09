//Nama 	: Rizki Pratama Firdaus
//Kelas 	: A11.4418
//NIM 	:  A11.2019.12220.
package mvc.DAOInterface;

import java.util.List;
import mvc.Model.*;
public interface IMahasiswa {
    public void insert(Mahasiswa b);
    public void update(Mahasiswa b);
    public void delete(int id);
    public List<Mahasiswa> getAll();
    public List<Mahasiswa> getCariNama(String nama);
}
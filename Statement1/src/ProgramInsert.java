/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
    import java.sql.SQLClientInfoException;
    import java.sql.Connection;
    import java.sql.Statement;
    import java.sql.SQLException;

public class ProgramInsert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection koneksi = KoneksiDatabase.getKoneksi();
        Statement statement = null;
        try {
                statement = koneksi.createStatement();
        System.out.println("Statement berhasil dibuat");
        String url= "INSERT INTO barang (kode_barang,nama_barang,jumlah,harga)VALUES('B001','Buku Gambar',10,5000)";
        statement.executeUpdate(url);
        }catch(SQLException ex){
            System.out.println("Statement gagal dibuat");
            System.out.println("Pesan : "+ex.getMessage());
        }finally{
        if(statement !=null){
        try{
        statement.close();
        System.out.println("Statement berhasil ditutup");
        }catch(SQLException ex){
            System.out.println("Statement gagal ditutup");
            System.out.println("Pesan : "+ex.getMessage());
        }
        }
        }
    }
}
        
        
            
        
        
    
    


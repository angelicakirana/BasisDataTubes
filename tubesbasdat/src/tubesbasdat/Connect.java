/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubesbasdat;
import java.sql.*;
import java.util.logging.*;
/**
 *
 * @author Lenovo
 */
public class Connect {
        Connection koneksi;
        public Connection getConnection(){
            try{
                    koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3307/database","root","");

            } catch (SQLException e){
                            System.out.println("Tidak dapat menyambungkan ke database");
                            }
                    return koneksi;
        }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg.access;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author deivi
 */
public class ConexionAccess {

    private static Connection con = null;
    private static String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
    private static String url = "jdbc:ucanaccess://C:\\Users\\deivi\\Downloads\\gestion\\gestionPedidos.mdb";

    public ConexionAccess() {

    }

    /**
     * @return the con
     */
    public static Connection getCon() {
        return con;
    }

    /**
     * @param aCon the con to set
     */
    public static void setCon(Connection aCon) {
        con = aCon;
    }

    /**
     * @return the driver
     */
    public static String getDriver() {
        return driver;
    }

    /**
     * @param aDriver the driver to set
     */
    public static void setDriver(String aDriver) {
        driver = aDriver;
    }

    /**
     * @return the url
     */
    public static String getUrl() {
        return url;
    }

    /**
     * @param aUrl the url to set
     */
    public static void setUrl(String aUrl) {
        url = aUrl;
    }

    public static Connection obtenerConexion() {

        try {
            
            if(con==null){
                Class.forName(driver);
                con = DriverManager.getConnection(url);
                JOptionPane.showMessageDialog(null, "Conexion correcta!");
            }

        } catch (Exception e) {
            /*
             * printStackTrace() nos sirve para poder saber en que parte de
             * nuestro codigo esta el error y porque, a diferencia de print(e)
             * que solo diria el error mas no donde esta.
             */
            e.printStackTrace();
            con = null;
            System.out.println("Error: " + e);
        }
        return null;

    }

}

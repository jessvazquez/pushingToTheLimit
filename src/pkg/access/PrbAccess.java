/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg.access;

import java.sql.Connection;

/**
 *
 * @author deivi
 */
public class PrbAccess {

    public static void main(String[] args) {

        Connection cn = ConexionAccess.obtenerConexion();

    }
}

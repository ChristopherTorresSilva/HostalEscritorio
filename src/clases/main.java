/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import forms.login;
/**
 *
 * @author Chriss
 */
public class main {
    
    public static void main (String[] args){
        login log = new login();
        log.setLocationRelativeTo(null);
        log.setVisible(true);
    }
    
    public static boolean login(String user, String pass) {
        ServicioHostal.ServicioHostal service = new ServicioHostal.ServicioHostal();
        ServicioHostal.ServicioHostalSoap port = service.getServicioHostalSoap();
        return port.login(user, pass);
    }

    public static boolean createProveedor(String userN, int perfil, String rut, String nombre, String telefono, String correo, int rubro) {
        org.tempuri.ServicioHostal service = new org.tempuri.ServicioHostal();
        org.tempuri.ServicioHostalSoap port = service.getServicioHostalSoap();
        return port.createProveedor(userN, perfil, rut, nombre, telefono, correo, rubro);
    }

    public static boolean createEmpleados(String userN, int perfil, String rut, String nombre, String apellido, int cargo) {
        org.tempuri.ServicioHostal service = new org.tempuri.ServicioHostal();
        org.tempuri.ServicioHostalSoap port = service.getServicioHostalSoap();
        return port.createEmpleados(userN, perfil, rut, nombre, apellido, cargo);
    }

    public static boolean createEmpresa(String userN, int perfil, String rut, String nombre, String correo) {
        org.tempuri.ServicioHostal service = new org.tempuri.ServicioHostal();
        org.tempuri.ServicioHostalSoap port = service.getServicioHostalSoap();
        return port.createEmpresa(userN, perfil, rut, nombre, correo);
    }
    
    
}

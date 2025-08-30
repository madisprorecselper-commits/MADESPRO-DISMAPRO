package com.madeprodisma.main;

import com.madeprodisma.dao.UsuarioDAO;
import com.madeprodisma.modelo.Usuario;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando Sistema de Contratación...");
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        //INSERTA
        Usuario nuevo = new Usuario(
                "Daniela",           
                "3813",              
                "Daniela Gomez",     
                "150204380",         
                "sdaaniao@gmail.com", 
                "300134235557"       
        );
        if (usuarioDAO.insertar(nuevo)) {
            System.out.println("Usuario insertado correctamente.");
        } else {
            System.out.println("Error al insertar usuario.");
        }

        // PARA LISTAR
        System.out.println("Lista de usuarios:");
        List<Usuario> usuarios = usuarioDAO.listar();
        for (Usuario u : usuarios) {
            System.out.println(u.getIdUsuario() + " - " + u.getNombre() + " (" + u.getEmail() + ")");
        }

        // OBTENER POR ID
        int idBuscado = 1;
        System.out.println("Buscando usuario con ID = " + idBuscado);
        Usuario encontrado = usuarioDAO.obtenerPorId(idBuscado);
        if (encontrado != null) {
            System.out.println("Encontrado: " + encontrado.getNombre() + " (" + encontrado.getEmail() + ")");
        } else {
            System.out.println("Usuario no encontrado.");
        }

        // ACTUALIZA
        if (encontrado != null) {
            encontrado.setNombre("Daniela G. Actualizada");
            encontrado.setTelefono("300999888");
            if (usuarioDAO.actualizar(encontrado)) {
                System.out.println("Usuario actualizado correctamente.");
            } else {
                System.out.println("Error al actualizar usuario.");
            }
        }

        //ELIMINA
        int idEliminar = 2; 
        if (usuarioDAO.eliminar(idEliminar)) {
            System.out.println("Usuario con ID " + idEliminar + " eliminado.");
        } else {
            System.out.println("Error al eliminar usuario con ID " + idEliminar);
        }

        //Lista final
        System.out.println("\nLista de usuarios después de cambios:");
        usuarios = usuarioDAO.listar();
        for (Usuario u : usuarios) {
            System.out.println(u.getIdUsuario() + " - " + u.getNombre() + " (" + u.getEmail() + ")");
        }
    }
}

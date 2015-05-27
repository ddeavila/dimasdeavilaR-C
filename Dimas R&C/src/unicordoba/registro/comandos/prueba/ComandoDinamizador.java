/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unicordoba.registro.comandos.prueba;

import unicordoba.registro.comandos.ICommand;
import unicordoba.registro.principal.Principal;
import unicordoba.registro.ventana.prueba.VentanaDinamizador;

/**
 *
 * @author dimas
 */
public class ComandoDinamizador implements ICommand {
    @Override
    public void execute() {
        VentanaDinamizador op = new  VentanaDinamizador();
        Principal.getSingleton().AddVentana(op);
    }
    
}
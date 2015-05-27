/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unicordoba.registro.comandos.prueba;

import unicordoba.registro.comandos.ICommand;
import unicordoba.registro.principal.Principal;
import unicordoba.registro.ventana.prueba.VentanaProfesor;

/**
 *
 * @author dimas
 */
public class ComandoProfesor implements ICommand {
    @Override
    public void execute() {
        VentanaProfesor op = new  VentanaProfesor();
        Principal.getSingleton().AddVentana(op);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unicordoba.registro.comandos.prueba;

import unicordoba.registro.comandos.ICommand;
import unicordoba.registro.principal.Principal;
import unicordoba.registro.ventana.prueba.VentanaUtencilio;

/**
 *
 * @author Dimas De Avila
 */
public class ComandoUtencilio implements ICommand {
    @Override
    public void execute() {
        VentanaUtencilio op = new  VentanaUtencilio();
        Principal.getSingleton().AddVentana(op);
    }
    
}

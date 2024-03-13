/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.proxy;
import cl.proxy.inter.ICuenta;
import cl.proxy.inter.impl.CuentaBancoBImpl;
import cl.proxy.model.Cuenta;
import cl.proxy.proxy.CuentaProxy;
/**
 *
 * @author Robinson Concha
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuenta c = new Cuenta(1, "IPlacex", 100);
        ICuenta cuentaProxy = new CuentaProxy(new CuentaBancoBImpl());
        cuentaProxy.mostrarSaldo(c);
        c = cuentaProxy.depositarDinero(c, 50);
        c = cuentaProxy.retirarDinero(c, 20);
        cuentaProxy.mostrarSaldo(c);
    }
}
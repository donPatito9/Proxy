/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.proxy.proxy;
import java.util.logging.Logger;
import cl.proxy.inter.ICuenta;
import cl.proxy.inter.impl.CuentaBancoAImpl;
import cl.proxy.model.Cuenta;
/**
 *
 * @author Robinson Concha
 */
public class CuentaProxy  implements ICuenta{
    private ICuenta cuentaReal;
    private final static Logger LOGGER = Logger.getLogger(CuentaProxy.class.getName());
    
    public CuentaProxy(ICuenta cuentaReal) {
      this.cuentaReal = cuentaReal;
    }
    @Override
    public Cuenta retirarDinero(Cuenta cuenta, double monto) {
    LOGGER.info("----Cuenta Proxy - Retirar Dinero---");
    if(cuentaReal == null){
    cuentaReal = new CuentaBancoAImpl();
    return cuentaReal.retirarDinero(cuenta, monto);    
    }else{
        return cuentaReal.retirarDinero(cuenta, monto);
     }
    }
    @Override
    public Cuenta depositarDinero(Cuenta cuenta, double monto){
    LOGGER.info("----Cuenta Proxy - Depositar Dinero---");
    if(cuentaReal == null){
    cuentaReal = new CuentaBancoAImpl();
    return cuentaReal.depositarDinero(cuenta, monto);    
    }else{
        return cuentaReal.depositarDinero(cuenta, monto);
     }
    }
    @Override
    public void mostrarSaldo(Cuenta cuenta) {
    LOGGER.info("----Cuenta Proxy - Mostrar Dinero---");
    if(cuentaReal == null){
    cuentaReal = new CuentaBancoAImpl();
    cuentaReal.mostrarSaldo(cuenta);    
    }else{
        cuentaReal.mostrarSaldo(cuenta);
     }
    }
}

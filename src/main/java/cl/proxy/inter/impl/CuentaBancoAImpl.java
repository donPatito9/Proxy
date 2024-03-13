/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.proxy.inter.impl;
import cl.proxy.inter.ICuenta;
import cl.proxy.model.Cuenta;
/**
 *
 * @author Robinson Concha
 */
public class CuentaBancoAImpl implements ICuenta{
    @Override
    public Cuenta retirarDinero(Cuenta cuenta, double monto){
      double saldoActual = cuenta.getSaldoInicial() - monto;
      cuenta.setSaldoInicial(saldoActual);
      System.out.println("Saldo actual: " + cuenta.getSaldoInicial());
      return cuenta;
    }
    @Override
    public Cuenta depositarDinero(Cuenta cuenta, double monto){
      double saldoActual = cuenta.getSaldoInicial() + monto;
      cuenta.setSaldoInicial(saldoActual);
      System.out.println("Saldo actual: " + cuenta.getSaldoInicial());
      return cuenta;
    }
    @Override
    public void mostrarSaldo(Cuenta cuenta) {
      System.out.println("Saldo actual: " + cuenta.getSaldoInicial());
    }
 }

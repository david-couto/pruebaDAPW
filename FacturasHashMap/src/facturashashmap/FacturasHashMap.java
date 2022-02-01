/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturashashmap;

import java.util.*;
import misClases.Factura;

/**
 *
 * @author DAW
 */
public class FacturasHashMap {

    public static Map<String,Factura> mapaFactura;

    public FacturasHashMap() {
    }

    private static void crearRellenarAñadirFacturasHashMapPorNuneroFactura() {
        Factura f1 = new Factura();
        f1.setNumeroFactura("000001");
        f1.setCliente("ClienteA");
        f1.setTotal(100.00);
        Factura f2 = new Factura();
        f2.setNumeroFactura("000002");
        f2.setCliente("ClienteB");
        f2.setTotal(200.00);
        Factura f3 = new Factura();
        f3.setNumeroFactura("000003");
        f3.setCliente("ClienteC");
        f3.setTotal(300.00);
        
        Factura f4 = new Factura();
        f4.setNumeroFactura("000004");
        f4.setCliente("ClienteD");
        f4.setTotal(400.00);
        Factura f5 = new Factura();
        f5.setNumeroFactura("000005");
        f5.setCliente("ClienteE");
        f5.setTotal(500.00);
        mapaFactura.put("000001", f1);
        mapaFactura.put("000002", f2);
        mapaFactura.put("000003", f3);
        mapaFactura.put("000004", f4);
        mapaFactura.put("000008", f5);
    }

    public static void main(String[] args) {
        mapaFactura = new HashMap();
        crearRellenarAñadirFacturasHashMapPorNuneroFactura();
        System.out.println(mapaFactura.get("000002").getCliente());
    }
}

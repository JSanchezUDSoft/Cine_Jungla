package Interfaces;

import Modelo.Ventas;

public interface VentasCRUD {
    public byte Listar(Ventas venta);
    public boolean registrarVentas(Ventas venta);
}

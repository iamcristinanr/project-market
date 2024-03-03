package com.proyect.market.persistence;

import com.proyect.market.persistence.crud.ProductoCrudReporitory;
import com.proyect.market.persistence.entity.Producto;

import java.util.List;
import java.util.Optional;

public class ProductoRepository {

    private ProductoCrudReporitory productoCrudReporitory;

    public List<Producto> getAll() {
        return (List<Producto>) productoCrudReporitory.findAll();
    }

    public List<Producto> getByCategoria(int idCategoria) {
        return productoCrudReporitory.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }

    public Optional<List<Producto>> getEscasos(int cantidad) {
        return productoCrudReporitory.findByCantidadStockLessThanAndEstado(cantidad, true);

    }
}
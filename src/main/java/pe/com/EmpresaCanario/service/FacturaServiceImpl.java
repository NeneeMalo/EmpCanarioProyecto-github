package pe.com.EmpresaCanario.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.EmpresaCanario.entity.Factura;
import pe.com.EmpresaCanario.repository.FacturaRepository;

@Service
public class FacturaServiceImpl implements FacturaService {

    @Autowired
    private FacturaRepository repositorio;
    
    @Override
    public List<Factura> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<Factura> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public Optional<Factura> findById(long id) {
        return repositorio.findById(id);
    }

    @Override
    public Factura add(Factura f) {
        return repositorio.save(f);
    }

    @Override
    public Factura update(Factura f) {
        Factura objfactura=repositorio.getById(f.getIdfactura());
        BeanUtils.copyProperties(f, objfactura);
        return repositorio.save(objfactura);
    }

    @Override
    public Factura delete(Factura f) {
        Factura objfactura=repositorio.getById(f.getIdfactura());
        objfactura.setEstado(false);
        return repositorio.save(objfactura);
    }
    
}

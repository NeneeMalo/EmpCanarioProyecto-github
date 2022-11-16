package pe.com.EmpresaCanario.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="Producto")
@Table(name="producto")
public class Producto implements Serializable {
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="id_producto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idproducto;
    @Column(name="tamano")
    private float tamano;
    @Column(name="stock")
    private String stock;
    @Column(name="precio")
    private float precio;
    @Column(name="estado")
    private boolean estado;
}

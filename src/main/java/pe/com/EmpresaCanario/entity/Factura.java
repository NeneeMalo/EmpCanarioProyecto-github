package pe.com.EmpresaCanario.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="Factura")
@Table(name="factura")
public class Factura implements Serializable {
    @Id
    @Column(name="id_factura")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idfactura;
    @ManyToOne
    @JoinColumn(name="id_cliente", nullable=false)
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name="id_pago", nullable=false)
    private Pago pago;
    @Column(name="fecha")
    private String fecha;
    @Column(name="estado")
    private boolean estado;
}

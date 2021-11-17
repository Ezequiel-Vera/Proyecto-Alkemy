package com.AlkemyProject.entity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import org.springframework.format.annotation.DateTimeFormat;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="icon")
@Getter
@Setter
public class IconEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String imagen;
    private String denominacion;

    @Column(name="fecha_creacion")
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private LocalDate fechaCreacion;

    private long altura;
    private String historia;

    @ManyToMany(mappedBy = "icons",cascade = CascadeType.ALL)
    private List<PaisEntity> paises=new ArrayList<>();

    public void addPais(PaisEntity pais){this.paises.add(pais);}

    public void removePais(PaisEntity pais){this.paises.remove(pais);}
}

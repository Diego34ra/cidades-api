package cidadesapi.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Estado {

    @Id
    private Integer id;

    @Column(length = 75)
    private String nome;

    @Column(length = 2)
    private String uf;

    @Column(length = 2)
    private Integer ibge;

    @ManyToOne
    @JoinColumn(name = "pais", referencedColumnName = "id")
    private Pais pais;

    private String ddd;
}

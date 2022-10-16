package cidadesapi.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pais {

    @Id
    private Integer id;

    private String nome;

    private String nome_pt;

    private String sigla;

    private Integer bacen;
}

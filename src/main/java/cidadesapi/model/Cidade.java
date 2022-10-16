package cidadesapi.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Cidade {

    @Id
    private Long id;

    private String nome;

    private Integer uf;

    private Integer ibge;
}

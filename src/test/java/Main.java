import com.homecare.model.entity.Historico;
import com.homecare.model.entity.Paciente;
import com.homecare.model.entity.Pessoa;
import com.homecare.model.enums.GeneroEnum;
import com.homecare.model.enums.TipoUsuarioEnum;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.LinkedList;

public class Main {
        public static void main( String[ ] args )
        {
            //Create Paciente Entity
            Pessoa pessoa = Pessoa.builder()
                    .nome("Rafael Souza")
                    .altura(1.52)
                    .peso(80.9)
                    .email("ralfalf@mail.com")
                    .altura(1.52)
                    .genero(GeneroEnum.FEMININO)
                    .tipoUsuario(TipoUsuarioEnum.PACIENTE)
                    .cpf("23213")
                    .build();

            Historico historico = Historico.builder()
                    .descricao("Historico")
                    .build();

            Historico historico2 = Historico.builder()
                    .descricao("Historico2")
                    .build();

            Historico historico3 = Historico.builder()
                    .descricao("Historico3")
                    .build();

            Historico historico4 = Historico.builder()
                    .descricao("Historico4")
                    .build();

            Paciente paciente = Paciente.builder()
                    .pessoa(pessoa)
                    .historico(new LinkedList<Historico>())
                    .build();

            paciente.getHistorico().add(historico);
            paciente.getHistorico().add(historico2);
            paciente.getHistorico().add(historico3);
            paciente.getHistorico().add(historico4);
            System.out.println(pessoa);
            System.out.println(paciente);
            System.out.println(historico);


        }
}

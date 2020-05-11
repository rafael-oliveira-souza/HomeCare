import com.homecare.model.entity.Paciente;
import com.homecare.model.entity.Pessoa;
import com.homecare.model.enums.GeneroEnum;
import com.homecare.model.enums.TipoUsuarioEnum;

import java.util.LinkedList;

public class Main {
        public static void main( String[ ] args )
        {
            //Create Paciente Entity
//            Pessoa pessoa = Pessoa.builder()
//                    .nome("Rafael Souza")
//                    .altura(1.52)
//                    .peso(80.9)
//                    .email("ralfalf@mail.com")
//                    .altura(1.52)
//                    .genero(GeneroEnum.FEMININO)
//                    .tipoUsuario(TipoUsuarioEnum.PACIENTE)
//                    .cpf("23213")
//                    .build();

            Paciente paciente = new Paciente
            		.builder()
//                    .pessoa(pessoa)
                    .build();

//            System.out.println(pessoa);
            System.out.println(paciente);


        }
}

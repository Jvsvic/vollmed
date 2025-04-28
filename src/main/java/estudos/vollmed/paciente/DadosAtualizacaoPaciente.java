package estudos.vollmed.paciente;

import estudos.vollmed.enderecomedico.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoPaciente(
        @NotNull
        Long id,
        String nome,
        String email,
        String telefone
) {
}

package estudos.vollmed.domain.paciente;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoPaciente(
        @NotNull
        Long id,
        String nome,
        String email,
        String telefone
) {
}

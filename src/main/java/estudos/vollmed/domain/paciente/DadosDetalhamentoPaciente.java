package estudos.vollmed.domain.paciente;

import estudos.vollmed.domain.enderecomedico.Endereco;

public record DadosDetalhamentoPaciente(
        Long id,
        String nome,
        String email,
        String telefone,
        Endereco endereco
) {

    public DadosDetalhamentoPaciente(Paciente paciente){
        this(
                paciente.getId(),
                paciente.getNome(),
                paciente.getEmail(),
                paciente.getTelefone(),
                paciente.getEndereco()
        );
    }

}


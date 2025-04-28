package estudos.vollmed.paciente;

import estudos.vollmed.enderecomedico.Endereco;

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


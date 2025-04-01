package estudos.vollmed.controller;

import estudos.vollmed.endereco.Endereco;
import estudos.vollmed.medicodto.DadosCadastroMedico;
import estudos.vollmed.medicodto.DadosListagemMedico;
import estudos.vollmed.medicodto.Medico;
import estudos.vollmed.medicodto.Medicorepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private Medicorepository medicorepository;



    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroMedico dados){
        medicorepository.save(new Medico(dados));
    }

    @GetMapping
    public Page<DadosListagemMedico> listar(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao) {
        return medicorepository.findAll(paginacao)
                .map(DadosListagemMedico::new);
    }



}
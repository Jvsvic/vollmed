package estudos.vollmed.controller;

import estudos.vollmed.endereco.Endereco;
import estudos.vollmed.medicodto.DadosCadastroMedico;
import estudos.vollmed.medicodto.Medico;
import estudos.vollmed.medicodto.Medicorepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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




}
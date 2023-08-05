package med.voll.api.paciente;

import jakarta.validation.Valid;
import med.voll.api.enderecos.DadosEndereco;

public record DadosAtualizacaoPaciente(
	    Long id,
	    String nome,
	    String telefone,
	    @Valid DadosEndereco endereco
	) {
	}

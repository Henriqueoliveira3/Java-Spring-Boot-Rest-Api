package med.voll.api.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.enderecos.DadosEndereco;

public record DadosAtualizarMedico(
		@NotNull
		Long id, 
		String telefone, 
		String nome, 
		DadosEndereco endereco) {

}

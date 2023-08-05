package med.voll.api.paciente;

import med.voll.api.enderecos.DadosEndereco;

public record DadosCadastroPaciente(String nome, String email, String telefone, String cpf, DadosEndereco endereco) {

}

package br.com.senai.futurodev.model.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestAssigneeDTO{
        @NotBlank(message = "O campo nome é obrigatório!")
        //@Size(max = 45, message = "Limite de 45 caracteres!")
        String name;
}

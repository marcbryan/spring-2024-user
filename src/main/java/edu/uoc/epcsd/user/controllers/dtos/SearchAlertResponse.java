package edu.uoc.epcsd.user.controllers.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import edu.uoc.epcsd.user.entities.Alert;
import lombok.*;

import java.time.LocalDate;

@ToString
@Getter
@Setter
@EqualsAndHashCode
@Builder
@AllArgsConstructor
public final class SearchAlertResponse {

    private Long id;

    @JsonFormat(pattern="dd-MM-yyyy")
    private LocalDate from;

    @JsonFormat(pattern="dd-MM-yyyy")
    private LocalDate to;

    private Long productId;

    // Utilizaremos este DTO para evitar enviar la contraseña al buscar alertas
    private GetUserResponse user;

    public static SearchAlertResponse fromDomain(Alert alert) {
        return SearchAlertResponse.builder()
                .id(alert.getId())
                .from(alert.getFrom())
                .to(alert.getTo())
                .user(GetUserResponse.fromDomain(alert.getUser()))
                .productId(alert.getProductId())
                .build();
    }
}

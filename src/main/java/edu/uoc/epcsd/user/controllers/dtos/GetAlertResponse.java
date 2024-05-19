package edu.uoc.epcsd.user.controllers.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import edu.uoc.epcsd.user.entities.Alert;
import edu.uoc.epcsd.user.entities.User;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


import java.time.LocalDate;

@ToString
@Getter
@Setter
@EqualsAndHashCode
@Builder
@AllArgsConstructor
public final class GetAlertResponse {

    private Long id;

    @JsonFormat(pattern="dd-MM-yyyy")
    private LocalDate from;

    @JsonFormat(pattern="dd-MM-yyyy")
    private LocalDate to;

    private GetProductResponse product;

    private User user;

    public static GetAlertResponse fromDomain(Alert alert, GetProductResponse product) {
        return GetAlertResponse.builder()
                .id(alert.getId())
                .from(alert.getFrom())
                .to(alert.getTo())
                .user(alert.getUser())
                .product(product)
                .build();
    }
}

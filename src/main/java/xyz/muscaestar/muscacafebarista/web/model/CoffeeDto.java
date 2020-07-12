package xyz.muscaestar.muscacafebarista.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.util.UUID;

/**
 * Created by muscaestar on 7/9/20
 *
 * @author muscaestar
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CoffeeDto {

    @Null
    private UUID id;

    @NotBlank
    private String cfeName;

    @NotBlank
    private String cfeStyle;

    @Positive
    private Long upc;
}

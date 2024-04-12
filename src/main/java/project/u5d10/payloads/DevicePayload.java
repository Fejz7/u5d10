package project.u5d10.payloads;

import jakarta.validation.constraints.NotEmpty;

public record DevicePayload(

        @NotEmpty(message = "il dispositivo è sprovvisto di status")
        String status,

        @NotEmpty(message = "specifica il dispositivo")
        String type) {
}

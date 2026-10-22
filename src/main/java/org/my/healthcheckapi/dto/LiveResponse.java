package org.my.healthcheckapi.dto;

public record LiveResponse(
        String status,
        String timestamp
) {}

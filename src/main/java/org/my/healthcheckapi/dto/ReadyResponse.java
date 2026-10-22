package org.my.healthcheckapi.dto;

public record ReadyResponse(
        String status,
        String database,
        String timestamp
) {}

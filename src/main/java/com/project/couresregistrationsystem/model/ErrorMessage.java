package com.project.couresregistrationsystem.model;

import java.time.LocalDateTime;

public record ErrorMessage(LocalDateTime localDateTime, String message ,String body) {
}

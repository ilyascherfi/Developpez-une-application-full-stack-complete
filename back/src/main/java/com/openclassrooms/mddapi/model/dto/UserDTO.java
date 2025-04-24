package com.openclassrooms.mddapi.model.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserDTO {
  Long id;
  String name;
  String email;
  LocalDate created_at;
  LocalDate updated_at;
}

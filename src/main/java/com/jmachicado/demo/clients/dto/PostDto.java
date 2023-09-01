package com.jmachicado.demo.clients.dto;

import lombok.Data;

@Data
public class PostDto {

  private Integer userId;
  private Integer id;
  private String tittle;
  private String body;
}

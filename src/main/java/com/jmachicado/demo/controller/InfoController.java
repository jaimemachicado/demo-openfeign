package com.jmachicado.demo.controller;

import com.jmachicado.demo.clients.PostClient;
import com.jmachicado.demo.clients.dto.PostDto;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class InfoController {

  @Autowired
  private PostClient postClient;

  @GetMapping("/posts")
  public ResponseEntity<List<PostDto>> getPosts() {
    return ResponseEntity.ok(postClient.getPosts().getBody());
  }
}

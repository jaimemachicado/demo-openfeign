package com.jmachicado.demo.clients;

import com.jmachicado.demo.clients.dto.PostDto;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "posts", url = "http://jsonplaceholder.typicode.com")
public interface PostClient {

  @GetMapping(value = "/posts")
  ResponseEntity<List<PostDto>> getPosts();
}

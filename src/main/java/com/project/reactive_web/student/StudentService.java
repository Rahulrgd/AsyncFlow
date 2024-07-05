package com.project.reactive_web.student;

import java.time.Duration;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class StudentService {

  private final StudentRepository studentRepository;

  public Flux<Student> findAll() {
    return studentRepository.findAll().delayElements(Duration.ofSeconds(1));
  }

  public Mono<Student> findById(Long id) {
    return studentRepository.findById(id);
  }
}

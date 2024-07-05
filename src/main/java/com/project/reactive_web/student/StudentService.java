package com.project.reactive_web.student;

import lombok.RequiredArgsConstructor;

import java.time.Duration;

import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class StudentService {

  private final StudentRepository studentRepository;

  public Flux<Student> findAll() {
    return studentRepository.findAll().delayElements(Duration.ofSeconds(1));
  }
}

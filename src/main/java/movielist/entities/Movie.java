package movielist.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.RequiredArgsConstructor;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Movie {
  // movies have id, names, watched
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String name;

  private Boolean watched;




}

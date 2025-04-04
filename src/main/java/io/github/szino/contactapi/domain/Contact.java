package io.github.szino.contactapi.domain;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;


@Entity
@Getter
@Setter
@NoArgsConstructor
@JsonInclude(NON_DEFAULT)
@Table(name = "contacts")
public class Contact {
    @Id
    @UuidGenerator
    @Column(name = "id",unique = true, updatable = false)
    private String id;
    private String name;
    private String email;
    private String title;
    private String phone;
    private String address;
    private String status;
    private String photoUrl;
}

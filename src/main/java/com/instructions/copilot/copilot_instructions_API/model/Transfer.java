package com.instructions.copilot.copilot_instructions_API.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Transfers")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Transfer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, name = "from_team")
    private String from;

    @Column(nullable = false, name = "to_team")
    private String to;

    @Column(nullable = false)
    private String amount;
}

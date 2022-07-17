package spring.mvc.entity;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "TODO")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String description_todo;
    private String priority;
    private String date_todo;
    @Column(name = "is_deleted")
    private int isDeleted;
}

package com.highmaster.whatsappclone.user;

import com.highmaster.whatsappclone.common.BaseAuditingEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Id;


import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User extends BaseAuditingEntity {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDateTime lastSeen;
}

package com.springmvc.demo.demo.entity;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "id", nullable = false)
    private String id;

    // Để public hết cho đơn giản, bình thường sẽ là private và dùng getter, setter
    public String name;
    public Integer age;
    public String password;  // Đã được hash bcrypt
}


package com.family.jira.entity

import jakarta.persistence.Entity
import jakarta.persistence.ManyToOne
import lombok.AllArgsConstructor
import lombok.Builder
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.ToString

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@ToString
class Space: BaseEntity<Int>() {
     lateinit var name: String

     @ManyToOne
     lateinit var owner: User
}

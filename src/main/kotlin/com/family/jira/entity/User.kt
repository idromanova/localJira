package com.family.jira.entity

import jakarta.persistence.Entity
import jakarta.persistence.OneToMany
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
class User: BaseEntity<Int>() {
    lateinit var name: String
    lateinit var lastName: String

    @OneToMany
    lateinit var spaces: MutableList<Space>
}
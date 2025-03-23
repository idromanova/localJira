package com.family.jira.entity

import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.MappedSuperclass
import java.io.Serializable

@MappedSuperclass
open class BaseEntity<T: Serializable> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    lateinit var id: T
}

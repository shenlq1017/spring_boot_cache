package com.lic.portal.encache.model

import org.hibernate.annotations.GenericGenerator

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
class Person {

    @Id
    @Column(name = "id", nullable = false, length = 64)
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    String id;

    @Column(name = "name", nullable = true, length = 20)
    String name;

    @Column(name = "agee", nullable = true, length = 4)
    int age;
}
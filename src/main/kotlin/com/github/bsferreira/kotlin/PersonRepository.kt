package com.github.bsferreira.kotlin

import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "person", path = "person")
interface PersonRepository : PagingAndSortingRepository<Person, Long>

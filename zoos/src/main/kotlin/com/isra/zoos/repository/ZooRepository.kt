package com.isra.zoos.repository

import com.isra.zoos.model.Zoo
import org.springframework.data.repository.CrudRepository

interface ZooRepository : CrudRepository<Zoo, Long>
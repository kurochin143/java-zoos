package com.isra.zoos.service

import com.isra.zoos.model.Zoo

interface ZooService {

    fun findAll(): MutableList<Zoo>

}
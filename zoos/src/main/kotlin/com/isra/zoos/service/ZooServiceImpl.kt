package com.isra.zoos.service

import com.isra.zoos.model.Zoo
import com.isra.zoos.repository.ZooRepository
import com.isra.zoos.views.CountAnimalsInZoos
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ZooServiceImpl : ZooService {

    @Autowired
    lateinit var zooRepository: ZooRepository

    override fun findAll(): MutableList<Zoo> {
        val outZoos = mutableListOf<Zoo>()
        zooRepository.findAll().toCollection(outZoos)
        return outZoos
    }

}
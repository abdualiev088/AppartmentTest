package com.example.nestedrecyclerview.DataFactory

import com.example.nestedrecyclerview.Models.ChildModel
import com.example.nestedrecyclerview.Models.ParentModel
import java.util.Random

object ParentDataFactory {
    private val random = Random()

    private val titles =  arrayListOf( "Now Playing", "Classic", "Comedy", "Thriller", "Action", "Horror", "TV Series")

    private fun randomTitle() : String{
        val index = random.nextInt(titles.size)
        return titles[index]
    }

    private fun randomChildren() : List<ChildModel>{
        return ChildDataFactory.getChildren(20)
    }

    fun getParents(count : Int) : List<ParentModel>{
        val parents = mutableListOf<ParentModel>()
        repeat(count){
            val parent = ParentModel(randomTitle(), randomChildren())
            parents.add(parent)
        }
        return parents
    }
}

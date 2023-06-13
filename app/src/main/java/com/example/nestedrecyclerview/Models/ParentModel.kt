package com.example.nestedrecyclerview.Models

data class ParentModel(
    val  title: String = "",
    val children: List<ChildModel>
)
package com.example.myapplication.data.model

import com.example.myapplication.R

public class Habit(
    var id :Int,
    var name:String,
    var goalType:String,
    var goal:Int,
    var process:Int,
    var poster:Int
) {
    constructor() : this(1,"Reading","hrs",2,0, R.drawable.home_icon)
    constructor(id:Int,name:String,goalType:String,goal:Int,poster:Int) : this(id,name,goalType,2, process = 0,poster=R.drawable.home_icon)

}
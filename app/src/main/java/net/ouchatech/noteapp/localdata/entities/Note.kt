package net.ouchatech.noteapp.localdata.entities

import java.util.*

data class Note (
    var id : Long,
    var date: Date,
    var title:String,
    var bodyText : String,
    var bgColor : Int,
    var image : String?

)
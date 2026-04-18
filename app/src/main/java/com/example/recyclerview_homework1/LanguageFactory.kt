package com.example.recyclerview_homework1

object LanguageFactory
{
    fun loadlanguage() : ArrayList<itemcls>{
        var languages = ArrayList<itemcls>()

        languages.add(itemcls(R.drawable.csap,"C#"))
        languages.add(itemcls(R.drawable.csap,"C#"))
        languages.add(itemcls(R.drawable.csap,"C#"))
        languages.add(itemcls(R.drawable.csap,"C#"))
        languages.add(itemcls(R.drawable.csap,"C#"))
        languages.add(itemcls(R.drawable.csap,"C#"))
        languages.add(itemcls(R.drawable.csap,"C#"))

        return languages
    }
}
package com.nums.numtext

class NumText {

    fun getNumInText(value: Int): String =
        when(value){
            0 -> "Zero"
            1 -> "One"
            2 -> "Two"
            3 -> "Three"
            4 -> "Four"
            5 -> "Five"
            6 -> "Six"
            7 -> "Seven"
            8 -> "Eight"
            9 -> "Nine"
            else -> getNumInText(value / 10) + " ${getNumInText(value % 10)}"
        }

}
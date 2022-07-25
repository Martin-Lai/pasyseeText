package com.example.playseetest

data class AllData(
    val p: List<P>
)

data class P(
    val at: Long,
    val att: Att,
    val count: List<Int>,
    val desc: String,
    val id: String,
    val is_favorite: Boolean,
    val is_prv: String,
    val p_stk: List<List<Any>>,
    val plc: List<String>,
    val `private`: List<Any>,
    val reply: List<List<Any>>,
    val source: List<Any>
)

data class Att(
    val id: String,
    val l: Int,
    val p_ids: String,
    val type: String
)
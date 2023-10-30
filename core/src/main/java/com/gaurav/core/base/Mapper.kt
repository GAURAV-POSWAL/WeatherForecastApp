package com.gaurav.core.base

interface Mapper<in Src, out Des> {
    fun map(srcObject: Src): Des
}
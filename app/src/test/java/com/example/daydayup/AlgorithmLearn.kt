package com.example.daydayup

import android.util.Log
import org.junit.Test
import java.lang.Exception
import java.util.*

/**
 * Author: fushuang
 * Date: 2020/12/20 6:28 PM
 * Description:
 * Wiki:
 * History:
 * <author> <time> <version> <desc>
 */
class AlgorithmLearn {

    @Test
    fun main(): Unit {
//        intRevert(1234567)
        convert("LEETCODEISHIRING", 3)

        try {
            stackOver()
        } catch (ex: Exception) {
            println("Exception main: ")
        } catch (e: StackOverflowError) {
            println("StackOverflowError main: ")
        }
    }

    @Test
    fun runNode(): Unit {
        var node = createNodeLinkList()
        printLinkNode(node)

    }

}

private fun intRevert(num: Int) {
    var result = 0
    var input = num

    while (input > 0) {
        var temp = input % 10
        input /= 10
        result = result * 10 + temp
    }
    println(result)
}

private fun stackOver() {
    stackOver()
}

private fun zOutPutString(rawCount: Int, string: String) {

//        var rawCountTemp = rawCount
//        var needColumnCount = 0
//        while (rawCountTemp > 0) {
//            needColumnCount++
//            rawCountTemp -= rawCount
//            if (rawCountTemp) {
//
//            }
//        }
}

fun convert(s: String, numRows: Int): String? {
    if (numRows == 1) return s
    val rows: MutableList<StringBuilder> =
        ArrayList()
    for (i in 0 until Math.min(numRows, s.length)) rows.add(StringBuilder())
    var curRow = 0
    var goingDown = false
    for (c in s.toCharArray()) {
        rows[curRow].append(c)
        if (curRow == 0 || curRow == numRows - 1) goingDown = !goingDown
        curRow += if (goingDown) 1 else -1
    }
    val ret = StringBuilder()
    for (row in rows) ret.append(row)
    return ret.toString()
}


class Node {
    var next: Node? = null
    var value = 0

    constructor(next: Node?, value: Int) {
        this.next = next
        this.value = value
    }
}


fun createNodeLinkList(): Node {

    var node = Node(null, 0)
    var current: Node? = node
    for (i in 1..10) {
        current?.next = Node(null, i)
        current = current?.next
    }
    return node
}

fun printLinkNode(next: Node?) {
    var res = "link node : "
    var current = next
    while (current != null) {
        res += " ${current.value} "
        current = current.next
    }

    println(res)
}





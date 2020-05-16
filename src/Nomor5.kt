fun main() {
    //failed
    var intArray = arrayListOf<Int>(5,13,7,5,9,20,9,5,14)
    cariPasangan(intArray)?.forEach { print(it) }
}

fun cariPasangan(intsArray: ArrayList<Int>):MutableList<Pair<Int,Int>>? {


    var newIntArray = arrayListOf<Int>(intsArray.removeAt(1))

    var pairList = mutableListOf<Pair<Int,Int>>()
    for (i in 0..intsArray.size-1) {
        for (j in 0..newIntArray.size-1) {
            if (intsArray[i] == newIntArray[j]) {
                pairList.add(Pair(intsArray[i], newIntArray[j]))
            }
        }
    }
    return pairList
}


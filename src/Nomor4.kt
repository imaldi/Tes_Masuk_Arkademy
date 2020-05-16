fun main(args: Array<String>) {
    checkDuplicate("Aldi!!")
}

fun checkDuplicate(strings: String) {
    var strings = strings.replace("\\s".toRegex(), "").toLowerCase()
    var isThereDuplicateChar = false
    val map = HashMap<Char,Int>()
    for (i in strings.toCharArray()) {
        if (map.keys.contains(i)) {
            var x = map[i]
            map[i] = 1+x!!
        } else {
            map[i] = 1
        }

    }

    for (c in map.keys) {
        if (map[c]!! > 1) {
            println(c + " : " + map[c])
            isThereDuplicateChar = true
        }
    }

    if (!isThereDuplicateChar){
        println("Tidak ada karakter yang berulang!")
    }
}


fun main() {
    cekKata("apakah ini kalimat saja tanpa tanda baca? ...")
}

fun cekKata(words:String){
    val wordsAfterSplit = words.split(" ")
    val totalRealWords = wordsAfterSplit.filter{it.contains("^[a-zA-Z]*$".toRegex())}.size
    println(totalRealWords.toString()+"/"+wordsAfterSplit.size.toString())
}




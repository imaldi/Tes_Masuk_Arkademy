fun triangle(row : Int){
    if(row > 0){
        for(i in 0..row-1){
            for(j in 0..i) {
                print("#")
            }
            println()
        }
    }
}

fun main() {
    triangle(5)
}
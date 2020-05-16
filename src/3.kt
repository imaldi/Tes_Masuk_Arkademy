fun main() {
    hollowTriangle(7)
}

fun hollowTriangle(row : Int){
    if (row%2!=0 && row > 0){
        for (i in 0..row-1){
            for (j in 0..row-1){
                if(i == 0 || i == j){
                    print("\to")
                } else if(j < i){
                    print("\t ")
                } else if (j>i){
                    print("\tx")
                }
            }

            for (j in row-2 downTo  0){
                if(i == 0 || i == j){
                    print("\to")
                } else if(j < i){
                    print("\t ")
                } else if (j>i){
                    print("\tx")
                }
            }
            println()
        }
    } else
        println("Input harus angka ganjil!!")
}


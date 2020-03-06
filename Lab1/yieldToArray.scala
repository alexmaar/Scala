//val xsa = for (i <- (1 to 3).toArray) yield(i)

var i =1
val xsa = new Array[Int](3)
while (i<=3){
    xsa(i-1)=i
    i+=1
}
xsa

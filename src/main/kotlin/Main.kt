import java.util.Scanner
fun main(args: Array<String>) {
     println("Enter size")
        val scn=Scanner(System.`in`)
        val size=scn.nextInt()
        scn.nextLine()
        val myList= mutableListOf<String>()
        for(item in 0 until size){
            print("Enter list element: ")
            myList.add(scn.nextLine())
        }
        //println(myList)
        val filtered=myList.filter {
            it.contains("B",true)||it.contains("M",true)
        }
        var cnt=filtered.size
        print("[")
        while(cnt>0){
            print(filtered[filtered.size-cnt].uppercase())
            if(cnt!=1)print(", ")
            cnt--
        }
        print("]")
}
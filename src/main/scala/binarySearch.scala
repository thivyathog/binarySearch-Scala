object Demo {
  def main(args: Array[String]) {
    var list:Array[Int]= Array( 2, 3, 4, 10, 40 )

   var  x = 10
    var result = binarySearch(list, x)
    if (result == -1)
      System.out.println("Element not present")
    else
      System.out.println("Element found at index " + result)
  }


  def binarySearch(arr:Array[Int],x:Int):Int={
    var l:Int = 0
    var r = arr.length - 1

    while (l <= r) {
      var m = l + (r - l) / 2

      // Check if x is present at mid
      if (arr(m) == x)
        return m

      // If x greater, ignore left half
      if (arr(m) < x)
        l = m + 1

      // If x is smaller, ignore right half
      else
        r = m - 1
    }

    // if we reach here, then element was
    // not present
    return -1
  }


}
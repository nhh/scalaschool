// Long version
def maxLong(x : Int, y : Int) : Int = {
  if (x > y) x
  else y
}

// Short version
def maxShort(x : Int, y : Int): Int = if (x > y) x else y

def greet() : Unit = println("Hello world")

args.foreach(arg => println(arg))

args.foreach(println)

val strings = new Array[String](10)
strings.update(3, "Woooooooo")
println(strings(3))




maxLong(1,2)
maxShort(1,2)
greet()
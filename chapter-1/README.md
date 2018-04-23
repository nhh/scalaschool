## Chapter 1
# Scala interpreter


Type: `scala`

``` scala
Welcome to Scala 2.12.5 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_131).
Type in expressions for evaluation. Or try :help.

scala> 
```

### Some examples

```
scala> 1 + 2
res0: Int = 3
```

```
scala> val hello = "Hello World"
hello: String = Hello World
```

```
scala> println("Whats up, yo")
Whats up, yo
```

```
scala> val list = List("Hello","World")
list: List[String] = List(Hello, World)

scala> list.head
res7: String = Hello

scala> list.tail
res8: List[String] = List(World)

scala> list.count(word => word.length > 1)
res9: Int = 2

scala> list.map(word => word.toUpperCase())
res12: List[String] = List(HELLO, WORLD)

scala> list(1)
res15: String = World

```
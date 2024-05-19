### Why are strings immutable in java?

```
Immutable objects are objects which once declared elements can’t be modified after it.

A String in Java that is specified as immutable, as the content shared storage in a single pool to minimize creating a copy of the same value.

These are some more reasons for making String immutable in Java. These are:

* The String pool cannot be possible if String is not immutable in Java. A lot of heap space is saved by JRE. The same string variable can be referred to by more than one string variable in the pool. String interning can also not be possible if the String would not be immutable.
* If we don’t make the String immutable, it will pose a serious security threat to the application. For example, database usernames, and passwords are passed as strings to receive database connections. The socket programming host and port descriptions are also passed as strings. The String is immutable, so its value cannot be changed. If the String doesn’t remain immutable, any hacker can cause a security issue in the application by changing the reference value.
* The String is safe for multithreading because of its immutableness. Different threads can access a single “String instance”. It removes the synchronization for thread safety because we make strings thread-safe implicitly.
* Immutability gives the security of loading the correct class by Classloader. For example, suppose we have an instance where we try to load java.sql.Connection class but the changes in the referenced value to the myhacked.The connection class does unwanted things to our database.
```


---

### How intern() works?

```
The intern() method creates an exact copy of a string located in the heap memory and stores it in the string constant pool.
Usage: HowInternWorks.class
```

---

### How many objects are created in Strings using string literals and new operator?

```
String s = "TEST" - 1 Object
String s = new String("TEST") - 2 Objects
```

---

### How string constant pool works?

```
A Java String Pool is a place in heap memory where all the strings defined in the program are stored. A separate place in a stack is there where the variable storing the string is stored. Whenever we create a new string object, JVM checks for the presence of the object in the String pool, If String is available in the pool, the same object reference is shared with the variable, else a new object is created.
```


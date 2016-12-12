# poc_jnr_go
An example of calling a GO function in JAVA

Golang(1.5+) code can be build into a C shared library.
Then Java code can call the native library via JNI/JNR.
JNI is the standard and heavy.
JNR is light-weight and high-performance, while it's not in JSR yet. 

# Build and Run
```
$ go build -buildmode=c-shared -o libmath.so math.go
$ mvn package
$ LD_LIBRARY_PATH=. java -jar target/math-1.0-jar-with-dependencies.jar 
```

# Reference
 - www.oracle.com/technetwork/java/jvmls2013nutter-2013526.pdf
 - https://blog.dogan.io/2015/08/15/java-jni-jnr-go/

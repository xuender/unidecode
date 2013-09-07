# Unidecode #

ASCII transliterations of Unicode string for Java.

## How to Use ##

Edit pom.xml.

```xml
<dependency>
	<groupId>me.xuender</groupId>
	<artifactId>unidecode</artifactId>
	<version>0.0.5</version>
</dependency>
```

### decode
```java
System.out.print(Unidecode.decode("南无阿弥陀佛"));
Nan Wu A Mi Tuo Fo

System.out.print(Unidecode.decode("あみだにょらい"));
amidaniyorai
```
### initials
```java
System.out.print(Unidecode.initials("南无阿弥陀佛"));
NWAMTF

System.out.print(Unidecode.initials("Κνωσός"));
K
```
## Links ##

* [![Build Status](https://travis-ci.org/xuender/unidecode.png)](https://travis-ci.org/xuender/unidecode)

## Reference ##

[Unidecode for Python](https://pypi.python.org/pypi/Unidecode)

# Unidecode #

ASCII transliterations of Unicode text for Java.

## Reference ##

[Unidecode for Python](https://pypi.python.org/pypi/Unidecode)

## How to Use ##

Edit pom.xml.

```xml
<dependency>
	<groupId>me.xuender</groupId>
	<artifactId>unidecode</artifactId>
	<version>0.0.3</version>
</dependency>
```

    System.out.print(Unidecode.decode("北京"));
    Bei Jing

    System.out.print(Unidecode.decode("Κνωσός"));
    Knosos

## Links ##

* [![Build Status](https://travis-ci.org/xuender/unidecode.png)](https://travis-ci.org/xuender/unidecode)

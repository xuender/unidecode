# Unidecode #

ASCII transliterations of Unicode text for Java.

## Links ##

* image:https://travis-ci.org/xuender/unidecode.png["Build Status", link="https://travis-ci.org/xuender/unidecode"]

## Reference ##

[Unidecode for Python](https://pypi.python.org/pypi/Unidecode)

## How to Use ##

Edit pom.xml.

```xml
<dependency>
	<groupId>me.xuender</groupId>
	<artifactId>unidecode</artifactId>
	<version>0.0.1</version>
</dependency>
```

    System.out.print(Unidecode.decode("北京"));
    Bei Jing

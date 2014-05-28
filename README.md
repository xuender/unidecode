# Unidecode #
[![Build Status](https://travis-ci.org/xuender/unidecode.png)](https://travis-ci.org/xuender/unidecode)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/me.xuender/unidecode/badge.svg)](https://maven-badges.herokuapp.com/maven-central/me.xuender/unidecode)


ASCII transliterations of Unicode string for Java.

## How to Use ##

Edit pom.xml.

```xml
<dependency>
	<groupId>me.xuender</groupId>
	<artifactId>unidecode</artifactId>
	<version>0.0.7</version>
</dependency>
```

### decode
```java
System.out.print(Unidecode.decode("南无阿弥陀佛"));
Nan Wu A Mi Tuo Fo

System.out.print(Unidecode.decode("一条会走路的鱼"));
Yi Tiao Hui Zou Lu De Yu

System.out.print(Unidecode.decode("あみだにょらい"));
amidaniyorai
```
### initials
```java
System.out.print(Unidecode.initials("南无阿弥陀佛"));
NWAMTF

System.out.println(Unidecode.initials("不怨人就是成佛的大道根"));
BYRJSCFDDDG

System.out.print(Unidecode.initials("Κνωσός"));
K
```

## Reference ##

[Unidecode for Python](https://pypi.python.org/pypi/Unidecode)

## Thanks ##
* 魏敬宁([cratylus](https://github.com/cratylus))
* Marco Schweighauser([Schweigi](https://github.com/Schweigi))
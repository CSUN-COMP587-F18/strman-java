A Java 8 library for working with String. You can refer to Javadocs online [http://shekhargulati.github.io/strman-java/](http://shekhargulati.github.io/strman-java/).

Getting Started
--------

To use strman in your application, you have to add `strman` in your classpath. strman is available on [Maven Central](http://search.maven.org/) so you just need to add dependency to your favorite build tool as show below.

For Apache Maven users, please add following to your pom.xml.

```xml
<dependencies>
    <dependency>
        <groupId>com.shekhargulati</groupId>
        <artifactId>strman</artifactId>
        <version>0.4.0</version>
    </dependency>
</dependencies>
```

Gradle users can add following to their build.gradle file.

```
compile(group: 'com.shekhargulati', name: 'strman', version: '0.4.0')
```

To learn what we added in the latest version please refer to `./changelog.md`.

## Available Functions

These are the available functions in current version of library:

## append

Appends Strings to value

```java
import static strman.Strman.append
append("f", "o", "o", "b", "a", "r")
// result => "foobar"
```

## appendArray

Append an array of String to value

```java
import static strman.Strman.appendArray
appendArray("f", new String[]{"o", "o", "b", "a", "r"}
// result => "foobar"
```

## at

Get the character at index. This method will take care of negative indexes.

```java
import static strman.Strman.at
at("foobar", 0)
// result => Optional("f")
```

## between

Returns an array with strings between start and end.

```java
import static strman.Strman.between
between("[abc][def]", "[", "]")
// result => ["abc","def"]
```

## chars

Returns a String array consisting of the characters in the String.

```java
import static strman.Strman.chars
chars("title")
// result => ["t", "i", "t", "l", "e"]
```

## charsCount

Counts the number of occurrences of each character in the string

```java
import static strman.Strman.charsCount
charsCount("abca")
// result => Map(("a",2),("b",1),("c",1))
```

## collapseWhitespace

Replace consecutive whitespace characters with a single space.

```java
import static strman.Strman.collapseWhitespace
collapseWhitespace("foo    bar")
// result => "foo bar"
```

## contains

Verifies that the needle is contained in the value.

```java
import static strman.Strman.contains
contains("foo bar","foo")
// result => true

contains("foo bar","FOO", false) // turning off case sensitivity
// result => true
```

## containsAll

Verifies that all needles are contained in value

```java
import static strman.Strman.containsAll
containsAll("foo bar", new String[]{"foo", "bar"})
// result => true

containsAll("foo bar", new String[]{"FOO", "bar"},false)
// result => true
```

## containsAny

Verifies that one or more of needles are contained in value.

```java
import static strman.Strman.containsAny
containsAny("bar foo", new String[]{"FOO", "BAR", "Test"}, true)
// result => true
```

## countSubstr

Count the number of times substr appears in value

```java
import static strman.Strman.countSubstr
countSubstr("aaaAAAaaa", "aaa")
// result => 2
countSubstr("aaaAAAaaa", "aaa", false, false)
// result => 3
```

## endsWith

Test if value ends with search.

```java
import static strman.Strman.endsWith
endsWith("foo bar", "bar")
// result => true
endsWith("foo Bar", "BAR", false)
// result => true
```

## ensureLeft

Ensures that the value begins with prefix. If it doesn't exist, it's prepended.

```java
import static strman.Strman.ensureLeft
ensureLeft("foobar", "foo")
// result => "foobar"
ensureLeft("bar", "foo")
// result => "foobar"
ensureLeft("foobar", "FOO", false)
// result => "foobar"
```

## base64Decode

Decodes data encoded with MIME base64

```java
import static strman.Strman.base64Decode
base64Decode("c3RybWFu")
// result => "strman"
```

## base64Encode

Encodes data with MIME base64.

```java
import static strman.Strman.base64Encode
base64Encode("strman")
// result => "c3RybWFu"
```

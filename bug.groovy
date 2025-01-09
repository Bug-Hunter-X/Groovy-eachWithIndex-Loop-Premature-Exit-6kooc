```groovy
def myMethod(List<String> list) {
    list.eachWithIndex { element, index ->
        if (element == "someValue") {
            return // This will prematurely exit the eachWithIndex loop
        }
        println "Element: $element, Index: $index"
    }
}

myMethod(["someValue", "anotherValue", "yetAnotherValue"])
```
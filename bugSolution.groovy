```groovy
def myMethod(List<String> list) {
    list.eachWithIndex { element, index ->
        if (element == "someValue") {
            return // This will skip the current iteration of the loop
        }
        println "Element: $element, Index: $index"
    }
}

myMethod(["someValue", "anotherValue", "yetAnotherValue"])
```
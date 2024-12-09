```groovy
def myMethod(String input) {
  if (input == null) {
    return "Null input"
  } else if (input.isEmpty()) {
    return "Empty input"
  } else {
    return input.toUpperCase()
  }
}

println myMethod(null) // Output: Null input
println myMethod("") // Output: Empty input
println myMethod("hello") // Output: HELLO

//The solution uses the isEmpty() method which explicitly checks for empty strings and does not suffer from Groovy's loose typing issue
```
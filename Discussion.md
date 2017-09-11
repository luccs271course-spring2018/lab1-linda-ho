# Lab 1: Fizz Buzz Discussion

### What would be a really simple solution if n were not an argument, i.e., if it were always 17?

A simple solution would be to create a for loop that iterates from 1 to 17. Conditional statements inside the for loop determine what to print based on whether or not the number is divisible by 3, 5, both, or none.

```
	for(int i = 1; i <= 17; i++) {
		if (i % 3 == 0 && i % 5 == 0) {
			System.out.println("Fizz Buzz");
		} else if (i % 3 == 0) {
			System.out.println("Fizz");
		} else if (i % 5 == 0) {
			System.out.println("Buzz");
		} else {
			System.out.println(i);
		}
	}
```


### How could you have automatically tested your initial solution from part 2?

We could create a test that would check to make sure the FizzBuzz.printResult() method does not return null and assertEquals matches the expected printed result of Fizz, Buzz, Fizz Buzz, or the number.

Example Code

```
public class TestHelloWorld {
  @Test
  public void getMessage() {
    assertNotNull(FizzBuzz.printResult('3'));
    assertEquals("1\n2\nFizz", FizzBuzz.printResult('3'));
  }
}
```

### What changes between parts 2, 3, and 4, and what stays the same? Does it matter what list implementation you choose? If so, in what way(s)?

The for loop stays the same in all three parts because we want to start at 1 and then increment up by 1 until we reach the input number. In part 2 we printed each result to the screen. In part 3, we returned a String array. To do this, we needed to allocate memory for 'n' number of elements based on user input. As we iterated through the loop, we initalize each element in the array with the result. In part 4, we returned a List of strings. We pushed each result into the list. A List is preferable because they can grow and shrink in size, allowing the program to be more flexible.
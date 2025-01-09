# Groovy eachWithIndex Loop Premature Exit

This example demonstrates a common error in Groovy when using the `eachWithIndex` method.  Incorrectly using `return` inside the closure causes the entire method to exit, rather than just skipping the current iteration.

The `bug.groovy` file contains the erroneous code. The `bugSolution.groovy` file provides the corrected version.

## How to reproduce:
1. Save the `bug.groovy` code.
2. Run the script using a Groovy interpreter (e.g., `groovy bug.groovy`).
3. Observe that only the first element is printed, even though the condition is met in the first iteration.

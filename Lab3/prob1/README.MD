Comparison Leading to false:
In the main method of PersonWithJob, the line System.out.println("p1.equals(p2)? " + p1.equals(p2)); compares a PersonWithJob instance (p1) with a Person instance (p2).
The equals method in PersonWithJob checks if the object being compared is an instance of PersonWithJob. Since p2 is an instance of Person, this check fails, and the method returns false.


Comparison Leading to true:
The line System.out.println("p2.equals(p1)? " + p2.equals(p1)); compares p2 (a Person) with p1 (a PersonWithJob).
The equals method in Person checks if the object is an instance of Person. This check passes, and then it compares the names. Since both p1 and p2 have the name "Joe", this comparison returns true.


Solution: Replacing Inheritance with Composition
To replace inheritance with composition, we can modify the PersonWithJob class to contain an instance of Person instead of extending it. 
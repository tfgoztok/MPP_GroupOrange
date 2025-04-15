equals method in Employee class is not expecting Object as parameter, it takes Employee. 
Because of that, it doesn't override the equals method. So, in the main class, line 28 checks for reference equality which results
false.
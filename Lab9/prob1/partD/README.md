The problem is visited parameter being stored in Employee class itself and being used at equals, hashCode functions. 
We can simply change both methods to not calculate with visited parameter.
2 ways to do the Arrays to create arrays in class
// creating an array of objects
CEO [] list = new CEO [10];
// Two different ways of inserting an object into an array

//NR1
CEO c1 = new CEO ("Helvijs", 213123, 131, "BMW");
// list [0] will point to the object that c1 is pointing to
list[0] = c1;
//NR2
list[1] = new CEO("Andres", 21311, 131, "Audi");
//c3 will point to the object that c1 and list[0] are pointing to
CEO c3 = list [0];
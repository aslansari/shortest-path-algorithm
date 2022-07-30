# data-structure-skeleton-for-nominees
An example project to provide an insight about Singly Linked List Node. 

## Location
Created a Location class to represent a point in the coordiante system.  
This class has a method to calculate distance between another given location.

## Main Routine
Created Factory and other 8 customers as a location instances. Then added each node as distance between factory and a customer, resulting 8 nodes.  

After defining all nodes, called `printNodes()`, `length()`, `sumOfNodes()` methods and printed the results. Then created a loop to move through the nodes and deleting them with `deleteNode` method.  
Lastly printed the last node to prove that it is null and all of the nodes are deleted.

## Output
```text
 --> 5 --> 5 --> 7 --> 7 --> 5 --> 8 --> 7 --> 11 --> .
length of nodes 8
sum of all nodes 55
deleting 5
deleting 5
deleting 7
deleting 7
deleting 5
deleting 8
deleting 7
deleting 11
Node: null

Process finished with exit code 0
```

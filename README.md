# Sort Manager

This is a simple program which uses Generic sorting, Includes Bubble Sort, Quick Sort and Binary Tree Sort algorithms all of them using Generic implementation.



[Folder Structure](#folder-structure:)

[Interface](#Interface)

[Implementation of Bubble Sort](#Implementation-of-Bubble-Sort)

[Implementation of Quick Sort](#Implementation-of-Quick-Sort)





This project follows the MVC model to organise the structure.



##### Folder Structure:

![img](https://gyazo.com/d8ecfe58595145234cc3cb6efe591ba0.png)



Appropriate classes as been placed into appropriate location. 



The program starts off from the SortManager.java file it contains the main method to start the program.



##### Interface 

First step was to setup and interface that can be user later on to implement other sorting algorithm. So first we create a simple GenericSorter interface. 

```java
package com.spartaglobal.sort.controller;

import java.util.List;

public interface GenericSorter {
    <T extends Comparable> T[] sortArray(T[] array);
    <T extends Comparable> List<T> sortList(List<T> arrayList);
}
```

Here `T` is used, that can represent datatypes, such as Interger, Double, Character, or Strings, expect from the primitive types, as they have cannot be used, as Object is the superclass of all the objects, and primitive datatype does not inherit from Object class.s



##### Implementation of Bubble Sort

Bubble sort is a simple sorting algorithm, that steps through the list repeatedly, comparing the next element in the list, and making a swap if the element is small than the current element. The highest element in the list "bubbles" up the list.

Bubble sort Pseudocode can be found [here](https://www.tutorialspoint.com/data_structures_algorithms/bubble_sort_algorithm.htm).

First we implemented the bubble sort using the primitive type, and then changed the variables to hold generic type.

GenericBubbleSort.java

```
package com.spartaglobal.sort.model;
import com.spartaglobal.sort.controller.GenericSorter;
import java.util.List;

public class GenericBubbleSort implements GenericSorter {
    @Override
    public <T extends Comparable> T[] sortArray(T[] array) {
        if (array == null || array.length == 0){
            return null;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    @Override
    public <T extends Comparable> List<T> sortList(List<T> arrayList) {
        if (arrayList == null || arrayList.isEmpty()){
            return null;
        }
        boolean inOrder = false;
        while (!inOrder) {
            inOrder=true;
            for (int i =1; i < arrayList.size(); i++){
                if (arrayList.get(i-1).compareTo(arrayList.get(i)) > 0){
                    inOrder = false;
                    T temp = arrayList.get(i);
                    arrayList.set(i, arrayList.get(i-1));
                    arrayList.set(i-1, temp);
                }
            }
        }
        return arrayList;
}
}
```

Here we have two methods, where one method `sortArray` takes in array of object to be compared to each other and get it sorted using the bubble sort method. Second method `sortList` takes in the array list of object that can again be used to compare with each other to be sorted.



##### Implementation of Quick Sort 

Quick sort  is a Divide and Conquer algorithm. it picks an element in the array/list as a pivot and then partition the given array around the picked pivot. 

Pseudocode of QuickSort can be found here [here](https://www.geeksforgeeks.org/quick-sort/).

```java
package com.spartaglobal.sort.model;
import com.spartaglobal.sort.controller.GenericSorter;
import java.util.List;

public class GenericQuickSort implements GenericSorter {
    @Override
    public <T extends Comparable> List<T> sortList(List<T> arrayList) {
        if (arrayList == null || arrayList.isEmpty()){
            return null;
        }
        quickSort(arrayList, 0, arrayList.size()-1);
        return arrayList;
    }


    private <T extends Comparable<? super T>> List<T> quickSort(List<T> arrayList, int lowIdx, int highIdx){
        if (lowIdx < highIdx){
            int p = partition(arrayList, lowIdx, highIdx);
            quickSort(arrayList, lowIdx, p-1);
            quickSort(arrayList, p+1, highIdx);
        }
        return arrayList;
    }


    private <T extends Comparable<? super T>> int partition(List<T> arrayList, int lowIdx, int highIdx){
        T pivot = arrayList.get(highIdx);
        int i = (lowIdx-1);
        for (int j = lowIdx; j <= arrayList.size()-1; j++){
            if (arrayList.get(j).compareTo(pivot) < 0){
                i++;
                //swap
                T temp = arrayList.get(j);
                arrayList.set(j, arrayList.get(i));
                arrayList.set(i, temp);
            }
        }
        T temp = arrayList.get(i+1);
        arrayList.set(i+1, arrayList.get(highIdx));
        arrayList.set(highIdx, temp);
        return i+1;
    }
```

I have taken only the section of algorithm that uses the array list as parameter. We call the `sortList` method, which does checking, of the list, then passes the list to `quickSort` method with paraments of lowest index of list (0) and the highest index (`list.size()-1`). Then the method `partition` takes the last element as a pivot and then moves all the element that are lower than pivot to the left and the higher then pivot to right, and the `quickSort` is called on both side, this is done recursively until the array is sorted.  Time complexity of this algorithm is O(n^2).



#### Unit Test

Unit test are important in programming, it allows us to quickly and effective test all our code, it is used to detect bugs and find error more quickly. 



##### Bubble Sort Test

```java
    @DisplayName("Empty ArrayList ")
    @Test
    public void emptyNullArrayList(){
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> actualResult = qs.sortList(arrayList);
        assertNotNull(actualResult);
    }
```

 This method test if the list is empty, we create an empty array list and then pass it to the sortList method in the Bubblesort class, by using the Assert method of notNull we can check if out result are what we expect, in out case we expect to see that empty array list is return.




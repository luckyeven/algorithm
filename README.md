Algorithm
=========
In this repository you will find the most baic alogrithm function or method implemented using JAVA.
****

|Author|ssong094@uottawa.ca|
|---|---
|WeChat|tz142857

## FileStructure
----------------
* [BinarySearch.java](#binarySearchjava)
* [selectionSort.java](#selectionSortjava)
* [recursionSUm.java](#recursionSumjava)


### Features
------------
#### binarySearch.java  

|Class|Summary|
|:-----|:---- 
|BinarySearch(*int[] list*)|create an BinarySearch object|
|Method|
|search(int *key*)|return the index of the *key* in the given list. return -1 if key not int the list.|  
|contains(int *key*)|return true if *key* in the list|
---------------------------------------------
#### selectionSort.java
|Class|Summary|
|:-----|:-----
|selectionSort(array)|selection sort algorithm|
|Method|
|sort()|sort the array|
|findSmallest()|Find the smallest value in the given array|
|pop(int[] *array*,int *indexOfelement*)|pop up element with *indexOfelement* in the *array*|
|getArray()|return array|
-------------------------------

### recursionSum.java
|Class|Summary|
|:----|:----
|recursionSum(int[] *array*)|takes an *array* ,return its sum|
|Method|
|sum(int[] *list*, int *head*)|base case: *list[head]* ; recursive case: *list[head]* + sum(*list*,*head*+1)|
------------

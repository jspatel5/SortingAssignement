package test.java;

import static org.junit.Assert.*;
import main.java.Item;
import main.java.SortAlgos;

import org.junit.Test;

public class AlgoTest {

	// This test case covers node ,edge and conditions
	@Test
	public void findBubbleSortCoverageScenario1() throws Exception {

		Item[] givenArray = new Item[5];
		Item[] sortedArray = new Item[5];

		givenArray[0] = new Item(900);
		givenArray[1] = new Item(700);
		givenArray[2] = new Item(300);
		givenArray[3] = new Item(200);
		givenArray[4] = new Item(100);
		sortedArray[0] = new Item(100);
		sortedArray[1] = new Item(200);
		sortedArray[2] = new Item(300);
		sortedArray[3] = new Item(700);
		sortedArray[4] = new Item(900);

		SortAlgos.bubbleSort(givenArray);
		for(int i=0;i<givenArray.length;i++){
			assertEquals(sortedArray[i].key,givenArray[i].key);
		}

	}

	// This test case covers node ,edge 
	@Test
	public void findBubbleSortCoverageScenario2() throws Exception {
		Item[] givenArray = new Item[5];
		Item[] sortedArray = new Item[5];

		givenArray[0] = new Item(1);
		givenArray[1] = new Item(2);
		givenArray[2] = new Item(3);
		givenArray[3] = new Item(4);
		givenArray[4] = new Item(5);
		sortedArray[0] = new Item(1);
		sortedArray[1] = new Item(2);
		sortedArray[2] = new Item(3);
		sortedArray[3] = new Item(4);
		sortedArray[4] = new Item(5);

		SortAlgos.bubbleSort(givenArray);
		for(int i=0;i<givenArray.length;i++){
			assertEquals(sortedArray[i].key,givenArray[i].key);
		}

	}

	
	@Test
	public void verifySelectionSort() throws Exception {
		Item[] givenArray = new Item[5];
		Item[] sortedArray = new Item[5];

		givenArray[0] = new Item(900);
		givenArray[1] = new Item(700);
		givenArray[2] = new Item(300);
		givenArray[3] = new Item(200);
		givenArray[4] = new Item(100);
		sortedArray[0] = new Item(100);
		sortedArray[1] = new Item(200);
		sortedArray[2] = new Item(300);
		sortedArray[3] = new Item(700);
		sortedArray[4] = new Item(900);

		SortAlgos.selectionSort(givenArray);
		for(int i=0;i<givenArray.length;i++){
			assertEquals(sortedArray[i].key,givenArray[i].key);
		}
	}
	@Test
	public void verifyInsertionSort() throws Exception {
		Item[] givenArray = new Item[5];
		Item[] sortedArray = new Item[5];

		givenArray[0] = new Item(10);
		givenArray[1] = new Item(9);
		givenArray[2] = new Item(7);
		givenArray[3] = new Item(6);
		givenArray[4] = new Item(2);
		sortedArray[0] = new Item(2);
		sortedArray[1] = new Item(6);
		sortedArray[2] = new Item(7);
		sortedArray[3] = new Item(9);
		sortedArray[4] = new Item(10);

		SortAlgos.insertionSort(givenArray);
		for(int i=0;i<givenArray.length;i++){
			assertEquals(sortedArray[i].key,givenArray[i].key);
		}



	}


	@Test
	public void verifyMergeSort() throws Exception {
		Item[] givenArray = new Item[5];
		Item[] sortedArray = new Item[5];

		givenArray[0] = new Item(10);
		givenArray[1] = new Item(9);
		givenArray[2] = new Item(7);
		givenArray[3] = new Item(6);
		givenArray[4] = new Item(122);

		sortedArray[0] = new Item(6);
		sortedArray[1] = new Item(7);
		sortedArray[2] = new Item(9);
		sortedArray[3] = new Item(10);
		sortedArray[4] = new Item(122);

		SortAlgos.mergeSort(givenArray);
		for(int i=0;i<givenArray.length;i++){
			assertEquals(sortedArray[i].key,givenArray[i].key);
		}

	}
	
	@Test
	public void verifyQuickSort() throws Exception {
		Item[] givenArray = new Item[5];
		Item[] sortedArray = new Item[5];

		givenArray[0] = new Item(10);
		givenArray[1] = new Item(9);
		givenArray[2] = new Item(7);
		givenArray[3] = new Item(6);
		givenArray[4] = new Item(122);

		sortedArray[0] = new Item(6);
		sortedArray[1] = new Item(7);
		sortedArray[2] = new Item(9);
		sortedArray[3] = new Item(10);
		sortedArray[4] = new Item(122);

		SortAlgos.quickSort(givenArray);
		for(int i=0;i<givenArray.length;i++){
			assertEquals(sortedArray[i].key,givenArray[i].key);
		}

	}

	@Test
	public void verifyHeapSort() throws Exception {
		Item[] givenArray = new Item[5];
		Item[] sortedArray = new Item[5];

		givenArray[0] = new Item(10);
		givenArray[1] = new Item(9);
		givenArray[2] = new Item(7);
		givenArray[3] = new Item(60);
		givenArray[4] = new Item(122);

		sortedArray[0] = new Item(7);
		sortedArray[1] = new Item(9);
		sortedArray[2] = new Item(10);
		sortedArray[3] = new Item(60);
		sortedArray[4] = new Item(122);

		SortAlgos.heapSort(givenArray);
		for(int i=0;i<givenArray.length;i++){
			assertEquals(sortedArray[i].key,givenArray[i].key);
		}

	}



}

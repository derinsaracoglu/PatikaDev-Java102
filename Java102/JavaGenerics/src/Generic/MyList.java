package Generic;

import java.util.Arrays;

public class MyList<T> {

	private int capacity = 10;
	private T[] array;
	private T[] tempArray;

	public MyList() {

		this.array = (T[]) new Object[capacity];

	}

	// MyList(int capacity) : Dizinin baþlangýç deðeri capacity parametresinden
	// alýnmalýdýr.
	public MyList(int capacity) {

		this.capacity = capacity;
		this.array = (T[]) new Object[capacity];
	}

	public int size() {
		int number = 0;
		for (int i = 0; i < getCapacity(); i++) {
			if (array[i] != null) {
				number++;
			}
		}
		return number;
	}

	// Sýnýf içerisindeki dizinin varsayýlan boyutu 10 ve dizinin eleman sayýsý
	// ihtiyaç duydukça 2 katý þeklinde artmalý.
	public void add(T data) {
		if (size() > getCapacity()) {
			this.tempArray = this.array;
			setCapacity((getCapacity() * 2));
			this.array = (T[]) new Object[getCapacity()];
			this.array = Arrays.copyOf(tempArray, getCapacity());
		}
		this.array[size()] = data;
	}

	// get(int index): verilen indisteki deðeri döndürür. Geçersiz indis girilerse
	// null döndürür.

	public T get(int index) {
		if (index > size() || index < 0) {
			return null;
		}

		return this.array[index];
	}

	// set(int index, T data) : verilen indisteki veriyi yenisi ile deðiþtirme
	// iþlemini yapmalýdýr. Geçersiz indis girilerse null döndürür.
	public T set(int index, T data) {
		if (size() < index || index < 0) {
			return null;
		}
		this.array[index] = data;
		return this.array[index];
	}

	// remove(int index): verilen indisteki veriyi silmeli ve silinen indis
	// sonrasýnda ki verileri sol doðru kaydýrmalý. Geçersiz indis girilerse null
	// döndürür.
	public T remove(int index) {
		if (size() < index || index < 0) {
			return null;
		}
		T[] temp = this.array;
		this.array[index] = null;
		for (int i = index; i < size(); i++) {
			if (size() - i == 1)
				this.array[i] = null;
			else
				this.array[i] = temp[i + 1];
		}
		return this.array[index];
	}

	// String toString() : Sýnýfa ait dizideki elemanlarý listeleyen bir metot.
	@Override
	public String toString() {
		return "My list : " + Arrays.toString(array);
	}
	
	public int lastIndexOf(T data) {
		for(int i = size(); i >= 0; i--) {
			if(this.array[i] == data) {
				return i;
			}
		}
		return -2;
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}
	
	public T[] toArray() {
		return this.array;
	}
	
	public void clear() {
		for(int i =0; i<this.size();i++) {
			this.array[i] = null;
		}
	}
	
	public MyList<T> subList(int start,int finish){
		MyList<T> list = new MyList<T>(finish - start + 1);
		for(int i = start; i <=finish; i++) {
			list.add(this.array[i]);
		}
		return list;
	}
	
	public boolean contains(T data) {
        for (int i = 0; i < size(); i++) {
            if (this.array[i] == data)
                return true;
        }
        return false;
    }

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public T[] getArray() {
		return array;
	}

	public void setArray(T[] array) {
		this.array = array;
	}

	public T[] getTempArray() {
		return tempArray;
	}

	public void setTempArray(T[] tempArray) {
		this.tempArray = tempArray;
	}

}

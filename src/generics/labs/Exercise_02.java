package generics.labs;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an array and prints out the value at a certain index.
 */

class Exercise_02<T>{

    public static void main(String[] args) {
        Integer nums[] = { 1, 2, 3, 4, 5 };
        String strings[] = { "a","b","c","d" };

        MyGenericArray<Integer> genericArray = new MyGenericArray<>();

        genericArray.someArray(nums);

        MyGenericArray<String> genericArray2 = new MyGenericArray<>();
    }

}


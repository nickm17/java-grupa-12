package ro.siit.selectietema1;

public class RemoveDuplicateElements {

    public static void main(String[] args) {
        int[] array = {20, 20, 30, 40, 50, 50, 50, 20};
        System.out.println(lengthOfUniqueElementsArray(array));
    }

    //keep only unique values from an array and count the number of elements of the array excluding duplicate values
    private static int lengthOfUniqueElementsArray(int[] array) {
        int arrayLength = array.length;
        int[] uniqueElementsArray = new int[arrayLength];
        int numberOfUniqueElements = 0;

        for (int i = 0; i < arrayLength; i++) {
            if (!checkIfPreviouslyEncountered(i, array)) {
                uniqueElementsArray[numberOfUniqueElements] = array[i];
                numberOfUniqueElements++;
            }
        }
        return numberOfUniqueElements;

    }

    //check if an element of the array located at a certain index has been previously encountered in the array
    private static boolean checkIfPreviouslyEncountered(int index, int[] array) {
        boolean checkIfPreviouslyEncountered = false;

        for (int i = 0, checkedNumber = array[index]; i < index; i++) {
            if (array[i] == checkedNumber) {
                checkIfPreviouslyEncountered = true;
                break;
            }
        }
        return checkIfPreviouslyEncountered;
    }

    // acesta merge doar daca array-ul e sortat
//    public static void main(String[] args) {
//        int[] myArray = {20, 20, 30, 40, 50, 50, 50};
//        int n = 1;
//        for (int i = 0; i < myArray.length; i++) {
//            if (myArray[i] != myArray[n - 1]) {
//                myArray[n++] = myArray[i];
//            }
//        }
//        System.out.println("The array length of unique elements is: " + n);
//    }
}

public class LinkedList {

    static ListElement root;

    public static void main(String[] args) {
        root = new ListElement();

        push(new ListElement());
        push(new ListElement());

        printList();
    }

    public static void push(ListElement element) {

        // Selects the last element of our list
        ListElement currentElement = root;
        while (currentElement.getNext() != null) {
            currentElement = currentElement.getNext();
        }

        // Set the next element of our list to the wanted element
        currentElement.setNext(element);
    }

    private static void printList() {
        int i = 1;
        ListElement currentElement = root;
        while (currentElement.getNext() != null) {
            i++;
            currentElement = currentElement.getNext();
        }

        System.out.println(String.format("There are %s elements in the list.", i));
    }
}

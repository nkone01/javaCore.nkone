package javacore.chapter05.object.exercice;

public class ReferenceManipulation {

    String name;
    int counter;

    public ReferenceManipulation(String name) {
        this.name = name;
        this.counter = 0;
    }
    public void displayReferenceName() {
        System.out.println("Reference name : " + name + " (counter : " + counter + ")");
    }
    public static void updateCounter(ReferenceManipulation object) {
        object.counter++;
    }
    public static void main(String[] args) {
        ReferenceManipulation reference1 = new ReferenceManipulation("reference1");
        reference1.displayReferenceName();

        ReferenceManipulation copy1 = reference1;
        copy1.displayReferenceName();

        updateCounter(reference1);
        reference1.displayReferenceName();
        copy1.displayReferenceName();

        updateCounter(copy1);
        reference1.displayReferenceName();
        copy1.displayReferenceName();

        copy1 = new ReferenceManipulation("reference2");
        reference1.displayReferenceName();
        copy1.displayReferenceName();

        reference1 = new ReferenceManipulation("reference1");
        reference1.displayReferenceName();
    }

}

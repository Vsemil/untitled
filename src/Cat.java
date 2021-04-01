import java.io.Closeable;
import java.io.IOException;

public class Cat implements Closeable {

    private final Breed breed = Breed.PERSIAN;
    private Collar collar;

    public Cat(Breed breed, Collar collar) {
        this.collar = collar;
    }

    public Cat() {
    }

    public boolean setCollar(Collar collar) throws TrollException, IOException {
        if (collar != null) {
//            throw new TrollException("xnj");
        }
        throw new IOException();
    }


    public Breed getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed=" + breed +
                (collar != null ? ", collar=" + collar : "")
                + '}';
    }

    @Override
    public void close() throws IOException {
        System.out.println("метод close");
    }
}

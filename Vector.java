public class Vector {

    private int[] data;
    private int size;

    public Vector() {
        data = new int[5];
        size = 0;
    }

    // размер элементов
    public int size() {
        return size;
    }

    // размер буфера
    public int capacity() {
        return data.length;
    }

    // добавить в конец
    public void add(int value) {
        ensureCapacity();
        data[size] = value;
        size++;
    }

    // добавить по индексу
    public void add(int index, int value) {

        if (index < 0 || index > size) {
            System.out.println("Неверный индекс");
            return;
        }

        ensureCapacity();

        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }

        data[index] = value;
        size++;
    }

    // удалить по индексу
    public void remove(int index) {

        if (index < 0 || index >= size) {
            System.out.println("Неверный индекс");
            return;
        }

        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }

        size--;
    }

    // получить элемент
    public int get(int index) {

        if (index < 0 || index >= size) {
            System.out.println("Неверный индекс");
            return -1;
        }

        return data[index];
    }

    // расширение массива
    private void ensureCapacity() {

        if (size == data.length) {

            int newCapacity = data.length * 2;
            int[] newData = new int[newCapacity];

            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }

            data = newData;
        }
    }

    // вывод (для проверки)
    public void print() {

        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }

        System.out.println();
    }
}

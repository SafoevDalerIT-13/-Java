public class Box <T> {
    // Поля
    private T item;

    // Конструкторы
    public Box() {
        this.item = null;
    }

    public Box(T item) {
        this.item = item;
    }

    // Геттеры и сеттеры
    public T getItem() {
        return this.item;
    }

    public void setItem(T item) {
        if(this.item != null) {
            throw new IllegalStateException("Коробка уже содержит обьект!");
        } else {
            this.item = item;
        }
    }

    // Метод toString
    @Override
    public String toString() {
        return "Вы создали коробку!";
    }

    // Метод для заполнения обьектом
    public void putBox(T item) {
        if(this.item != null) {
            throw new IllegalStateException("Коробка уже содержит обьект!");
        } else {
            this.item = item;
        }
    }

    // Метод проверки на заполненность
    public boolean isEmpty() {
        boolean empty = false;
        if(this.item != null) {
            System.out.println("Коробка содержит обьект!");
            empty = true;
        } else {
            System.out.println("Коробка пуста!");
            empty = false;
        }
        return  empty;
    }

    // Метод для взятия из коробки обьекта
    public T takeItem() {
        if(this.item == null) {
            throw new IllegalStateException("Коробка пуста!");
        } else {
            T item = this.item;
            this.item = null;
            return item;
        }
    }
}

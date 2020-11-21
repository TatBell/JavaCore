package src.main.java.com.tatiana_belkina.javacore.chapter02;

public class Obj {
    // Класс Object и его методы
    // Всего в Object 11 публичных методов, 5 обычных
    // и 6 с нативной реализацие
    //package java.lang;
    //
    //public class Object {
    //
    //    private static native void registerNatives();
    //    static {
    //        registerNatives();
    //    }
    //
    //    public final native Class<?> getClass();
    //    – Получает класс объекта во время выполнения

    //    protected native Object clone() throws CloneNotSupportedException;
    //     – Создает новый объект, не отличающийся от клонируемого
    //    Клонирование объекта означает создание точной копии исходного объекта.
    //   Если класс должен поддерживать клонирование, он должен реализовать
    //   интерфейс java.lang.Cloneable
    //   и переопределить метод clone () из класса Object.
    //   Клонирование объекта в классе Object реализовано очень примитивно
    //   – при клонировании создается всего один новый объект:
    //   просто создается еще один объект
    //   и его полям присваиваются значения полей объекта-образца.
    //   Если копируемый объект содержит ссылки на другие объекты,
    //   то ссылки будут скопированы, дубликаты тех объектов не создаются.


    //    public native int hashCode();
    //    – Возвращает хеш-код, связанный с вызывающим объектом
    //
    //    public boolean equals(Object obj) {
    //        return (this == obj);
    //    }
    //    – Определяет, равен ли один объект другому

    //    protected void finalize() throws Throwable { }
    //    – Вызывается перед удалением неиспользуемого объекта
    //
    //    public String toString() {
    //        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    //    }
    //     – Возвращает строку, которая описывает объект
    //
    //    public final native void notify();
    //    – Возобновляет выполнение потока
    //
    //    public final native void notifyAll();
    //    – Возобновляет выполнение всех потоков
    //
    //    public final native void wait(long timeout) throws InterruptedException;
    //    – Ожидает другого потока выполнения
    //    public final void wait(long timeout, int nanos) throws InterruptedException {
    //        if (timeout < 0) {
    //            throw new IllegalArgumentException("timeout value is negative");
    //        }
    //
    //        if (nanos < 0 || nanos > 999999) {
    //            throw new IllegalArgumentException(
    //                                "nanosecond timeout value out of range");
    //        }
    //
    //        if (nanos >= 500000 || (nanos != 0 && timeout == 0)) {
    //            timeout++;
    //        }
    //
    //        wait(timeout);
    //    }
    //
    //    public final void wait() throws InterruptedException {
    //        wait(0);
    //    }
    //
    //
    //}

}

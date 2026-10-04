package linx7a.design;

import java.util.ArrayList;
import java.util.List;

/**
 * Реализация стека с поддержкой получения минимума за O(1)
 * <p>
 * Операции:
 * - push(int val) - положить элемент на стек
 * - pop() - удалить верхний элемент
 * - top() – вернуть верхний элемент
 * - getMin() – вернуть минимальный элемент в стеке
 * <p>
 * Требования:
 * - Все операции должны работать за O(1) по времени
 * - Можно использовать внутри любую удобную структуру полей
 */
public class MinStackTwoStacksSolution {

    private final List<Integer> stack;
    private final List<Integer> minStack;

    /**
     * Конструктор: инициализируй все необходимые структуры данных
     */
    public MinStackTwoStacksSolution() {
        stack = new ArrayList<>();
        minStack = new ArrayList<>();
    }

    /**
     * Кладёт элемент val на вершину стека за O(1)
     */
    public void push(int val) {
        stack.add(val);
        if (minStack.isEmpty() || val <= minStack.get(minStack.size() - 1)) {
            minStack.add(val);
        }
    }

    /**
     * Удаляет верхний элемент стека за O(1)
     */
    public void pop() {
        int removed = stack.remove(stack.size() - 1);
        int currentMin = minStack.get(minStack.size() - 1);
        if (removed == currentMin) {
            minStack.remove(minStack.size() - 1);
        }
    }

    /**
     * Возвращает верхний элемент стека без удаления за O(1)
     */
    public int top() {
        return stack.get(stack.size() - 1);
    }

    /**
     * Возвращает минимальный элемент в стеке на текущий момент за O(1)
     */
    public int getMin() {
        return minStack.get(minStack.size() - 1);
    }
}
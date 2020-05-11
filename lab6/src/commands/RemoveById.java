package commands;

import com.company.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class RemoveById extends Command {
    Integer identificator;

    public RemoveById(int identificator) {
        this.identificator = identificator;

        indication = "удаляет элемент из коллекции по его id";
        name = "remove_by_id";
    }

    @Override
    public synchronized String execute(PriorityQueue<Product> production) {
        List<Product> coll2 = new ArrayList<Product>(production);
        for (int j = 0; j < coll2.size(); j++) {
            Product a = coll2.get(j);
            if (a.getId() == identificator) {
                production.remove(a);
                return null;
            }
        }
        return "Записи с таким id не существует";
    }
}

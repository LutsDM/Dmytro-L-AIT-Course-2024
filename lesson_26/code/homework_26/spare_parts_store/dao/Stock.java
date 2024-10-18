package homework_26.spare_parts_store.dao;
//добавить деталь на склад
//найти деталь по barCode
//обновить данные о детали
//удалить деталь
//общая масса всех деталей на складе
//средняя масса деталей на складе
import homework_26.spare_parts_store.model.Detail;

public interface Stock {

    boolean addDetail (Detail detail);

    Detail findDetail (long barCode);

    Detail updateDetail (Detail detail);

    Detail removeDetail (long barCode);

    double totalWeight(Detail[] deteils);

   double averageWeight(Detail[] details);

    int size();

}

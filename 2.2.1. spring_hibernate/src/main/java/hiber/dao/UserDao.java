package hiber.dao;

import hiber.model.User;

import java.util.List;

public interface UserDao {
   void add(User user);
   List<User> listUsers();

   User getUserByCar(String model, int series);    //5) создан метод для запроса, который будет доставать юзера, владеющего машиной по ее модели и серии
}

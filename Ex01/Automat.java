package Ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Ex02.Order;

public class Automat {
    
    List<Product> listProduct = new ArrayList<>();

    public void initProducts(List<Product> myList) {
        listProduct = myList;
    }

    public Product getProduct(String name) {
        for (Product product : listProduct) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public Product getProduct(List<Product> list, String name) {
        for (Product product : listProduct) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public ArrayList<Order> createOrder(ArrayList<Product> shoppingList){
        Scanner scan = new Scanner(System.in);
        ArrayList <Order> list_order  = new ArrayList<>();  
        ArrayList<Product> buyList = new ArrayList<>();                            // Создаем пустой список покупок
        int idCommand;
        boolean no_exit = true;
        int id_product;
        int quantity;
        int count;
        int id_category;

        while (no_exit){                                                                // ожидание команды пользователя
            int sum = 0;
            System.out.println();
            System.out.println("Список выбранных товаров");
            System.out.println(list_order);                                             // Печать списка покупаемых товаров 
            for (Order order : list_order) {
                sum = sum + order.getPrice() * order.getQuantity();
            }
            System.out.print("Итого к оплате: ");
            System.out.println(sum);


            System.out.println();
            System.out.println("[1] Показать товар из категории");
            System.out.println("[2] Поиск товара по названию");
            System.out.println("[3] Добавить продукт в корзину по ID");                 //Меню для заполнения списка товаров и оформления покупки
            // System.out.println("[4] Убрать продукт в корзину по ID");
            System.out.println("[9] Покинуть покупки");
            System.out.println("[0]Перейти к оплате");
            System.out.print("Выберете команду: ");
            idCommand = scan.nextInt();
            scan.nextLine();

        
            if (idCommand==1){
                System.out.println();
                System.out.println("[1] Показать продукты категории: Еда");
                System.out.println("[2] Показать продукты категории: Напитки");         // Меню выбора категории
                System.out.println("[3] Показать продукты категории: Горячии напитки");
                System.out.print("Выберете команду: ");
                id_category = scan.nextInt();
                scan.nextLine();
                if (id_category==1){
                    for (Product el : shoppingList) {                                        
                        if (el instanceof Food ){                                           
                            if (el.getQuantity()>0){
                                System.out.print(el);                                       
                            }
                        }
                    }    
                }        
                if (id_category== 2){                                                       
                    for (Product el : shoppingList) {                                       
                        if (el instanceof Beverage ){
                            if (el.getQuantity()>0){
                                System.out.print(el);
                            }
                        }
                    }
                }
                if (id_category == 3){                                                      
                    for (Product el : shoppingList) {                                       
                        if (el instanceof HotBeverage ){
                            if (el.getQuantity()>0){
                                System.out.print(el);
                            }
                        }
                    }
                }
            }
            
            if (idCommand==2){                                                              
                System.out.println();
                System.out.print("Введите название: ");
                String name = scan.nextLine();
                for (Product order : shoppingList) {                                         
                    if (order.getName().equals(name)){
                    System.out.println(new Automat().getProduct(shoppingList,name).toString());    
                    }
                }
            }

            if (idCommand==3){                                                              // Добавление товара в список покупок по его номеру
                System.out.print("Выберете ID товара: ");
                id_product = scan.nextInt();
                scan.nextLine();
                for (Product product : shoppingList) {                                      // Пробегает весь список товаров
                    if (id_product == product.getId()){                                     // и находит совпадение с веденным 
                        count = product.getQuantity();                                      // Запоминает его количество доступное к покупке
                        System.out.println("Доступно для покупки: " + count);
                        System.out.print("Выберете кол-во товара: ");                     //  Просит от пользователя кол-во к покупке 
                        quantity = scan.nextInt();
                        scan.nextLine();
                        if (quantity <0){                                                   // Проверка правильности ввода
                            System.out.println();
                            System.out.println("Вы ввели отрицательное число");
                            break;
                        }
                        if (quantity <= count){                                                                            // Проверяет возможно ли купить такое количество товара
                            buyList.add(product);                                                                          // Вносит текущуй товар в список покупок
                            list_order.add(new Order(buyList,product.getPrice(), product.getName(), quantity));     
                            product.setQuantity(count-quantity);                                                           // формирует доступный остаток для покупки товара
                        }    
                        if (quantity>count) {
                            System.out.println("Вы запросили кол-ва большее чем в автомате");
                        }
                    break;                                                                  // После нахождения товара останавливает последующий поиск
                    }
                }
            }
            
            if (idCommand == 0) {                                                           // Проведение оплаты
                System.out.print("Введите сумму для оплаты: ");
                int summa = scan.nextInt();
                scan.nextLine();
                if (summa < sum){                                                          // Если средств меньше чем требуется для покупки
                    System.out.println();
                    System.out.println("Недостаточно средст отмените часть товара");
                    System.out.println();
                }
                else {                                                                      // Успешная покупка
                    System.out.println();
                    System.out.println("Спасибо за покупку");
                    System.out.print("Ваша сдача: ");
                    System.out.println(summa-sum);
                    System.out.println("Не забудьте ваш товар и сдачу");
                    System.out.println();
                    no_exit =false;
                }
            }

            if (idCommand == 9){                                                            // Сброс покупок
                System.out.println("Спасибо за покупку");
                no_exit =false;
            }
        }
    return list_order;
    }
}

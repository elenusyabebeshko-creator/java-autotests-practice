package org.example;

public class OrderCost {
    public static void main(String[] args) {
        double pricePerItem = 25.50; // цена одной единицы товара
        double weightPerItem = 0.8;  // вес одной единицы в килограммах
        int quantity = 4;            // количество единиц
        boolean hasDiscount = true;  // есть ли льгота на пошлину

        // стоимость товаров в USD
        double totalCost = pricePerItem * quantity;

        // общий вес заказа
        double totalWeight = weightPerItem * quantity;

        // доставка
        double deliveryCost;
        if (totalWeight <= 2) {
            deliveryCost = 5;
        } else {
            deliveryCost = 12;
        }

        // cкидка
        double discount = 0;
        if (hasDiscount = true && totalCost > 50) {
            discount = totalCost * 0.10;

        } else {
            System.out.println("Скидка не предусмотрена");;
        }

        //  пошлина с учётом скидки
        double duty = 0;
        if ((totalCost-discount) > 100 && !hasDiscount) {
            duty = (totalCost - discount) * 0.10;
        }

        // Итоговая сумма
        double total = (totalCost-discount) + deliveryCost + duty;

        // 6. Вывод
        System.out.println("Общий вес заказа: " + String.format("%.2f", totalWeight) + " кг");
        System.out.println("Стоимость товаров: " + String.format("%.2f", totalCost) + " USD");
        System.out.println("Скидка: " + String.format("%.2f", discount) + " USD");
        System.out.println("Стоимость товаров при наличии скидки -10% "+ (totalCost-discount) + " USD");
        System.out.println("Доставка: " + String.format("%.2f", deliveryCost) + " USD");
        System.out.println("Пошлина: " + String.format("%.2f", duty) + " USD");
        System.out.println("Итого к оплате: " + String.format("%.2f", total));
    }
}

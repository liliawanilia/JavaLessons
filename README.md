# JavaLessons
Simple java examples for my friends.

1. Loop exercises are written down inside /src/examples/LoopTest.java. There are 8 tasks - the goal is to learn simple loops.

2. Introduction to OOP on business example. Below is description in Polish (todo english description):
    
    Firma X posiada dział marketingowy, który chce zaimplementować system zarządzania promocjami, które będą wysyłane do użytkowników
 systemu za pomocą następujących kanałów (mail, sms, rozmowa telefoniczna, poczta). Zgodnie z wprowadzoną ustawą o RODO/GDPR, klienci mają
 prawo do wyrażenia woli jakimi kanałami chcą otrzymywać treści dotyczące promocji. Klienci dokonując zakupów zdobywają punkty lojalnościowe.
 Przy założeniu konta, użytkownik dostaje dodatkowe 40 punktów za każdy zaznaczony preferowany kanał komunikacji.
 W sytuacji, gdy nie ma sprecyzowanego wyboru kanału komunikacji dla promocji, należy uwzględnić następujące priorytety dla preferencji:
    * 1 - mail
    * 2 - sms
    * 3 - telefon
    * 4 - poczta

 Firma zaplanowała przetestować system dla następujacych promocji:

 * Promocja 1:
 Data: 2018-11-05
 Reguła: Wyślij wiadomość, dla wszystkich klientów, którzy wyrazili chęć otrzymywania wiadomości za pomocą kanału mail.

 * Promocja 2:
 Data: 2018-11-15
 Reguła: Wyślij wiadomość, dla wszystkich klientów.

 * Promocja 3:
 Data: 2018-11-19
 Reguła: Wyślij wiadomość, dla wszystkich klientów, którzy mają więcej niż 100 punktów lojalnościowych.

 Zadaniem będzie implementacja symulatora powyższego opisu systemu.
 
 * 2.0 Task
 Implement class for User and Promotion based on above description. Class should contains at least one constructor, private fields and getters and setters methods. [Goal] - learn how to write class, create new instance of objects. Try to use Comparable interface and override toString() method.
 
 * 2.1 Task - [homework] Try to implement generic helper class which will be responsible for:
    - get min value from array (public T getMinValue(T[] array))
    - get max value from array (public T getMaxValue(T[] array))
    - find item from array (public bool findItem(T[] array, T item))
    - add item to array (public T[] addItem(T[] array, T item))
    - remove item from array (public T[] removeItem(T[] array, T item))
    - swap items in array. (public T[] swapItems(T[] array, T firstItem, T secondItem))
 
    Please implement it using TDD.
 
    Helpful links:
    - https://dev.to/chrisvasqm/introduction-to-unit-testing-with-java-2544
    - https://www.tutorialspoint.com/java/java_generics.htm

    [Goal] - learn how to create generic classes, implement simple algorithms on arrays, learn about TDD.
 
 * 2.2 Task - [homework] Try to implement generic class which will be similar to (2.1 Task) - however use List instead of an Array
 
    Helpful links:
    - http://tutorials.jenkov.com/java-collections/list.html
    
    [Goal] - learn how to use collections in Java, improve unit tests.
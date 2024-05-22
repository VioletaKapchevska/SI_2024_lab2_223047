# Violeta Kapchevska, 223047

# 2. Control Flow Graph
 
![SILab2_CFG](https://github.com/VioletaKapchevska/SI_2024_lab2_223047/assets/138134099/c1a10cb0-2d58-4c25-9a79-8cd19a88f209)

# 3. Цикломатската комплексност

Цикломатската комплексност на кодот е 10, ја добив преку формулата P+1, каде P е бројот на предикатни јазли. Во овој случај бројот на предикатни јазли е 9,па цикломатската комплексност изнесува 10.

# 4. Тест случаи според Every branch критериумот

1) []
2) Item("Vazna","V7",350,10.0), payment = 200
3) Item("Slika","5608",500,20.0), payment = 300
4) Item("Moliv","073",50,0.0), payment = 55
5) Item("","047",500,20.0), payment = 150
6) Item("Ramka",null,100,4.0), payment = 50

![EveryBranchTest](https://github.com/VioletaKapchevska/SI_2024_lab2_223047/assets/138134099/50cf60c0-dfef-4063-ba5f-e5bce67c7599)

# 5. Tест случаи според критериумот Multiple Condition

if (item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0')

Можни услови:

F && X && X -> item.getPrice() < =300 , item.getDiscount() = anything, item.getBarcode().charAt(0)=anything

T && F && X ->item.getPrice() >=300 , item.getDiscount() <=0 , item.getBarcode().chatAt(0)=anything

T && T && T -> item.getPrice() >= 300, item.getDiscount() > 0 , item.getBarcode().charAt(0) == '0'

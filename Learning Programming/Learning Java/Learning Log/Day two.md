1. Variables require a pre-definition of the data type before they are address:
```Java
int num = 5;
int num1;
num1 = 2;
```

>Note: We must use semi-colons after every line except for after "{ }"

2. To display content information to the console we have an assortment of functions we can use:
```Java
double num = 1.0
System.out.println(num+" is a number") //Adds \n on the end automatically
System.out.print(num+" is a number") //Does not add \n automatically, used for taking in input
System.out.printf("%.2f is a number", num) //Is used for formatting and rounding
```

More on printf:

- %... is used to indicated a formatted placeholder value for subsequent variables indicated after the string: "num"  (Separated by ",")
- After the percent you can use x.y where both can be any number, or not there at all:
> What are %x.y with printf
> x: indicates the total number of values held
> y: indicates the number of values held after the decimal place

Note: Very important for rounding for example:

```Java
double num = 1.25;
System.out.printf("%.1", num)
```

Rounds "num" and displays 1.3 when the program is run

___
### Vending Machine Data File
The input file that stocks the vending machine products is a pipe `|` delimited file. Each line is a separate product in the file and follows the below format:

| Column Name   | Description |
----------------|-------------|
| Slot Location | The slot location in the vending machine where the product is set. |
| Product Name  | The display name of the vending machine product.                   |
| Price         | The purchase price for the product.                                |
| Type          | The product type for this row.                                     |

For example:

```
A1|Potato Crisps|3.05|Chip
B1|Moonpie|1.80|Candy
B2|Cowtales|1.50|Candy
C1|Cola|1.25|Drink
```

An input file has been provided with your repository: `vendingmachine.csv`.

 ---
### Sales Report
The output sales report file is also pipe-delimited for consistency. Each line is a separate product with the number of sales for the applicable product. At the end of the report is a blank line followed by the **TOTAL SALES** dollar amount indicating the gross sales from the vending machine.

**Example Output**

>```
>Potato Crisps|10
>Stackers|3
>Grain Waves|0
>Cloud Popcorn|50
>Moonpie|23
>Cowtales|2
>Wonka Bar|1
>Crunchie|3
>Skor|4
>Cola|8
>Dr. Salt|9
>Mountain Melter|12
>Heavy|11
>Diet Cola|6
>U-Chews|4
>Little League Chew|2
>Chiclets|0
>Triplemint|0
>```

veg_price = {'cabbage': 2.87, 'carrot': 1.59, 'spinach': 3.33, 'asparagus': 2.54,'artichoke': 3.00, 'lettuce': 2.43}
order = {'cabbage': 2, 'artichoke': 5}
total = 0
for veggie, quantity in order.items():
    total += veg_price[veggie] * quantity
print(total)
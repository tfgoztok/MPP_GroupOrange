## SQL Queries Based on Hotel Database Schema

### 6.7 List full details of all hotels.
```sql
SELECT * FROM Hotel;
```

### 6.8 List full details of all hotels in London.
```sql
SELECT * FROM Hotel
WHERE city = 'London';
```

### 6.9 List the names and addresses of all guests living in London, alphabetically ordered by name.
```sql
SELECT guestName, guestAddress FROM Guest
WHERE guestAddress LIKE '%London%'
ORDER BY guestName ASC;
```

### 6.10 List all double or family rooms with a price below £40.00 per night, in ascending order of price.
```sql
SELECT * FROM Room
WHERE (type = 'Double' OR type = 'Family') AND price < 40.00
ORDER BY price ASC;
```

### 6.11 List the bookings for which no `dateTo` has been specified.
```sql
SELECT * FROM Booking
WHERE dateTo IS NULL;
```

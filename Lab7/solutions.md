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

### 6.12 How many hotels are there?
```sql
SELECT COUNT(*) AS hotel_count
FROM Hotel;
```

### 6.13 What is the average price of a room?
```sql
SELECT AVG(price) AS average_room_price
FROM Room;
```

### 6.14 What is the total revenue per night from all double rooms?
```sql
SELECT SUM(price) AS total_revenue_per_night
FROM Room
WHERE type = 'Double';
```

### 6.15 How many different guests have made bookings for August?
```sql
SELECT COUNT(DISTINCT guestNo) AS guest_count_in_august
FROM Booking
WHERE MONTH(dateFrom) = 8;
```

### 6.16 List the price and type of all rooms at the Grosvenor Hotel.
```sql
SELECT r.price, r.type
FROM Room r
JOIN Hotel h ON r.hotelNo = h.hotelNo
WHERE h.hotelName = 'Grosvenor Hotel';
```

### 6.17 List all guests currently staying at the Grosvenor Hotel.
```sql
SELECT DISTINCT g.guestNo, g.guestName, g.guestAddress
FROM Guest g
JOIN Booking b ON g.guestNo = b.guestNo
JOIN Hotel h ON b.hotelNo = h.hotelNo
WHERE h.hotelName = 'Grosvenor Hotel'
  AND CURRENT_DATE BETWEEN b.dateFrom AND b.dateTo;
```

### 6.18 List the details of all rooms at the Grosvenor Hotel, including the name of the guest staying in the room, if the room is occupied.
```sql
SELECT 
    r.roomNo,
    r.type,
    r.price,
    g.guestName
FROM Room r
JOIN Hotel h ON r.hotelNo = h.hotelNo
LEFT JOIN Booking b 
    ON r.hotelNo = b.hotelNo 
   AND r.roomNo = b.roomNo 
   AND CURRENT_DATE BETWEEN b.dateFrom AND b.dateTo
LEFT JOIN Guest g ON b.guestNo = g.guestNo
WHERE h.hotelName = 'Grosvenor Hotel';
```

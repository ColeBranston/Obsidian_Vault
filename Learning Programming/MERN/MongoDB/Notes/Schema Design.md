#### Designing Schemas for Different Use Cases

Design schemas based on application needs. Consider query patterns, data consistency, and storage requirements.

**Example Schema for E-commerce:**
```javascript
{
  "order_id": 1,
  "customer": {
    "name": "John Doe",
    "address": "456 Elm St"
  },
  "items": [
    {"product": "Laptop", "quantity": 1, "price": 1000},
    {"product": "Mouse", "quantity": 1, "price": 50}
  ],
  "total": 1050
}
```

#### Embedding vs. Referencing Data

Embed data for fast reads; reference data for normalization and reduced redundancy.

**Embedding Example:**
```javascript
{
  "name": "John",
  "contacts": [
    {"type": "email", "contact": "john@example.com"},
    {"type": "phone", "contact": "123-456-7890"}
  ]
}
```

**Referencing Example:**
```javascript
{
  "_id": 1,
  "name": "John",
  "contact_ids": [101, 102]
}
```


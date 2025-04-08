## Exercise 14.14

### A: Functional Dependencies

A functional dependency means: If you know the value of one attribute (or a group of attributes), you can uniquely determine the value of another attribute.

#### Assumptions:
- A patient is identified by `patient_number`.
- A patient is assigned to a single bed.
- Drugs are uniquely identified by `drug_number`.
- The same drug can be prescribed to the same patient multiple times with different dosage, methods, and dates.
- A ward can be identified by `ward_number`.
- `finish_date` does not overlap if `patient_number`, `drug_number`, and `start_date` are the same.

#### Functional Dependencies:
- `Patient Number` → `Full Name`, `Bed Number`, `Ward Number`, `Ward Name`
- `Ward Number` → `Ward Name`
- `Drug Number` → `Drug Name`, `Description`
- (`Patient Number`, `Drug Number`, `Start Date`) → `Dosage`, `Method of Admin`, `Units per Day`, `Finish Date`

### B: Normalization Steps

#### First Normal Form (1NF)

In the given table, each column like `drug_number` contains grouped values for each `patient_number` (e.g., `[10223, 10334]`). To achieve First Normal Form:
- Ensure atomic values in each cell (no groups or arrays).
- Treat repeated patient data as separate rows.

**1NF Table:**
```
Medical_Form(
  Patient Number,
  Full Name,
  Bed Number,
  Ward Number,
  Ward Name,
  Drug Number,
  Drug Name,
  Description,
  Dosage,
  Method of Admin,
  Units per Day,
  Start Date,
  Finish Date
)
```

#### Second Normal Form (2NF)

To achieve 2NF:
- Eliminate partial dependencies (i.e., non-key attributes depending on part of a composite key).
- Decompose the 1NF table into multiple tables.

**Tables:**
```
Patient(
  Patient Number,
  Full Name,
  Bed Number,
  Ward Number
)

Ward(
  Ward Number,
  Ward Name
)

Drug(
  Drug Number,
  Drug Name,
  Description
)

Medication(
  Patient Number,
  Drug Number,
  Start Date,
  Dosage,
  Method of Admin,
  Units per Day,
  Finish Date
)
```

#### Third Normal Form (3NF)

To achieve 3NF:
- Ensure that all attributes are only dependent on the primary key.
- Remove transitive dependencies.

In this case, all tables already meet the 3NF criteria:
- No transitive dependencies exist.
- All non-key attributes depend only on the primary key of their respective table.

Hence, the schema is in **Third Normal Form**.



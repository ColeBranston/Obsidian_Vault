**Program–data independence** (also called *insulation between programs and data*) means application programs don't need to change when the underlying data storage structures change.

The [[System Catalog]] stores the structure of the data separately from the applications, so e.g. adding a new field to a record doesn't require rewriting the [[Database Management System]] access programs — only the catalog entry changes.

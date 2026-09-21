An **attribute** is a property of an entity or a relationship type. Its **attribute domain** is the set of allowable values for one or more attributes.

| Kind | Definition |
|---|---|
| **Simple** | composed of a single component with an independent existence |
| **Composite** | composed of multiple components, each with an independent existence (e.g. `address` = street + city + postcode) |
| **Single-valued** | holds a single value for each occurrence of an entity type |
| **Multi-valued** | holds multiple values for each occurrence of an entity type (e.g. `telNo [1..3]`) |
| **Derived** | represents a value derivable from a related attribute, or set of attributes, not necessarily in the same entity type (e.g. `/totalStaff`) |

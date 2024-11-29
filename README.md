
## API Documentation: Turbo Motors - Car Management

Turbo Motors is a car management system designed to streamline the management of cars in a simple, efficient, and user-friendly way. This backend API allows for the management of car data, including the ability to create, update, retrieve, and delete car information. The system supports basic CRUD (Create, Read, Update, Delete) operations for car entities, providing endpoints that enable seamless integration with a frontend application.

### Features:
- **Car CRUD Operations:** Full support for creating, retrieving, updating, and deleting car records.
- **Data Integrity:** Ensures that cars cannot be updated or deleted if they do not exist in the database.
- **Flexible Data Model:** The car data model includes details such as description, brand, model, color, year, and fuel type.

### Technologies:
- **Spring Boot** for building the backend REST API.
- **JPA/Hibernate** for database interactions.
- **PostgreSQL** for data storage.
- **BeanUtils** for object mapping and data transfer object (DTO) handling.

The backend is designed to be highly scalable, ensuring it can handle future feature additions and performance optimizations.

For the frontend implementation of this project, please refer to the repository below:

[Turbo Motors Frontend Repository](https://github.com/lucasbrasantos/turbomotors-frontend.git)


### Base URL:
`/cars`

---

### **1. Get All Cars**

- **Endpoint:** `GET /cars`
- **Description:** Retrieves a list of all cars.

---

### **2. Get All Cars (With ID)**

- **Endpoint:** `GET /cars/2`
- **Description:** Retrieves a list of all cars, including their `id`.

---

### **3. Create a Car**

- **Endpoint:** `POST /cars`
- **Description:** Creates a new car.

---

### **4. Update a Car**

- **Endpoint:** `PUT /cars/{id}`
- **Description:** Updates an existing car. If the car does not exist, returns an error.

---

### **5. Delete a Car**

- **Endpoint:** `DELETE /cars/{id}`
- **Description:** Deletes a car by its ID. If the car does not exist, returns an error.

---

### **Model Structure:**

- **Car**
    - `id` (Long)
    - `description` (String)
    - `brand` (String)
    - `model` (String)
    - `color` (String)
    - `year` (String)
    - `fuelType` (String)

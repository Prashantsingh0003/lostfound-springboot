# Lost and Found Management System

This is a Spring Boot-based REST API for managing lost and found items. It allows users to report lost or found items, claim items, and manage status and images.

## 🚀 Technologies Used

- Java 17
- Spring Boot
- Spring Web (RESTful API)
- Maven


## 🔧 Endpoints

### Full-form (`@RequestMapping`) Endpoints

- `POST /items/reportLost` - Report a lost item
- `POST /items/reportFound` - Report a found item
- `GET /items/allLost` - Get all lost items
- `GET /items/allFound` - Get all found items
- `GET /items/match` - Match lost and found
- `DELETE /items/deleteLost` - Delete a lost item report
- `DELETE /items/deleteFound` - Delete a found item report

### Short-form (`@GetMapping`, etc.) Endpoints

- `GET /items/recentLost` - Recently reported lost items
- `GET /items/recentFound` - Recently reported found items
- `POST /items/claim` - Submit a claim
- `PUT /items/verifyClaim` - Start claim verification
- `DELETE /items/cancelClaim` - Cancel a claim
- `POST /items/uploadImage` - Upload item image
- `PUT /items/updateStatus` - Update item status
- `DELETE /items/removeImage` - Remove item image

## 📦 How to Run

1. Clone the repository
2. Open in Eclipse or IntelliJ
3. Run `LostfoundApplication.java` as a Spring Boot App
4. Use Postman or a REST client to test the endpoints


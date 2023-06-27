# Movie List Spring API

REST API for a CRUD Movie List App, made using Java's Spring Framework.

## Description

The Movie List Spring API provides endpoints to perform CRUD (Create, Read, Update, Delete) operations on a movie list. It allows users to manage movies by adding, retrieving, updating, and deleting movie records.

## Features

The API offers the following features:

- Create a new movie: Add a movie to the movie list with its name and watched status.
- Retrieve all movies: Get a list of all movies in the movie list.
- Retrieve a movie by ID: Get details of a specific movie by providing its unique ID.
- Update a movie: Update the details of a movie, such as its name or watched status.
- Delete a movie: Remove a movie from the movie list based on its ID.

## API Endpoints

The following API endpoints are available:

- `POST /movies/add`: Add a new movie to the movie list.
- `GET /movies/all`: Retrieve all movies in the movie list.
- `GET /movies/{id}`: Retrieve a specific movie by its ID.
- `PUT /movies/{id}`: Update the details of a movie.
- `DELETE /movies/{id}`: Delete a movie from the movie list.

## Installation

To run the Movie List Spring API locally, perform the following steps:

1. Clone this repository to your local machine.
2. Set up the required database (e.g., H2, MySQL, PostgreSQL) and configure the database connection properties in the application configuration file.
3. Build the project using your preferred Java build tool (e.g., Maven or Gradle).
4. Run the application using the appropriate command for your build tool.

## Technologies Used

The Movie List Spring API is developed using the following technologies:

- Java 17
- Spring Framework
- Spring Boot for initial dependency injection
- RESTful API principles
- Database (e.g., H2, MySQL, PostgreSQL)

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, please open an issue or submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).

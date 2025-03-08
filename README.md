# Auth0 Spring Boot Integration Demo

A demonstration project showing how to integrate Auth0 authentication and authorization with Spring Boot 3.x using Resource Server and OAuth 2.0.

## Features

- OAuth 2.0 / OIDC authentication with Auth0
- JWT token validation
- Public and protected API endpoints
- Environment variable configuration via .env file

## Prerequisites

- Java 17 or higher
- Maven 3.6+
- An Auth0 account with a configured application and API

## Quick Start

1. Clone the repository
2. Configure Auth0 credentials in `.env` file
3. Run the application: `mvn spring-boot:run`
4. Access the API endpoints:
   - Public: `http://localhost:8080/api/public`
   - Private: `http://localhost:8080/api/private` (requires authentication)

## Configuration

The project uses environment variables for Auth0 configuration. Create a `.env` file in the project roo# demo-auth0-ROPG

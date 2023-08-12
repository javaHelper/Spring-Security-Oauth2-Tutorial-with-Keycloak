# Spring Security Oauth2 Tutorial with Keycloak - using authorization_code

- https://www.keycloak.org/
- https://www.keycloak.org/guides
- https://www.keycloak.org/getting-started/getting-started-docker

```
docker run -p 8090:8080 -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=admin quay.io/keycloak/keycloak:22.0.1 start-dev
```

This command starts Keycloak exposed on the local port 8080 and creates an initial admin user with the username `admin` and password `admin`.


<img width="1450" alt="Screenshot 2023-08-10 at 7 47 01 PM" src="https://github.com/javaHelper/Spring-Security-Oauth2-Tutorial-with-Keycloak/assets/54174687/8ae3ba9e-4c77-4291-a9d5-bfaf49d78583">

<img width="1461" alt="Screenshot 2023-08-10 at 7 47 18 PM" src="https://github.com/javaHelper/Spring-Security-Oauth2-Tutorial-with-Keycloak/assets/54174687/2a7bbb22-5735-4f08-b06e-1c8ff4f535ca">


<img width="1456" alt="Screenshot 2023-08-10 at 7 48 10 PM" src="https://github.com/javaHelper/Spring-Security-Oauth2-Tutorial-with-Keycloak/assets/54174687/984ccd84-2fff-4fe5-a067-3040ffb657cf">

<img width="1234" alt="Screenshot 2023-08-10 at 7 52 35 PM" src="https://github.com/javaHelper/Spring-Security-Oauth2-Tutorial-with-Keycloak/assets/54174687/378d0668-9e7d-46ae-b92e-347aaf5db0d6">

<img width="1237" alt="Screenshot 2023-08-10 at 7 53 00 PM" src="https://github.com/javaHelper/Spring-Security-Oauth2-Tutorial-with-Keycloak/assets/54174687/35729671-ff79-4d1c-a798-dff09cf57363">


http://localhost:8090/realms/oauth2-demo-realm/.well-known/openid-configuration

----------

# Final Settings

Valid redirect URIs - http://localhost:8080/login/oauth2/code/oauth2-demo-thymeleaf-client

<img width="972" alt="Screenshot 2023-08-12 at 7 33 02 PM" src="https://github.com/javaHelper/Spring-Security-Oauth2-Tutorial-with-Keycloak/assets/54174687/b788e0de-aa3d-4725-93f5-c63c0ec0bdfe">

<img width="1000" alt="Screenshot 2023-08-12 at 7 32 38 PM" src="https://github.com/javaHelper/Spring-Security-Oauth2-Tutorial-with-Keycloak/assets/54174687/37603f13-a81a-4ac3-95b3-c8e56c32d0f4">

<img width="1043" alt="Screenshot 2023-08-12 at 7 32 25 PM" src="https://github.com/javaHelper/Spring-Security-Oauth2-Tutorial-with-Keycloak/assets/54174687/ff06170f-e6d4-4dba-9d90-b3e4640efde6">



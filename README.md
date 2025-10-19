[![CI Pipeline for QA Final Project](https://github.com/TiteaG/qa-final-project-java/actions/workflows/ci.yml/badge.svg)](https://github.com/TiteaG/qa-final-project-java/actions/workflows/ci.yml)

Scopul este simularea unui flux complet de \*\*CI/CD\*\* pentru un proiect Java, folosind:

\- Maven pentru gestionarea testelor,

\- Docker pentru containerizare,

\- GitHub Actions pentru automatizarea testelor și publicarea imaginii Docker.



Testul definit verifică un endpoint API:

https://jsonplaceholder.typicode.com/todos/1  

Răspunsul trebuie să aibă status *200* și să conțină un câmp *title*.


Pentru a rula testele locale:
Trebuie sa ne asiguram ca avem instalat Maven și Java 17
În terminal (în folderul proiectului), rulăm:
   mvn test

Pentru crearea unei imagini:
docker build -t titeag/qa-final-project-java .

Pentru rularea containerului:
docker run titeag/qa-final-project-java

LA rulare o sa apara la sfarsit in consola:
[INFO] BUILD SUCCESS

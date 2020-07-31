# Assigment2
Create a comparator library that can be used to compare 2 API responses (HTTP/HTTPS). The input to your code should be two files with millions of request URLs.


**This Project is build with Maven** </br>
I used following dependency  </br>

1. io-rest-assured
2. Junit5

**Main function is under** </br>
RestAssuredAnswersTest </br>

**Unit Test** </br>
1.This is written to test compare.
2. This is written for to test API response is valid or invalid.

**Dummy test Data** </br>
Test data file is Present inside Project folder itself i.e - file1.txt, file2.txt

**Steps to use this project** </br>
1. Open this Project as a Maven Project or direct import pom.xml
2. Hold for some time to add dependency
3. Run the RestAssuredAnswersTest class which is under `DKatalisAssigment2/src/main/java/RestAssuredAnswersTest.java`

**Run Unit Test**
run unit test via maven command
mvn -Dtest=TestCircle test or mvn test
or
you can choose individual file to test as well

**Output Result** </br>
OutPut Result is available on console below mention format.
`https://reqres.in/api/users/1 equals https://reqres.in/api/users/1
 https://reqres.in/api/users/2 equals https://reqres.in/api/users/2
 https://reqres.in/api/users/3 equals https://reqres.in/api/users/3
 https://reqres.in/api/users/4 equals https://reqres.in/api/users/4
 https://reqres.in/api/users/5 equals https://reqres.in/api/users/5
 https://reqres.in/api/users/6 not equals https://reqres.in/api/users/7
 https://reqres.in/api/users/7 not equals https://reqres.in/api/users/8
 https://reqres.in/api/users/8 not equals https://reqres.in/api/users/9`


**Note**
The src/main/java directory contains the source code of our unit tests.
The src/test/java directory contains the resources of our unit tests.

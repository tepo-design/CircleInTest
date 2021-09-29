# CircleIn Coding Challenge
Tessa Podbury 
<br>
GitHub repo: https://github.com/tepo-design/CircleInTest
<br>
29/09/2021
<br>

Technologies used and required:
- Java 8
- Vue JS & npm
- Maven

BackEnd runs on Port 8081.
FrontEnd runs on Port 8080.


Steps to run BackEnd:
- cd into Challenge folder
- run 'mvn install'
- run 'mvn spring-boot:run'
- (run 'mvn test' to only run the tests)

Steps to run FrontEnd:
- cd into frontend folder (located Challenge/src/frontend)
- run 'npm install'
- run 'npm run production'

Steps to access application:
-   In your browser, navigate to http://localhost:8080

## Aim of this Application
The aim of this application for me was to build a simple app with a Java backend that had the ability to iterate over a webpage and find the frequency of a specific word using API calls.
Following on from that, I wanted to implement a simple UI.
I have recently been learning about SpringBoot, so I thought I would take this as a good learning experience to develop my skills and see where the limitations in my knowledge lie.
Similarly, I do not have much experience with Vue JS or implementing API functionality from the FrontEnd, so I was excited by the learning I got out of this exercise!
<br><br>
I aimed to do TDD and I started well. However, my knowledge gaps showed with having to implement some tests at a later date.
I was really happy I got the API calls to work and to produce the desired result of the application.
<br>
However, I think I have a lot to learn in terms of best practice for Springboot. Something I pondered over was whether it was bad practice to not include an Entity in the Springboot App or whether it was unnecessary for such lightweight functionality.
Not implementing an Entity, however, probably limited how much testing I could do on the Controller without having a Service.
One argument I had against an Entity was that webpage content is dynamic and can change over time. Due to this, it seemed like unnecessary code to implement iteration over a database to update entries in this application.
In the future, I would look into that more and investigate the best practices for this.
<br>
I was happy I was able to get the Vue functionality working without ever having done it before, and I would be really excited to study and learn more of the FrontEnd to keep that learning going.
Again, in the future, I would investigate and learn best practice on how to test the functionality of the UI at a deeper level rather than just having validation checks on the forms and completing manual testing.

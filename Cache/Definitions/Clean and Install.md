In order to create a .jar file that is easily run, similar to a .exe file you must use the maven commands **Clear** and **Install**. Once these commands have been inputted into the maven comand line or the maven widget in intellij, the .jar file should be placed under the .m2/repository folder. 

From there you can run the .jar file using the command: `java -jar`
# Make sure to cd into the target directory

Commands look like this:

```
 mvn clean install
 cd target
 java -jar backend-0.0.1-SNAPSHOT.jar

```

rmdir /s /q idbs_mars_rover
call git clone https://github.com/maxdcampbell/idbs_mars_rover
cd idbs_mars_rover
call mvn package
java -cp target/idbs_mars_rover-1.0-SNAPSHOT.jar com.codemanship.marsrover.Program

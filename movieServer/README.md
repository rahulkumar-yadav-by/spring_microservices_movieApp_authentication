# Movie App
=> Movie Server => Eureka Server
// Eureka Clients
=> Authentication Service => Signup, Login  => h2 Database => cloud.properties

=> Movie Service =>  Movie Crud => Add, Finding Movies => MongoDB  => cloud.properties



//-----------------------------------------------------------------//

## # Monolithic Architecture
Single Container forming an application

    MOVIE APP :
    -> Login feature
    -> Signup feature
    -> Add Movie
    -> Get movies

#### Challenges

    -> Inflexible : Cant use different technologies to form the app
	-> Unreliable : One feature of the system doesnt work entire system doesnt work
	-> Unscalable : Every time you have to rebuild application and scale it (increase the virtual memory 
                    or processing capacity on it)
	-> Blocking :	During development -> signup -> add address field -> rebuild
	-> Slow Build : Deployment time/build time is slow.


# 2. Microservices Architecture
#### Multiple containers forming a block

    MOVIE APP :
    -> Login service : SpringBoot with H2Database -> not running -> dont have to rebuild for scaling/
                       updating a feature -> build time low

	-> Signup service : SpringBoot with MongoDB -> running
	-> Add Movie : 		NodeJs with MySQL -> running

//modified name
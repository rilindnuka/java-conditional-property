# java-conditional-property
A repository that uses conditional properties to run selected interfaces

The applications has 3(three) MapService implementations that implement the same interface. 

Reasoning behind the application is to show the appropriate way on how to implement different services that follow the same rule.
## Controller
The controller has an injected `MapService` interface that returns the simple message upon calling the endpoint `localhost:8080/api/map`


## Services
The services provided offer no functionality but it is demonstrated how the application works
#### LogOnly
To select this interface you simply remove the lines from `application.yml`
or use the appropriate key for this interface which is `log`
#### Google
To select this interface you simply adjust the `application.yml`
and use the appropriate key for this interface which is `google`
#### OSM
To select this interface you simply adjust the `application.yml`
and use the appropriate key for this interface which is `osm`

#### Example

```
application:
    map: google
```
<h1>About Spring-boot</h1>

<h2>Tight Coupling and lose coupling</h2>
> ***Tight Coupling*** means one class is dependent on another class. Loose Coupling means one class is dependent on
interface rather than class.<br>
> In ***Tight coupling***, there are hard-coded dependency declared in methods.<br>
> In loose coupling, we must pass dependency externally at runtime instead of hard-coded.<br>

>In Spring-Boot lose coupling is preferred because it
gives an edge during unit testing.<br> To do lose coupling,
dependency injector comes into picture.

<h2>Dependency Injector</h2>
>It means giving control to Spring to handle dependencies.<br>
> To add dependency we use pom.xml which is similar to pubspec.yaml in flutter.<br>
>IOC: Inversion of Control. Which can be done via:<br>
> - Annotation based Configuration.
> - JAVA based Configuration.
> - XML Configuration.<br>
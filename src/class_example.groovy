import groovy.transform.Canonical

//@ToString
//@EqualsAndHashCode
@Canonical
// Include ToString and EqualsAndHashCode
class Person {

    String firstName;
    String lastName;
}

Person person1 = new Person(firstName: "Santiago", lastName: "Mattiauda")
Person person2 = new Person(firstName: "Santiago", lastName: "Mattiauda")
Person person3 = new Person('Santiago', 'Mattiauda')

//println("Person: ${person.toString()}")
println("Person 1 is equal Person 2: ${person1 == person2}")

Set setSample = [person1, person2, person3]
println("Team: ${setSample.size()}")
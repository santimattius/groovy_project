//def numbers = [9, 8, 7, 6, 1, 2, 3, 4, 5] as SortedSet
def numbers = [1, 2, 3, 4, 5]
println numbers

println "-- for in --"
for (n in numbers) {
    println n
}

println "-- each --"
numbers.each { num ->
    println num
}

println "-- collections operators --"
println numbers.collect { it * 2 }
        .findAll { it % 3 }
        .sum()

println "-- maps --"
def map = [a: 1, b: 2, c: 3]

//put values
map.d = 4
map['e'] = 5
map.put('f', 6)

println map

map.each { e -> println "${e.key}:${e.value}" }
map.each { k, v -> println "$k:$v" }


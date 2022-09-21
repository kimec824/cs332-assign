type Set = Int => Boolean
//val singletonSet: Int => Int => Boolean = elem => input => elem == input
def singletonSet(elem: Int): Set = input => input == elem
def union(s: Set, t: Set): Set = elem => s(elem) || t(elem)
def filter(s: Set, p: Int => Boolean): Set = elem => s(elem) && p(elem)
//  elem이 p를 만족하고 s에 속하면 true
val a = singletonSet(3)

a(3)
a(4)
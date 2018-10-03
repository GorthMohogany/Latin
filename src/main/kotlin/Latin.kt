open class Word(
        var principalParts: Array<PrincipalPart>?,
        var inflectedEndings: Array<InflectedEnding>?
    ) {
    constructor() : this(null,null)
}

class PrincipalPart(var value: String) {
}


// declension (nouns, pronouns, adjectives) -> gender, number, case
// conjugation (verbs) -> gender, number, person, tense, voice, mood, aspect

// common traits: gender, number



interface InflectedEnding {
    var value: String
    var gender: Gender
    var number: GrammaticalNumber

}

//class Noun() : Word(PrincipalPart(), "") {
//}

//class Verb(): Word()
//
//
//
//open class Conjugation(
//        override var gender: Gender,
//        override var number: GrammaticalNumber
//        ) : InflectedEnding {
//}


enum class Gender {
    MASCULINE, FEMININE, NEUTER
}

enum class GrammaticalNumber {
    SINGULAR, PLURAL
}


fun main(args: Array<String>) {
    var word = Word()
}

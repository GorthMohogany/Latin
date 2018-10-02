

//class Noun() : Word(PrincipalPart(), "") {
//
//}

open class Word(val principalParts: Array<PrincipalPart>?, var inflectedEndings: Array<InflectedEnding>?) {
    constructor() : this(null,null)
}

class PrincipalPart() {

}


// declension (nouns, pronouns, adjectives) -> gender, number, case
// conjugation (verbs) -> gender, number, person, tense, voice, mood, aspect

// common traits: gender, number



interface InflectedEnding {

    var gender: Gender
    var number: GrammaticalNumber

}

open class Conjugation(
        override var gender: Gender,
        override var number: GrammaticalNumber
        ) : InflectedEnding {

}


enum class Gender {
    MASCULINE, FEMININE
}

enum class GrammaticalNumber {
    SINGULAR, PLURAL
}


fun main(args: Array<String>) {
    var word = Word()
}

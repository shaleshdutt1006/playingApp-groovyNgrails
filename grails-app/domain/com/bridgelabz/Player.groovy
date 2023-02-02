package com.bridgelabz

class Player {

    static belongsTo= [team: Team]
    String name    
    Integer age
    String position

    static constraints = {
        name size: 5..40, blank: false
        age min: 18
        position size: 5..40, blank: false
    }
    String toString(){
        name
    }
}

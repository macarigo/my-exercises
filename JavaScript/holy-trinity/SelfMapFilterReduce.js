let characters = [
    { name: "John", email: "john_the_one@gmail.com", age: 18 },
    { name: "Diane", email: "princess.diane@gmail.com", age: 43 },
    { name: "Snoop", email: "hip-hop@gmail.com", age: 4 },
    { name: "Ice T", email: "OG_ice@gmail.com", age: 14 },
    { name: "Vanilla Ice", email: "wannabeIce@gmail.com", age: 216 },
    { name: "Eminem", email: "theOne@gmail.com", age: 17 },
];

function filter (callback) {

    let result = [];

    for(let i = 0; i < characters.length; i++) {
        if (callback(characters[i])) {
            result.push(characters[i])
        }
    }

    return result;

}

console.log(filter((char) => char.age > 18) );
console.log(filter((char) => char.name == "Snoop"))

console.log(characters.filter((char) => char.age > 18));
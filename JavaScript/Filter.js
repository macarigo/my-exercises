let characters = [
    { name: "John", email: "john_the_one@gmail.com", age: 18 },
    { name: "Diane", email: "princess.diane@gmail.com", age: 43 },
    { name: "Snoop", email: "hip-hop@gmail.com", age: 4 },
    { name: "Ice T", email: "OG_ice@gmail.com", age: 14 },
    { name: "Vanilla Ice", email: "wannabeIce@gmail.com", age: 216 },
    { name: "Eminem", email: "theOne@gmail.com", age: 17 },
];

const criteria = {
    age: 18,
    email: "gmail.com",
};

function filter(characters, criteria) {

    let result = []

    characters.forEach(element => {
        
        if(element.email.split("@")[1] === criteria.email && element.age >= criteria.age) {
            result.push(element.name)
        }

    });

    return result;

}

console.log(filter(characters, criteria));
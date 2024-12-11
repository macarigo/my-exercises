const users = require("./users.js");

let resultFilter = users.filter((user) => user.id % 2 !== 0) 

// console.log(resultFilter);

let resultMap = users.reduce((map, user) => map.set(user.id, user), new Map())

// console.log(resultMap[7])

let indexMap = []

indexMap = users.map((user) => {
    user.id = users.indexOf(user)
    return user;
} )

console.log(indexMap)

// The id of the user should be the index of the user in the array;
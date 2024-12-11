let result = CharacterExists("Supercalifragilisticexpialidocious", "z");

function CharacterExists(string, char) {
    for (let i = 0; i < string.length; i++) {
        if (string[i] === char) {
            return true;
        }
        
    }
    return false;
}

console.log(result);
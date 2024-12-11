

function generateNewColour() {
    const letters = '0123456789ABCDEF';
    let colour = '#';
    for (let i=0; i<=5; i++) {
        colour+= letters[Math.floor(Math.random()*16)];
    }
    return colour;  
}

function applyNewColour () {
    const columns = document.querySelectorAll('.col');

    columns.forEach((column) => {
        column.style.backgroundColor = generateNewColour();
    })
}


window.onload = applyNewColour;
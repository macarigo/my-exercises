const playRound = document.getElementById("playButton");

const player1Image = document.getElementById("player1img");
const player2Image = document.getElementById("player2img");

const images = {"rock":"assets/rock.png", "paper":"assets/paper.png", "scissors":"assets/scissors.png"};

const options = ["rock", "paper", "scissors"];

let player1Score = 0;
let player2Score = 0;


function generateChoice() {
    let randomNumber = options[Math.floor(Math.random() * 3)];
    return randomNumber;
}

function playGame() {

    let player1 = generateChoice(); // 0 -> rock
    let player2 = generateChoice(); // 2 -> scissors

    console.log(player1);
    console.log(player2);

    player1Image.src = images[player1];
    player2Image.src = images[player2];

    console.log(player1Image);
    console.log(player2Image);

    switch (player1) {
        case "rock":
            if(player2 === "paper") {
                player2Score++;
            }
            if(player2 === "scissors") {
                player1Score++;
            }
        case "paper": 
            if(player2 === "rock") {
                player1Score++;
            }
            if(player2 === "scissors") {
                player2Score++;
            }
            
        case "scissors": 
            if(player2 === "rock") {
                player2Score++;
            }
            if(player2 === "paper") {
                player1Score++;
            }   
    };

};


playRound.addEventListener("click", playGame);

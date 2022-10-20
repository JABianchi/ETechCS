 //Count the number of clicks
 let colorClick = "";
 const redChoice = document.getElementById("red-button");
 const greenChoice = document.getElementById("green-button");
 const blueChoice = document.getElementById("blue-button");

 redChoice.addEventListener("click", () => {
     playerChoice = "red";
     console.log(playerChoice);
     return playerChoice;
});

 greenChoice.addEventListener("click", () => {
     playerChoice = "green";
     console.log(playerChoice);
     return playerChoice;
 });
 
 blueChoice.addEventListener("click", () => { 
     playerChoice = "blue";
     console.log(playerChoice);
     return playerChoice;
 });
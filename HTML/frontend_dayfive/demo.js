const h1 = document.querySelector("h1");
h1.style.color = "red";

const para = document.getElementById("para");
para.style.fontSize = "30px";
para.style.color = "aqua";

// for id put # on query selector
const para = document.querySelector("#para") 

// for class put . on queryselector
const para = document.querySelector(".class") 

const body = document.querySelector("body");
const dark = document.querySelector("#dark-mode");
const light = document.querySelector("#light-mode");

function darkMode() {
  body.style.backgroundColor = "black";
  body.style.color = "white";
}

function lightMode() {
  body.style.backgroundColor = "white";
  body.style.color = "black";
}

light.addEventListener("click", lightMode);
dark.addEventListener("click", darkMode);

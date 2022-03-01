const createGreetingFn = (message) => {
  const greeting = message;
  const greet = () => greeting;
  return greet;
};

window.onload = () => {
  const hello = createGreetingFn("Hello");
  const welcome = createGreetingFn("Welcome");
  const howAreYou = createGreetingFn("How are you?");
  const goodBye = createGreetingFn("Goodbye");
  document.getElementById("hello").innerHTML = hello();
  document.getElementById("welcome").innerHTML = welcome();
  document.getElementById("how-are-you").innerHTML = howAreYou();
  document.getElementById("goodbye").innerHTML = goodBye();
};

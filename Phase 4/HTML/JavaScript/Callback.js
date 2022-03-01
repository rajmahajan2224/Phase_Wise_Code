const calculate = (x, y, callbackFn) => {
  return callbackFn(x, y);
};

const add = (x, y) => {
  return x + y;
};

const subtract = (x, y) => {
  return x - y;
};

const multiply = (x, y) => {
  return x * y;
};

const divide = (x, y) => {
  return x / y;
};

const mod = (x, y) => {
  return x % y;
};

window.onload = () => {
  const sum = calculate(1, 2, add);
  const difference = calculate(1, 2, subtract);
  const product = calculate(1, 2, multiply);
  const quotient = calculate(1, 2, divide);
  const modulus = calculate(1, 2, mod);
  document.getElementById("sum").innerHTML = sum;
  document.getElementById("difference").innerHTML = difference;
  document.getElementById("product").innerHTML = product;
  document.getElementById("quotient").innerHTML = quotient;
  document.getElementById("modulus").innerHTML = modulus;
};

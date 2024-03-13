let calculationHistory = [];

function appendToDisplay(value) {
    document.getElementById('display').value += value;
}

function clearDisplay() {
    document.getElementById('display').value = '';
}

function calculate() {
    const expression = document.getElementById('display').value;
    const result = eval(expression);

    addToHistory(expression + ' = ' + result);
    clearDisplay();
    document.getElementById('display').value = result;
}

function calculatePercentage() {
    const expression = document.getElementById('display').value;
    const result = eval(expression) / 100;

    addToHistory(expression + '% = ' + result);
    clearDisplay();
    document.getElementById('display').value = result;
}

function calculateSquareRoot() {
    const expression = document.getElementById('display').value;
    const result = Math.sqrt(eval(expression));

    addToHistory('√(' + expression + ') = ' + result);
    clearDisplay();
    document.getElementById('display').value = result;
}

function calculatePower() {
    const expression = document.getElementById('display').value;
    const result = eval(expression) ** 2;

    addToHistory('(' + expression + ')² = ' + result);
    clearDisplay();
    document.getElementById('display').value = result;
}

function addToHistory(calculation) {
    calculationHistory.push(calculation);
    renderHistory();
}

function renderHistory() {
    const historyList = document.getElementById('history-list');
    historyList.innerHTML = '';

    calculationHistory.forEach(calculation => {
        const listItem = document.createElement('li');
        listItem.textContent = calculation;
        historyList.appendChild(listItem);
    });
}
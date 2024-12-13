
const url = "http://localhost:8080/javabank5/api/customer";

  function getData(url) {
    fetch(url)
        .then((response) => response.json())
        .then((data) => populateTable(data))
        .catch((error) => console.error(error));
}

function populateTable (data) {
    const tableBody = document.querySelector("#tbody");
    tableBody.innerHTML = "";

    data.forEach((element) => {
        const row = document.createElement("tr");

        const firstNameCell = document.createElement("td");
        firstNameCell.textContent = element.firstName;
        row.appendChild(firstNameCell);

        const lastNameCell = document.createElement("td");
        lastNameCell.textContent = element.lastName;
        row.appendChild(lastNameCell);

        const emailCell = document.createElement("td");
        emailCell.textContent = element.email;
        row.appendChild(emailCell);

        const phoneCell = document.createElement("td");
        phoneCell.textContent = element.phone;
        row.appendChild(phoneCell);

        const editButton = row.insertCell();
        editButton.innerHTML = '<button type="submit" class="btn btn-success">Edit</button>';
        
        const deleteButton = row.insertCell();
        deleteButton.innerHTML = '<button type="submit" class="btn btn-danger">Delete</button>';

        tableBody.appendChild(row);

    });

        const editButtons = document.querySelector(".btn");
    editButtons.forEach((button) =>
        button.addEventListener("mousedown", (event) => {
            const firstName = event.target.dataset.firstName;
            const customer = data.find((customer) => cust.firstName == firstName);
            populateForm(customer);
        })
    );    
}

function populateForm (customer) { //update button
    const firstNameInput = document.getElementById("firstName");
    const lastNameInput = document.getElementById("lastName");
    const emailInput = document.getElementById("email");
    const phoneInput = document.getElementById("phone");

    if (firstNameInput) firstNameInput.value = customer.firstName;
    if (lastNameInput) lastNameInput.value = customer.lastName;
    if (emailInput) emailInput.value = customer.email;
    if (phoneInput) phoneInput.value = customer.phone;
}

getData(url);

const form = document.getElementById(id);
form.addEventListener("mousedown", populateForm);


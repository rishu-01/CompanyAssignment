function submitForm() {
    // Validation
    if (document.getElementById("surveyForm").checkValidity()) {
        // Get form values
        var firstName = document.getElementById("firstName").value;
        var lastName = document.getElementById("lastName").value;
        var dob = document.getElementById("dob").value;
        var country = document.getElementById("country").value;
        var gender = Array.from(document.querySelectorAll('input[type=checkbox]:checked')).map(e => e.value).join(", ");
        var profession = document.getElementById("profession").value;
        var email = document.getElementById("email").value;
        var mobileNumber = document.getElementById("mobileNumber").value;

        // Display response in popup
        var responseText = `First Name: ${firstName}<br>
        Last Name: ${lastName}<br>
        Date of Birth: ${dob}<br>
        Country: ${country}<br>
        Gender: ${gender}<br>
        Profession: ${profession}<br>
        Email: ${email}<br>
        Mobile Number: ${mobileNumber}`;
        document.getElementById("responseText").innerHTML = responseText;
        document.getElementById("popup");

        // Reset the form
        document.getElementById("surveyForm").reset();
    }
}

function closePopup() {
    document.getElementById("popup").style.display = "none";
}

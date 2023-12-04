function handleLogin1(){
    window.location.href='../Home_page/home.html';
}
function validateForm() {
    var password = document.getElementById("password").value;

    // Check if the password contains at least one uppercase letter and one lowercase letter
    if (!/[A-Z]/.test(password) || !/[a-z]/.test(password)) {
        alert("Password must contain at least one uppercase letter and one lowercase letter.");
        return false; // Prevent form submission
    }

    // You can add more password requirements checks if needed

    return true; // Allow form submission if all checks pass
}
function validatePassword() {
    var passwordInput = document.getElementById("password").value;
    
    // Define the regex pattern for the password
    var passwordPattern = /^(?=.*[a-z])(?=.*[A-Z])/;

    // Test the password against the pattern
    if (passwordPattern.test(passwordInput)) {
        alert("Password is valid!");
    } else {
      // Create an array to store validation messages
      var messages = [];

      // Check individual requirements and add messages accordingly
      if (!/(?=.*[a-z])/.test(passwordInput)) {
          messages.push("At least one lowercase letter is required.");
      }
      if (!/(?=.*[A-Z])/.test(passwordInput)) {
          messages.push("At least one uppercase letter is required.");
      }

      // Display the alert with the compiled messages
      alert("Password is invalid. " + messages.join(" "));
  }
} 
function handlelogin1(){
    validatePassword();
} 

// Attach the function to the form submission or any other appropriate event
// For example, if you want to validate the password on form submission:
document.querySelector("form").addEventListener("submit", function(event) {
    event.preventDefault(); // Prevent the form from submitting
    validatePassword();
}); 
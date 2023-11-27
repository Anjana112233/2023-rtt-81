function handleLogin1(){
    window.location.href='../Home_page/home.html';
}
function validatePassword() {
    var passwordInput = document.getElementById("password").value;
    
    // Define the regex pattern for the password
    var passwordPattern = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$/;

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
      if (!/(?=.*\d)/.test(passwordInput)) {
          messages.push("At least one digit is required.");
      }
      if (!/(?=.*[@$!%*?&])/.test(passwordInput)) {
          messages.push("At least one of @$!%*?& is required.");
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
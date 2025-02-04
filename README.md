Voice to Text Chatbox Interface

This project is a simple chatbox interface that allows users to interact with a chatbot using both text and voice input. The chatbox is designed with a user-friendly interface, and it communicates with a backend API to process the text input and return a response.
Features

    Text Input: Users can type messages to the chatbot, which processes and returns a response.
    Voice Input: Users can use voice input to communicate with the chatbot, leveraging the browser's speech recognition API.
    API Integration: The chatbot sends the text input to a backend server that processes the text and sends a response.

Technologies Used

    Frontend: HTML, CSS, JavaScript
    Backend: Java (Spring Boot)
    Speech Recognition: Web Speech API (SpeechRecognition)

How It Works

    Text Messages: The user can type a message in the chatbox. When the message is sent, it is sent to the backend API (POST /api/voice/text), which processes the text and returns a response.
    Voice Messages: Users can click the microphone button to start voice recognition. The voice input is converted to text and sent to the backend API, which responds with a text message.
    API: The backend API receives the text and returns a response which is displayed in the chatbox.

Running the Project
Prerequisites

    Java 8 or higher
    Spring Boot
    A modern web browser (for voice recognition support)

Frontend

    Open the HTML file in any modern web browser.
    Ensure that the browser has support for the Web Speech API (SpeechRecognition).

Backend

    Clone the repository:

git clone <repository_url>

Navigate to the backend project directory and build the project:

mvn clean install

Run the Spring Boot application:

    mvn spring-boot:run

    The backend API will be available at http://localhost:8081/api/voice/text.

Endpoints

    POST /api/voice/text
        Request Body: A JSON object containing the text message.

{ "text": "Hello, chatbot!" }

Response: A string message returned by the chatbot.

        { "response": "Hello, user!" }

Voice Recognition

This project uses the Web Speech API's SpeechRecognition feature to allow users to send voice input. Please note that this feature may not be supported in all browsers.

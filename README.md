
# Voice to Text Chatbox Interface

This project is a simple chatbox interface that allows users to interact with a chatbot using both text and voice input. The chatbox is designed with a user-friendly interface and communicates with a backend API to process the text input and return a response.

## Features

- **Text Input**: Users can type messages to the chatbot, which processes and returns a response.
- **Voice Input**: Users can use voice input to communicate with the chatbot, leveraging the browser's speech recognition API.
- **API Integration**: The chatbot sends the text input to a backend server that processes the text and sends a response.

## Technologies Used

- **Frontend**: HTML, CSS, JavaScript
- **Backend**: Java (Spring Boot)
- **Speech Recognition**: Web Speech API (SpeechRecognition)

## How It Works

1. **Text Messages**: The user can type a message in the chatbox. When the message is sent, it is sent to the backend API (`POST /api/voice/text`), which processes the text and returns a response.
2. **Voice Messages**: Users can click the microphone button to start voice recognition. The voice input is converted to text and sent to the backend API, which responds with a text message.
3. **API**: The backend API receives the text and returns a response that is displayed in the chatbox.

## Running the Project

### Prerequisites

- Java 8 or higher
- Spring Boot
- A modern web browser (for voice recognition support)

### Frontend

1. Open the HTML file in any modern web browser.
2. Ensure that the browser has support for the Web Speech API (SpeechRecognition).

### Backend

1. Clone the repository:
   ```bash
   git clone <repository_url>
   ```
2. Navigate to the backend project directory and build the project:
   ```bash
   mvn clean install
   ```
3. Run the Spring Boot application:
   ```bash
   mvn spring-boot:run
   ```
4. The backend API will be available at `http://localhost:8081/api/voice/text`.

## Endpoints

- **POST /api/voice/text**
   - **Request Body**: A JSON object containing the text message.
     ```json
     { "text": "Hello, chatbot!" }
     ```
   - **Response**: A string message returned by the chatbot.
     ```json
     { "response": "Hello, user!" }
     ```

## Voice Recognition

This project uses the Web Speech API's SpeechRecognition feature to allow users to send voice input. Please note that this feature may not be supported in all browsers.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

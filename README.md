
# Pos Website Test Automation

This repository contains automated test cases for the Pos Malaysia website using Selenium, TestNG, and WebDriverManager.

## Prerequisites

- Java 22
- Maven
- Chrome Browser

## Setup

1. Clone the repository

https://github.com/sumudu8398/pos-Malaysia

2. Navigate to the project directory

3. Run the tests using Maven


## Test Cases

1. **Verify that Pos website offers to buy Insurance**
- Go to pos.com.my
- Scroll down to the section "What can Pos Malaysia do for you, today?" and click on the button "Buy Insurance"
- Verify that a new page is open in a new tab with the URL `insurance.pos.com.my`
- Verify that the buttons "I drive a car" and "I ride a motorcycle" can be clicked and reveal a section with five fields.

2. **Verify that Pos website has links to create e-Consignment note**
- Go to pos.com.my
- Click on the menu bar "Send" > "Parcel"
- Scroll down and click on "Create shipment now" button under the Cash section
- Verify that the new page loaded is the e-Consignment Note form with URL `https://send.pos.com.my/home/e-connote?lg=en`
- Verify the presence of Sender Info, Receiver Info, Parcel Info, and Summary sections.

## Author

- Sumudu Dahanayake

## License

This project is licensed under the MIT License.

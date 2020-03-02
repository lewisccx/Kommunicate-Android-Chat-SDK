<img align="center" src="https://9to5toys.com/wp-content/uploads/sites/5/2019/01/ubtech-walker-cruzr-ces-3.jpg?resize=1024,512" width="900" />

## Android Chatbot with Dialogflow, google speech-to-text (MinSdk 19) 

An Open Source Android Live Chat SDK for Customer Support

## Project Overview

This project aims to deliver an intelligent chatbot application that is deployable on the service robot which would 

roam around SIT@NYP campus, as part of our SIT@NYP Living Lab project initiatives. 

With the chatbot application, the service robot will be enabled to answer SIT student queries, based on the student's 

personal situation, such as eligible bursary schemes, module exemption/pre-requisites/co-requisites planning, etc. 

Hence the chatbot needs to be equipped with a knowledge base on the relevant information of SIT. 

## Get Started

To get started with the App, head over to the Google and [Signup](https://support.google.com/mail/answer/56256?hl=en) an Google account.

This app implements the Kommunicate android chat SDK. To use this app you need to provide your application ID in app level build.gradle file's defaultConfig [Refer here](https://github.com/Kommunicate-io/Kommunicate-Android-Chat-SDK/blob/f78948edd81124847d1b6ee2179eadd968ec57b1/app/build.gradle#L13). Replace <Your-APP_ID> with the application ID obtained from Kommunicate dashboard.

## Integrate Dialogflow Conversational AI into the app

You can connect your Dialogflow chatbot with Kommunicate in the following 4 simple steps. [Here](https://www.kommunicate.io/blog/build-chatbot-with-dialogflow-android-sdk/) is a step by step blog to add Kommunicate SDK in your Android app. 

### Step 1: Get your API credentials from Dialogflow (A valid credit card is needed)
- Login to Dialogflow console using the Google Account registered previously and select your agent from the dropdown in the left panel.
- Click on the settings button. It will open a setting page for the agent.
- Inside the general tab search for GOOGLE PROJECTS and click on your service account.
- After getting redirected to your SERVICE ACCOUNT, create a key in JSON format for your project from the actions section and it will get automatically downloaded.
- Enable Google speech-to-text service
    - log into GCP and search Google speech-to-text
    - enable it for your project 
 
### Step 2: Create a student Kommunicate account
Talk to an Kommunicate customer service officer online [Here](https://www.kommunicate.io/) and provide your student ID and email

### Step 3: Integrate your Dialogflow chatbot with Kommunicate
- In the Bot integrations section, choose Dialogflow. A popup window will open.
- Upload your Key file here and proceed.
- Give a name and image to your chatbot. It will be visible to the users chatting with your chatbot.
- Enable/Disable chatbot to human handoff. If enabled, it will automatically assign conversations to humans in case the chatbot is not able to answer.

### Step 4: Install the Kommunicate Android SDK to your app
You can add the Kommunicate SDK in your Android app easily. More information on how to integrate with your Andriod app [here](https://docs.kommunicate.io/docs/android-installation.html). 

> Note: Here's a [sample chatbot](https://docs.kommunicate.io/docs/bot-samples) for you to get started with Dialogflow. 


## Other Features

**Live chat widget:**  Make it easier for your visitors and users to reach you with an instant website and in-app support through chat. The widget is highly customizable. 

**Chatbots:** Automate and speed up your customer service by integrating AI-powered chatbots. Build your chatbots and deploy them using Kommunicate and seamlessly add them in the live chat.

**Conversations:** Manage all your customer queries coming from the live chat plugin. Easily manage and assign agents to cater to user conversations.

**Dashboard:** A powerful dashboard to see, analyze and act upon your customer conversation data. Helps you analyze the performance of support agents as well.

**Helpcenter:** Create your knowledge base and deploy on a dedicated page to cater to generic and recurring customer queries. Your customers will also be able to directly access FAQs in chat.

**Mailbox:** A simple and powerful team inbox for ticketing, managing, receiving and replying to all your customer support emails. 

**Integrations:** Easily move data between Kommunicate and your other favorite apps. Integrate your favorite CRM, knowledge base software and other apps.

**Conversation Routing:** Select routing rules for incoming conversations for both your agents and bots. Choose between automatic assignments or to notify all.

**Smart Rich Messaging:** Leverage rich messages using buttons, cards, carousels, forms or lists to provide an exquisite support chat experience to your customers.

**Quick Replies:** Quickly respond to generic user queries using Quick Replies. Easily create and manage templated messages from your dashboard.


## Technical Documentation

Detailed instructions for installing, configuring and customizing the Kommunicate Android SDK are [availble here](https://docs.kommunicate.io/docs/android-installation.html).


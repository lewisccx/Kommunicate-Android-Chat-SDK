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
Talk to an Kommunicate customer service officer online [here](https://www.kommunicate.io/) and provide your student ID and email

### Step 3: Integrate your Dialogflow chatbot with Kommunicate
- In the Bot integrations section, choose Dialogflow. A popup window will open.
- Upload your Key file here and proceed.
- Give a name and image to your chatbot. It will be visible to the users chatting with your chatbot.
- Enable/Disable chatbot to human handoff. If enabled, it will automatically assign conversations to humans in case the chatbot is not able to answer.

### Step 5: Install the App on Cruzr

- Export to APK File: Build / Build bundle(s)/APK(s) / Build APK(s)

- follow the guide [here](http://tinyurl.com/sittraining24apr) /SIT Training/Development Training/Cruzr SDK Tutorial Guide.docx to get started with Cruzr. 

- follow the guide [here](https://developer.android.com/studio/command-line/adb) for more ADB command

## Other resouces/references

[Google Speech Android Sample App](https://github.com/GoogleCloudPlatform/android-docs-samples/tree/master/speech/Speech)  


[Google Speech Android Demo](https://github.com/sujitpanda/Google-Cloud-Speech-API)

## Folder Structure

Most logic codes can be found in 
- **kommunicateui/conversation/fragment/stt**
- **kommunicateui/conversation/fragment/MobiComConversationaFragment**

## Contact Us

There is no Us, only Me - **lewis.caocx@gmail.com**

## Credentials

- Please contact lewis.caocx@gmail.com for existing Google Credentials and Kommunicate Account



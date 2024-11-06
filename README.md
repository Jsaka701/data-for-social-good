# Unit 3 - Data for Social Good Project 

## Introduction 

Software engineers develop programs to work with data and provide information to a user. Each user has different needs based on the information they are looking for from data. Your goal is to create a data analysis program for your user that stores and analyzes data to provide the information they need. 

## Requirements 

Use your knowledge of object-oriented programming, one-dimensional (1D) arrays, and algorithms to create your data analysis program: 
- **Write a class** – Write a class to represent your user or business and store and analyze their data with no-argument and parameterized constructors. 
- **Create at least two 1D arrays** – Create at least two 1D arrays to store the data that your user needs information about. 
- **Write a method** – Write a method that finds or manipulates the elements in a 1D array to provide the information your user needs. 
- **Implement a toString() method** – Write a toString() method that returns general information about the data (for example, number of values in the dataset). 
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions. 

## User Story 

Include your User Story you analyzed for your project here. Your User Story should have the following format: 

> As an [role], As a professional DJ on the radio
> I want to [goal], identify top songs throughout past years through a given year from 1960-Now.
> so that I can [benefit]. create a top-hit radio channel for listeners to enjoy


## Dataset 

Include a hyperlink to the source of your dataset used for this project. Additionally, provide a short description of each column used from the dataset, and the data type. 

Dataset: https://www.kaggle.com/datasets/sansuthi/global-co2-emissions 
- **Name** (String) - name of the song
- **Artist** (String) - name of the Artist of the song 
- **Release Date** (int) - carbon dioxide emission in kilotons 

## UML Diagram 

![UML Diagram for my project](UMLDIAGRAM.png) 

## Description 

My project takes a dataset that we used from gagle of current top 10000 songs from the year 1960 to Present Time. What my project does is it ask a user to input the date they would want to see the top songs still from the year inputed through the users input. My project uses the printSongsByYear method created in order to scan each array for the year inputed to match in the array to pull out each and every song that matches. This pulls out the song name and artist as well printing it out in a list of all the songs that came out in that year that are currently top songs till now. My project as well prints out the total number of songs in that list as well from the year ented. This allows for dj from our User Story in order to analyze top songs that are still trending all the way from 1960s to have a variety of taste from different eras. He will be able to see the total of songs and which year had the most hits.
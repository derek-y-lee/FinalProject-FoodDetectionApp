![alt text](https://previews.123rf.com/images/bdcollins/bdcollins1408/bdcollins140800228/30927502-random-foods-collage-isolated-over-white.jpg)

# Homework 4 Food Recognition App: ReadMe

### Acknowledgement must be given to Google® for their open source provisions, most notably the [mlkit](https://github.com/firebase/quickstart-android) package.
### MEMBER CONTRIBUTIONS:
##### Sean worked on most of the code and graphs in Q1 and github troubleshooting
##### Derek worked on elaborating more details in Q1 and testing for Q2 to ensure the app worked for Mac OS.
##### Ellen worked on the majority of setting up the app in Q2

##### NOTE: for reproducibility, please be sure to follow instructions below
##### NOTE: make sure you sign into your gmail account via Google Chrome on the emulator once it starts
##### NOTE: upload any test images onto your Google Drive beforehand so you can access it via Google Drive in the emulator

##### 1. Install the latest version of Android Studio® which can be found [online](https://developer.android.com/studio/install)

##### 2. Clone (or fork, then clone) the [hw4](https://github.com/seancampeau/hw4) repository to your local machine's Android Studio® working directory.

##### 3. Open Android Studio® and install updates, especially when it prompts you install the SDK packages.
  
##### 4. In Finder (Mac), locate the 'm280' folder within the cloned repo and copy the "google-services.json" file and paste it in mlkit > app folder. For some reason, Mac deletes the .json file from the m280 > mlkit > app folder. 

![alt text](https://i.imgur.com/iwRWVPH.png)

##### 5. Import the files as a project, and specifically import the mlkit folder by going to Android Studio® and navigating to File > New > Import Project 

![alt text](https://i.imgur.com/hvG4eCR.png)

##### 6. Android Studio® will now automatically build the app.

##### 7. On the top right corner in the Android Studio IDE, locate the green play button next to the dropdown menu that displays "mlkit-app" to Run Java.

##### 8. Click on "Create New Virtual Device" Use Nexus 5X for its naturally larger resolution and once you select Nexus 5X, download Android 8.1 "Oreo".  

##### 9. Then, once the emulator loads, select StillImageActivity > Take Photo > Select image from album  > navigate to the Google Drive folder with the test images by toggling the upper left logo with the horizontal bars. Select the image and the app should display text describing what objects are in the image.


##### This was a collaborative effort between Sean Campeau, Ellen Do and Derek Lee. Acknowledgements specific to each task in the assignment can be found in the hw4.Rmd file.
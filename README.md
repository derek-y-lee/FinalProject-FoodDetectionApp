# Homework 4 Food Recognition App: ReadMe

### Acknowledgement must be given to Google® for their open source provisions, most notably the [mlkit](https://github.com/firebase/quickstart-android) package.

##### Responsibilities: Everyone contributed to all parts of the project, but number 1 was mainly done by Sean and the app (number 2) was mainly completed by Ellen and Derek.


##### NOTE: For reproducibility, please be sure to follow instructions below after the remaining notes:

##### NOTE: Make sure you sign into your Gmail account via Google Chrome on the emulator once it starts. To return to the app, click on the square button on the bottom right and scroll through apps till you find the mlk-test app.

##### NOTE: Upload any test images onto your Google Drive beforehand so you can access it via Google Drive in the emulator.

##### NOTE: The app will prompt you to update Google Play services, please do so.

##### NOTE: If you run into any build errors, make sure that the packages have been installed and the google-services.json has been placed in the app folder within mlkit (mlkit>app) and then try to run again.


##### 1. Install the latest version of Android Studio® which can be found [online](https://developer.android.com/studio/install).

##### 2. Clone (or fork, then clone) the [hw4](https://github.com/seancampeau/hw4) repository to your Android Studio® working directory in your local machine.

##### 3. Open Android Studio® (Create New Project option) and wait for it to build. Install any updates (including when it prompts you to install the SDK packages) though this may happen when you actually import the actual project we want (Step 5).

![alt text](https://i.imgur.com/fYs8mm1.png)

##### Do not opt for Instant Run. Alternatively if you accidentally did so, simply go to Android Studio > Preferences and navigate to the Instant Run sidebar option where you can select to uncheck the "Enable Instant Run."

![alt text](https://i.imgur.com/1ibb5oR.png)
  
##### 4. In Finder (Mac), locate the "hw4-master" folder within the cloned repository and copy the "google-services.json" file and paste it in mlkit > app folder. (macOS deletes the .json file from the m280 > mlkit > app folder, so this must be done manually).

##### 5. Import the files as a project, and specifically import the mlkit folder by going to Android Studio® and navigating to File > New > Import Project and selecting the "m280" folder within the "hw4-master" folder. Alternatively, you can Open Project if the previous doesn't work.

![alt text](https://i.imgur.com/hvG4eCR.png)

![alt text](https://i.imgur.com/VFEMeO6.png)

##### 5.5. Click next throughout the process (see images below as guide). The SDK installation is probably at this step. There will likely be a prompt to configure Kotlin. Just select that message and click on the Java module version.

![alt text](https://i.imgur.com/8az58I7.png)

![alt text](https://i.imgur.com/HT2zDEC.png)

![alt text](https://i.imgur.com/NpbrQjR.png)

##### 6. Android Studio® will now automatically build the app, but now you have to open up the emulator.

##### 7. On the top right corner in the Android Studio IDE, locate the green play button next to the dropdown menu that displays "mlkit-app" to Run Java.

![alt text](https://i.imgur.com/mVN62Z2.png)

##### 8. Click on "Create New Virtual Device." Use Nexus 5X for its naturally larger resolution. 

![alt text](https://i.imgur.com/bXJMJjO.png)

##### Once you select Nexus 5X, download Android 8.1 "Oreo". This may take a while.

![alt text](https://i.imgur.com/iuK7RpJ.png)


##### 9. Once the emulator loads, sign in first to your Google Drive in the Google Chrome browser in the emulator. In the repository, there's a folder called "images" that you should upload into your Google Drive for test purposes. This can be uploaded outside of Android Studio. To return to the app, click on the square button on the bottom right and scroll through the apps till you find the mlk-test app once you have the images uploaded in Google Drive. 


##### 10. In the emulator, select StillImageActivity > Take Photo > Select image from album > navigate to the Google Drive folder "images" with the test images by toggling the upper left logo with the horizontal bars. Select the image and the app should display text describing what objects are in the image.

![alt text](https://i.imgur.com/etDfMnP.png)

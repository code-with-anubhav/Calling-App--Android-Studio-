# Android Calling App

An Android Calling App built using **Java** and **XML** to manage and initiate phone calls efficiently. This app demonstrates how to integrate Android's telephony features to create a functional calling application with a simple and intuitive user interface.

---

## Features

- **Call Initiation:** Easily make phone calls by entering a number or selecting one from a list.
- **Call Logs:** Access recent call history.
- **Contact Integration:** Option to select contacts directly from the phonebook.
- **Custom Dialer:** A clean and simple custom dialer interface.
- **Permission Handling:** Handles runtime permissions for call functionalities.

---

## Requirements

- **Android Studio:** Version 4.0 or above
- **Android SDK:** API Level 21 (Lollipop) or higher
- **Java JDK:** Version 8 or higher

---

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/<your-username>/android-calling-app.git
   ```
2. Open the project in **Android Studio**.
3. Sync the project with Gradle files.
4. Run the app on an emulator or physical device.

---

## Permissions

The app requires the following permissions to function correctly. Ensure they are declared in the `AndroidManifest.xml` file:

```xml
<uses-permission android:name="android.permission.CALL_PHONE" />
<uses-permission android:name="android.permission.READ_CONTACTS" />
<uses-permission android:name="android.permission.READ_CALL_LOG" />
```

Runtime permissions are also handled for API Level 23 and above.

---

## Usage

1. Launch the app on your Android device.
2. Use the custom dialer to enter a phone number or select a contact.
3. Tap the call button to initiate the call.
4. Access call logs for your recent calls.

---

## Code Highlights

### Dialer Activity
This activity manages the custom dialer interface and handles call initiation.

```java
Intent callIntent = new Intent(Intent.ACTION_CALL);
callIntent.setData(Uri.parse("tel:" + phoneNumber));
if (ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
    startActivity(callIntent);
} else {
    ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL_PERMISSION);
}
```

### Contacts Integration
Contacts are accessed using the `ContentResolver` API:

```java
Cursor cursor = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null);
while (cursor.moveToNext()) {
    String name = cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME));
    String number = cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
    // Add contact details to the list
}
cursor.close();
```

---

## Screenshots

Include screenshots of the app here to showcase the custom dialer, call logs, and other features.

---

## Contributing

1. Fork the repository.
2. Create a new branch:
   ```bash
   git checkout -b feature-name
   ```
3. Make your changes and commit them:
   ```bash
   git commit -m "Added a new feature"
   ```
4. Push to the branch:
   ```bash
   git push origin feature-name
   ```
5. Open a pull request.

---

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

## Contact

For any inquiries or suggestions, feel free to contact:

- **Email:** [anubhavsahu6620@gmail.com](mailto:anubhavsahu6620@gmail.com)
- **GitHub:** [code-with-anubhav](https://github.com/code-with-anubhav)

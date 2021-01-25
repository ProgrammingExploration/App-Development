import 'package:flutter/material.dart';

void main() {
  runApp(App());
}

class App extends StatelessWidget {
  Widget build(BuildContext context) {
    return MaterialApp(
        title: 'Sample App',
        darkTheme: ThemeData.dark(),
        home: Text('Hello',
            textAlign: TextAlign.center,
            style: TextStyle(
                color: Colors.blue,
                decoration: TextDecoration.none,
                fontWeight: FontWeight.bold)));
  }
}

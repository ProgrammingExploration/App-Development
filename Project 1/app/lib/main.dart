import 'package:app/components/navigation.dart';
import 'package:flutter/material.dart';

void main() {
  runApp(App());
}

class App extends StatelessWidget {
  Widget build(BuildContext context) {
    return MaterialApp(
      theme: ThemeData(
        brightness: Brightness.dark,
        primaryColor: Colors.blueGrey,
      ),
      home: Scaffold(
          appBar: AppBar(
            title: Text('Facebook Clone'),
            centerTitle: true,
          ),
          body: Navigation()),
    );
  }
}

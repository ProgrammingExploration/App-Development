import 'package:flutter/material.dart';

import './pages/about.dart';
import './pages/home.dart';
import './pages/stats.dart';

enum Pages { HOME, STATS, ABOUT }

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
          title: Text('Navigation App'),
          centerTitle: true,
        ),
        body: Navigation(),
      ),
    );
  }
}

class Navigation extends StatefulWidget {
  @override
  _Navigation createState() => _Navigation();
}

class _Navigation extends State<Navigation> {
  Pages page = Pages.HOME;

  void setHome() {
    setState(() {
      page = Pages.HOME;
    });
  }

  void setAbout() {
    setState(() {
      page = Pages.ABOUT;
    });
  }

  void setStats() {
    setState(() {
      page = Pages.STATS;
    });
  }

  Widget build(BuildContext context) {
    return Column(
      children: [
        Row(
          mainAxisAlignment: MainAxisAlignment.spaceEvenly,
          children: [
            RaisedButton(child: Text('Home'), onPressed: setHome),
            RaisedButton(child: Text('Stats'), onPressed: setStats),
            RaisedButton(child: Text('About'), onPressed: setAbout),
          ],
        ),
        PageWidget(page: page)
      ],
    );
  }
}

class PageWidget extends StatelessWidget {
  final Pages page;

  PageWidget({Key key, @required this.page}) : super(key: key);

  Widget build(BuildContext context) {
    if (page == Pages.HOME) {
      return Home();
    } else if (page == Pages.STATS) {
      return Stats();
    } else if (page == Pages.ABOUT) {
      return About();
    } else {
      return Text('Error');
    }
  }
}

import 'package:app/pages/home.dart';
import 'package:app/pages/profile.dart';
import 'package:app/pages/user.dart';
import 'package:flutter/material.dart';

enum Pages { HOME, USER, PROFILE }

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

  void setUser() {
    setState(() {
      page = Pages.USER;
    });
  }

  void setProfile() {
    setState(() {
      page = Pages.PROFILE;
    });
  }

  Widget build(BuildContext context) {
    return Column(
      children: [
        Row(
          mainAxisAlignment: MainAxisAlignment.spaceEvenly,
          children: [
            RaisedButton(
              child: Text('Home'),
              onPressed: setHome,
            ),
            RaisedButton(
              child: Text('User'),
              onPressed: setUser,
            ),
            RaisedButton(
              child: Text('Profile'),
              onPressed: setProfile,
            ),
          ],
        ),
        Page(page: page),
      ],
    );
  }
}

class Page extends StatelessWidget {
  final Pages page;

  Page({Key key, @required this.page}) : super(key: key);

  Widget build(BuildContext context) {
    if (page == Pages.HOME) {
      return Home();
    } else if (page == Pages.USER) {
      return User();
    } else if (page == Pages.PROFILE) {
      return Profile();
    } else {
      return Text('Error');
    }
  }
}

const NAME = 'Om';

void main() {
  dynamic x = 1;
  x = 'Hi';
  x = true;
  x = {'Hello': 'Hi'};
  x = ['Hi', 'Bye', 'Hello', 'Hola'];
  print(x);

  String name = "Hi";
  print('My name is $name');
  int dollars = 50;
  print('I have \$$dollars');
  bool isMarried = false;
  double wallet = 150.3;

  List<String> names = ['Om', 'Billy'];

  List<dynamic> anything = [
    'Hi',
    5,
    true,
    {'Hi': 'Hi'}
  ];
}

void print_hello() {
  print('Hello');
}

int add(int x, int y) {
  return x + y;
}

List<String> create_list(String name1, String name2, String name3) {
  return [name1, name2, name3];
}

class Person {
  String name;
  int age;
  bool isMarried;

  Person(String name, int age, bool isMarried) {
    this.name = name;
    this.age = age;
    this.isMarried = isMarried;
  }

  void grow() {
    this.age += 1;
    /*
    int curr_age = this.age + 1;
    this.age = curr_age;
    */
  }

  void set_name(String new_name) {
    this.name = new_name;
  }
}

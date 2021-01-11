import './code.dart';

void main() {
  print_hello();
  print(NAME);
  print(add(1, 3));
  print(create_list('Hi', 'Hello', 'Hola'));

  Person om = Person('Om', 13, false);
  print(om.age);
  om.grow();
  print(om.age);
  om.set_name('hi');
  print(om.name);
}

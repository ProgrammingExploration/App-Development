void main() {
  Printer printer = new Printer('Printer 1', 50);
  print(printer.__repr__());
  printer.print(50);
  print(printer.pages_left);
  printer.stock();
  print(printer.pages_left);
}

class Printer {
  String name;
  bool connected;
  int pages_total;
  int pages_left;

  Printer(String printer_name, int pages) {
    // No need for 'this.' if the variable names and parameters are different
    pages_left = pages;
    name = printer_name;
    connected = false;
    pages_total = pages;
  }

  String __repr__() {
    return '$name has $pages_left pages left';
  }

  void print(int pages) {
    pages_left = pages_left - pages; // pages_left = pages_left - pages;
  }

  void stock() {
    pages_left = pages_total;
  }
}

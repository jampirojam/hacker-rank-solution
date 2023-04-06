
@Test
void testDua() {
  List<Double> objects = new ArrayList<>();
  objects.add(104.4);
  objects.add(114.11);
  objects.add(10.8);
  objects.add(4.88);
  objects.add(10.7);
  objects.add(42.1);
  objects.add(102.1);
  objects.add(14.1);

  objects.stream().map(Double::doubleValue).sorted().forEach(System.out::println);
}

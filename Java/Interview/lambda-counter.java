@Test
void test() {
  List<Integer> objects = List.of(1, 2, 2);
  Function<List<Integer>, Integer> function = x -> x
    .stream()
    .map(i -> i * 2)
    .mapToInt(i -> i)
    .distinct()
    .sum();

  Function<Integer, Integer> function2 = x -> x * 10;
  Function<Integer, Integer> function3 = x -> x * 100;

  int len = function.andThen(function2).andThen(function3)
    .apply(objects);

  System.out.println(objects);
  System.out.println(len);
}

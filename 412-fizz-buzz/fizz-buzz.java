class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> fizzbuzz = new ArrayList<>();

        for(int i = 1; i <= n; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                fizzbuzz.add("FizzBuzz");
            } else if (i % 5 == 0) {
                fizzbuzz.add("Buzz");
            } else if (i % 3 == 0) {
                fizzbuzz.add("Fizz");
            } else {
                fizzbuzz.add(String.valueOf(i));
            }
        }

        return fizzbuzz;
    }
}
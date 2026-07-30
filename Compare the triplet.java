//compare the triplet - java
// Difficulty - Easy
// Hacker rank - DSA problem
public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int alice = 0;
        int bob = 0;
        for(int i = 0; i < a.size(); i++){
            if(a.get(i) > b.get(i)) alice++;
            else if(a.get(i) < b.get(i) ) bob++;
            else {
                alice += 0;
                bob += 0;
            }
        }
        List<Integer> result = new ArrayList<>();
        result.add(alice);
        result.add(bob);
        
        return result;

    }

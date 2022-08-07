package LeetCode;

public class intersectionofTwoArrays {


   /*     List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j] && ! list.contains(nums1[i])){
                    list.add(nums1[i]);
                }
            }
        }
        int[] res = list.stream()
                            .mapToInt(Integer::intValue)
                            .toArray();

    return res;*/


//         HashSet<Integer> set1= new HashSet<>();
//          for(int i=0;i<nums1.length;i++){
//          set1.add(nums1[i]);
//          }
//    //   System.out.println("HashSet1: " + set1);

//         HashSet<Integer> set2= new HashSet<>();
//          for(int i=0;i<nums2.length;i++){
//          set2.add(nums2[i]);
//          }
//        //   System.out.println("HashSet1: " + set2);
//         set1.retainAll(set2);
//          // System.out.println("HashSet1: " + set1);
//          int[] res = set1.stream()
//                             .mapToInt(Integer::intValue)
//                             .toArray();
//         return res;


  /*  HashSet<Integer> set1=new HashSet<>();
    HashSet<Integer> ansSet=new HashSet<>();

        for(int i=0; i<nums1.length;i++){
        set1.add(nums1[i]);
    }


        for(int i=0;i<nums2.length;i++){
        if(set1.contains(nums2[i])){
            ansSet.add(nums2[i]);
        }
    }
    int size=ansSet.size();
    int j=0;
    int[] res = new int[size];
        for(Integer in:ansSet){
        res[j++]=in;
    }
   return res;*/
}

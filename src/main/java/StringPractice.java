public class StringPractice {
    public static void main(String[] args) {
        String str ="Thank you for downloading java";
        System.out.println(str.contains("you"));

        String[] s1=str.split("d");
        for(int i=0;i< s1.length;i++)
        {
            System.out.println(s1[i]);
        }
        for(String st: s1)
        {
            System.out.println(st);
        }

        System.out.println("harini changes ");
        System.out.println("new branch harini");
        System.out.println("feature changes harini");



int[][] nums=new int[2][3];
        nums[0][0]=30;
        nums[1][0]=40;
        nums[0][1]=50;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j< nums[i].length;j++)
            {
                System.out.println(nums[i][j]);
            }
        }

        for(int[] temp:nums){
            for(int n:temp)
            {
                System.out.println(n);
            }
        }
        System.out.println("changes to main branch ");

        int[][] ds={
                    {2,5,3},
                     {5,6,7},
                      {5,9,1}
                    };


        System.out.println("========================");

        int[][] arr={{19,5},{6,7},{8,9},{10,11}};

        for(int[] temp1:arr){
            for(int n1:temp1)
            {
                System.out.println(n1);

            }
        }
        //String[]git  names={"Rutika","Vaibhav","Arjun","1234"};
        printGreeting("rutika");
<<<<<<<
        printGreeting("Arjun");

=======
        printGreeting("Arjun","Vaibhav");
>>>>>>> 9d1caf3344f4c60a1416c851a7878b7329c9af59
    }
    public static void printGreeting(String... name)
    {
        for(String n :name){
        System.out.println("Hello "+n);}
    }
}

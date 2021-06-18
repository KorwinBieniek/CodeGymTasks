package com.codegym.task.task38.task3807;

@Deprecated      //+

/* 
Predefined annotation types

*/

public class Solution {

    @Deprecated       //+
    private String[] arguments;

    @SafeVarargs      //+
    @Deprecated       //+
    public Solution(String... arguments) {
        this.arguments = arguments;
    }

    @Deprecated           //+
    public void voidMethod() throws Exception {
    }

    @Deprecated        //+
    public static void main(String[] args) throws Exception {
        new Solution().new SubSolution().voidMethod();
    }

    @Deprecated         //+
    class SubSolution extends Solution {

        @Deprecated    //+
        @Override
        public void voidMethod() throws Exception {
            super.voidMethod();
        }
    }
}

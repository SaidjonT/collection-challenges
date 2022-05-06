package collection.challenges;

import java.util.*;

public class Challenges {


    //You must complete the implementation of these methods so that unit test pass.

    /*
        Given an array nums, return a new array where only unique sorted values exist
    */
    public int[] uniqueValues(int[] nums){
        int count = 1;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                count++;
            }
        }
        return nums;
    }


    /*
        Given an array nums, return the max value. If the array is empty, simply return -1
    */
    public int maxFromArray(int[] nums){
        if(nums!=null){

            int max = nums[0];
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > max) {
                    max = nums[i];
                }
            }
            return max;
        }
        return -1;
    }

    /*
        Given a list of String elements, return a new list where there are only elements that have more than 3 chars
    */
    public List<String> charsOver3(List<String> list){

        for(int i = 0; i < list.size() - 1; i++)
        {
            if(list.get(i).length() <= (list.get(i + 1).length()))
            {
                list.remove(i);
            }
            else
            {
                list.remove(i + 1);
            }
        }

        return list;
    }

    /*
        Given two lists, return a new list where only unique elements from 2 lists exist
    */
    public List<Integer> addTwoLists(List<Integer> list1, List<Integer> list2){

        list1.retainAll(list2);
        return list1;
    }

    /*
        Given String str, return how many 'ab' repeats in this str. You can ignore case sensitivity
    */
    public int repeatAbCount(String str) {

        String findStr = "ab";
        int lastIndex = 0;
        int count = 0;

        while (lastIndex != -1) {

            lastIndex = str.indexOf(findStr, lastIndex);

            if (lastIndex != -1) {
                count++;
                lastIndex += findStr.length();
            }
        }
        return count;

    }


    /*
        Given the argument list, return the difference between the largest and the smallest values.
        In case of empty list, return -1
    */
    public int bigDiff(List<Integer> list){
        if (!list.isEmpty()){
            int max = Collections.max(list);
            int min = Collections.min(list);
            int diff = max - min;

            return diff;
        }
        return -1;
    }

    /*
        Given two lists, calculate their averages separately and return the largest of them.
        Return 0 in case both lists are empty
    */
    public double maxAverage(List<Integer> list1, List<Integer> list2){

        if (list1 !=null && list2 != null) {
            int sum1 = 0, sum2 = 0;

            for (int i = 0; i < list2.size(); i++) {
                sum2 = sum2 + list2.get(i);
            }
            for (int i = 0; i < list1.size(); i++) {
                sum1 = sum1 + list1.get(i);
            }

            double avg1 = sum1 / list1.size();
            double avg2 = sum2 / list2.size();

            return Math.max(avg1, avg2);
            }
        return 0;
    }

    /*
        Given a list of String values and leng, return the number of elements that have the same length as leng
    */
    public int wordsCount(List<String> list, int leng){

        int count = 0;
        int a = 0;
        while (a < list.size()) {
            String str = list.get(a);
            if (str.length() == leng) {
                count++;
            }
            a++;
        }
        return count;
    }

    /*
        Given int num, return a list where it contains values from 0 to num (excluded)
    */
    public List<Integer> fillArr(int num){

        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < num) {
            list.add(i);
            i++;
        }
        return list;
    }
}

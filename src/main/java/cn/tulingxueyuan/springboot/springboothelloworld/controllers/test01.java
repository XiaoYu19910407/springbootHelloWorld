package cn.tulingxueyuan.springboot.springboothelloworld.controllers;

public class test01 {
    public static void main(String[] args) {
        int [] nums = new int[]{1,2,34,4,45,56};
        sleepSort(nums);

    }

    /**
     * 多线程同时睡眠排序法
     * @param nums
     */
    public static void sleepSort(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            final int num = nums[i];
            new Thread(()->{
                try {
                    Thread.sleep(num);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(num);
            }).start();

        }
    }
}

package com.sourcerebels.tool.hashpe;

public class HashPasswordEncoderTool {


    public static void main(String[] args) throws Exception {

        String encoded = ShaUtility.make("123456", ShaUtility.SHA256);
        System.out.println("encoded: " + encoded);
    }

}

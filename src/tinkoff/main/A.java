package tinkoff.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//
public class A {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        String s = bufferedReader.readLine();
        String colors = bufferedReader.readLine();
        String[] s1 = s.split(" ");
        int ans = 0;
        int c = 0;


        System.out.println(ans);
    }
}


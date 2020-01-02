package com.apress.prospring5.ch5;

import com.apress.prospring5.ch2.common.Singer;

public class Guitarist implements Singer {
    private String lyric = "You're gonna live forever in me";
    public void sing() {
        System.out.println(lyric);
    }
}

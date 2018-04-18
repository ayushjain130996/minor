package com.example.ayush.restaurant;

/**
 * Created by ayush on 04/18/2018.
 */

    public class Menu {

    private String mMenuName;
    private int mMenuImage;

    public Menu(String menuName,int menuImage)
    {
        mMenuName=menuName;
        mMenuImage=menuImage;
    }


    public String getMenuName() {
        return mMenuName;
    }

    public int getMenuImage() {
        return mMenuImage;
    }

}


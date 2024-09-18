package controller;

import com.perscholas.controller.findUser_Hql;

public class App
{
    public static void main( String[] args )
    {
        findUser_Hql u = new findUser_Hql();
        // u.findUser();
        u.findUserSelect();
    }
}
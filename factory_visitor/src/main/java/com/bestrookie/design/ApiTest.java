package com.bestrookie.design;

import com.bestrookie.design.visitor.impl.Parent;
import com.bestrookie.design.visitor.impl.Principal;

/**
 * @author bestrookie
 * @date 2022/1/5 2:19 下午
 */
public class ApiTest {
    public static void main(String[] args) {
        DataView dataView = new DataView();
        dataView.show(new Parent());

        dataView.show(new Principal());
    }
}

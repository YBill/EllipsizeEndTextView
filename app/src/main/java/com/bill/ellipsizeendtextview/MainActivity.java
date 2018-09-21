package com.bill.ellipsizeendtextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private EllipsizeEndTextView content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        content = findViewById(R.id.text_view);
        content.setText("据中新网消息，近日不少市民反映多数快递员都存在不送货上门的情况，为了省事，直接将包裹放在快递柜里。" +
                "而快递柜又都从免费变为收费了。这些快递柜收费的形式各不相同。有的快递柜是双向收费，有的是单向收费。" +
                "例如，丰巢快递柜就是双向收费模式，即快递员存件要付费，用户超过 4 小时未取支付 1 元。而云柜则是快递员寄件收费，用户取件免费的模式。");
    }
}

package designpatterns.itelect2c.mbtitest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


import designpatterns.itelect2c.factory.Type;
import designpatterns.itelect2c.factory.TypeDescription;
import designpatterns.itelect2c.factory.TypeFactory;

public class EvaluateActivity extends AppCompatActivity {
    TextView tv_type;
    TextView tv_desc;
    TextView scoreresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluate);
        tv_desc = findViewById(R.id.tv_desc);
        tv_type = findViewById(R.id.tv_type);
        scoreresult = findViewById(R.id.scoreresult);
        Bundle bundle = getIntent().getExtras();
        String type = bundle.getString("type");
        TypeFactory typeFactory = new TypeFactory();
        Type typeDescriptionGenerator = typeFactory.makeType(type);
        MBTIscores mbtIscores = (MBTIscores) getIntent().getSerializableExtra("scores");
        if(typeDescriptionGenerator!=null){
            TypeDescription typeDescription= typeFactory.makeType(type).generateType();
            tv_type.setText(typeDescription.getType());
            tv_desc.setText(typeDescription.getDesc());
            scoreresult.setText(mbtIscores.getScores());
        }
    }
}

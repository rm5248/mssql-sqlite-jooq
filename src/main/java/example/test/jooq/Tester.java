package example.test.jooq;

import com.example.dbgenerated.tables.records.ExampledataRecord;

public class Tester {

    public static void main(String[] args){
        ExampledataRecord rec = new ExampledataRecord();
        rec.setFloatdata( (float)1.0 );
    }

}

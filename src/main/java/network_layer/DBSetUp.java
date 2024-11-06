package network_layer;
import com.mongodb.*;
import io_layer.IOJsonUtils;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.google.common.collect.Lists;

public class DBSetUp {
    public static void main(String[] args) {

        final String SOLAR_SYSTEM = System.getenv("SOLAR_SYSTEM");
        MongoClient mongoDBConnector = new MongoClient("127.0.0.1", 27017 );
        DB db = mongoDBConnector.getDB("solar_system");
        if (!db.collectionExists("stars")) {
            IOJsonUtils jsonUtils = new IOJsonUtils();
            try {
                JSONObject solarSystemData = jsonUtils.readSchema(SOLAR_SYSTEM);
                List<String> stars = Lists.newArrayList(solarSystemData.keys());
                for(String starName : stars) {
                    DBCollection table = db.getCollection(starName);
                    JSONObject starData = solarSystemData.getJSONObject(starName);
                    List<String> starDetails = Lists.newArrayList(starData.keys());
                    BasicDBObject document = new BasicDBObject();
                    for (String informationItem : starDetails){
                        document.put(informationItem, starData.get(informationItem));
                    }
                    table.insert(document);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
       }

        System.out.println(SOLAR_SYSTEM);
    }

    public static void databaseMonitor(MongoClient mongoDBConnector, DB db) {
        mongoDBConnector.getDatabaseNames().forEach(dbName -> System.out.println("Db name : " + dbName));
        db.getCollectionNames().forEach(dbName -> System.out.println("Collection name : " + dbName));
    }
}

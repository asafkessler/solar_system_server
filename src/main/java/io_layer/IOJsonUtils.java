package io_layer;

import jdk.internal.util.xml.impl.ReaderUTF8;
import org.json.JSONObject;
import org.apache.commons.io.IOUtils;

import java.io.*;

public class IOJsonUtils {

    public IOJsonUtils() {
    }

    public static JSONObject readSchema(String schemaFile) throws IOException {
        FileInputStream inputStream = new FileInputStream(schemaFile);
        String jsonData = IOUtils.toString((inputStream));
        JSONObject jsonObject = new JSONObject(jsonData);
        return (jsonObject);
    }
}

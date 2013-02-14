package com.fastorm.logging.util;

import android.os.Environment;

import javax.inject.Inject;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLClientInfoException;

public class LoggingUtils {

    @Inject
    private static File mFile;

    public LoggingUtils(File file){
        mFile = file;
    }

    public static File createLogFile(File file){
        mFile = Environment.getExternalStorageDirectory();
        file = new File(mFile, "log.txt");

        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if(file.exists() && file.length() > 100000){
            file.delete();
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return file;
    }

    public static void writeLogFile(File file, String message, Throwable throwable){
        mFile = createLogFile(file);

        try {
            FileWriter writer = new FileWriter(mFile,true);
            writer.write(throwable + " " + message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static File getFile(){
        return mFile;
    }
}

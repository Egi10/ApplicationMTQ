package com.example.egi_fcb.applicationmtq.Package_Alquran;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.egi_fcb.applicationmtq.R;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class Activity_Alquran extends AppCompatActivity {

    public static String DB_FILEPATH = "arabic.sql";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alquran);
    }

    public boolean importDatabase(String dbPath) throws IOException{

        File newDB = new File((dbPath));
        File oldDB = new File(DB_FILEPATH);

        if(newDB.exists()){
            FileUtils.copyFile(new FileInputStream(newDB), new FileOutputStream(oldDB));
        }

        return false;
    }

    public static class FileUtils {
        /**
         * Creates the specified <code>toFile</code> as a byte for byte copy of the
         * <code>fromFile</code>. If <code>toFile</code> already exists, then it
         * will be replaced with a copy of <code>fromFile</code>. The name and path
         * of <code>toFile</code> will be that of <code>toFile</code>.<br/>
         * <br/>
         * <i> Note: <code>fromFile</code> and <code>toFile</code> will be closed by
         * this function.</i>
         *
         * @param fromFile
         *            - FileInputStream for the file to copy from.
         * @param toFile
         *            - FileInputStream for the file to copy to.
         */
        public static void copyFile(FileInputStream fromFile, FileOutputStream toFile) throws IOException {
            FileChannel fromChannel = null;
            FileChannel toChannel = null;
            try {
                fromChannel = fromFile.getChannel();
                toChannel = toFile.getChannel();
                fromChannel.transferTo(0, fromChannel.size(), toChannel);
            } finally {
                try {
                    if (fromChannel != null) {
                        fromChannel.close();
                    }
                } finally {
                    if (toChannel != null) {
                        toChannel.close();
                    }
                }
            }
        }
    }
}

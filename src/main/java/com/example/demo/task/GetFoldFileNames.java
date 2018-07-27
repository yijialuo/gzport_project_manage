package com.example.demo.task;

import java.io.File;
import java.util.List;

/**
 * Created by yijialuo on 2018/4/24.
 */
public class GetFoldFileNames {

    public static File[] getFileName(String path) {
        File f = new File(path);
        return f.listFiles();

    }
}

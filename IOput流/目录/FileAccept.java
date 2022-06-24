package 目录;

import java.io.File;
import java.io.FilenameFilter;

public class FileAccept implements FilenameFilter {//文件名过滤器接口
    private String extendName;

    public void setExtendName(String s){
        extendName = "." + s;
    }

    public boolean accept(File dir, String name){//实现该接口必须重写该方法
        return name.endsWith(extendName);
    }
}

package Ŀ¼;

import java.io.File;
import java.io.FilenameFilter;

public class FileAccept implements FilenameFilter {//�ļ����������ӿ�
    private String extendName;

    public void setExtendName(String s){
        extendName = "." + s;
    }

    public boolean accept(File dir, String name){//ʵ�ָýӿڱ�����д�÷���
        return name.endsWith(extendName);
    }
}

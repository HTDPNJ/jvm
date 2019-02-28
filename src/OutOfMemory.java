import java.util.ArrayList;
import java.util.List;

public class OutOfMemory
{ //java堆溢出示例
    //其中虚拟机参数如下： -XX:+HeapDumpOnOutOfMemoryError -Xms20m -Xmx20m
    public static void main(String[] args)
    {
        List<Demo> demoList=new ArrayList<>();
        while (true){
            demoList.add(new Demo());
        }
    }
}

public class StackOverflowError
{
    // -Xss218k 设置虚拟机栈容量
    //产生栈溢出
    private int stackLength=1;
    public void stackLeak(){
        stackLength++;
        stackLeak();
    }
    public static void main(String[] args)
    {
        StackOverflowError oom=new StackOverflowError();
        try{
            oom.stackLeak();
        }catch (Throwable e){
            System.out.println("stack length:"+oom.stackLength);
            throw e;
        }


    }
}

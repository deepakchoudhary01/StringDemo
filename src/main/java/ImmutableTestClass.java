final class ImmutableClassTest {
    private int i;
    ImmutableClassTest(int i){
        this.i=i;
    }

    public ImmutableClassTest modify(int i){
        if(this.i==i)
            return this;
        else
            return new ImmutableClassTest(i);

    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ImmutableClassTest t1=new ImmutableClassTest(10);
        ImmutableClassTest t2=t1.modify(110);
        ImmutableClassTest t3=t1.modify(10);
        System.out.println(t1==t2);
        System.out.println(t1==t3);
    }
}

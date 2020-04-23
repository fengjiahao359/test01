package cn.itcase4;

/**
 * @author:fjh
 * @Date: 22:46
 */
public class User {
    String name;
    Address addr;

    public User(String name, Address addr) {
        this.name = name;
        this.addr = addr;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==null || this.getClass()!=this.getClass()) return  false;
        if(this==obj) return true;
        User u=(User)obj;
        if(this.name.equals(u.name)&&this.addr.equals(u.addr))
        {
            return true;
        }
     else
         return false;

    }


}

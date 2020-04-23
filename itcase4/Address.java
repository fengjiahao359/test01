package cn.itcase4;

import java.util.Objects;

/**
 * @author:fjh
 * @Date: 22:46
 */
public class Address  {
    String dizhi;

    public Address() {
    }

    public Address(String dizhi) {
        this.dizhi = dizhi;
    }

//    @Override
//    public boolean equals(Object obj) {
//        Address address=(Address)obj;
//        return this.dizhi.equals(address.dizhi);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(dizhi, address.dizhi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dizhi);
    }
}

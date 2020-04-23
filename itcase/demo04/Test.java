package cn.itcase.demo04;

/**
 * @author:fjh
 * @Date: 16:53
 */
public class Test {
    public static void main(String[] args) {
        BulletProofDoor bulletProofDoor= new BulletProofDoor();
        bulletProofDoor.close();
        bulletProofDoor.fireProof();
        bulletProofDoor.open();
        FireProofDoor fireProofDoor=new FireProofDoor();
        fireProofDoor.open();
        fireProofDoor.fireProof();
        fireProofDoor.close();
    }
}

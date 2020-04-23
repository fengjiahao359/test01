package cn.itcase4;

/**
 * @author:fjh
 * @Date: 18:46
 */
public class Link {

    Node header;



    int size=0;
  public int   size(Node node){
      return size;

  }

    public void add(Object data){
          if(header==null)
          {
              Node header = new Node(data, null);
              System.out.println(header);

          }

          else {
                 Node s=findlast(header);
                 s.next=new Node(data,null);
              System.out.println(header);
          }
          size++;
    }

    @Override
    public String toString() {
        return "Link{" +
                "header=" + header +
                ", size=" + size +
                '}';
    }


    private Node findlast(Node node) {

        if(node==null)
        {
            return node;
        }
        else return node.next;
    }
}

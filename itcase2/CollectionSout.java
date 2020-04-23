package cn.itcase2;

import java.util.*;

/**
 * @author:fjh
 * @Date: 14:18
 */
public class CollectionSout {


    public static void main(String[] args) {
        List<String> list=new Vector<>();
        list.add("daskuyt");
        list.add("dasjhgj");
        list.add("dasgdg");
        list.add("dasdsad");
        list.add("dasa");
        System.out.println(list);
        List<Integer> list1=new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(100);
        list1.add(200);
        list1.add(1);
        list1.add(5);
        System.out.println(list1);
        List<Character> list2=new ArrayList<>();
        list2.add('a');
        list2.add('b');
        list2.add('A');
        list2.add('C');
        list2.add('d');
        System.out.println(list2);
        Set<String> s=new TreeSet<>();
        s.add("a");
        s.add("a");
        s.add("d");
        s.add("c");
        s.add("b");
        System.out.println(s);
        Set<Integer> s1=new HashSet<>();
        s1.add(1);
        s1.add(1);
        s1.add(1);
        s1.add(1);
        s1.add(1);
        System.out.println(s1);
        Set<Character> s2=new LinkedHashSet<>();
        s2.add('a');
        s2.add('b');
        s2.add('c');
        s2.add('A');
        s2.add('B');
        s2.add('5');
        s2.add('5');
        s2.add('5');
        s2.add('s');
        System.out.println(s2);
        int size = s2.size();
        System.out.println(size);
        Object[] objects = s2.toArray();
        System.out.println(objects);
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
        boolean contains = s2.contains('5');
        System.out.println(contains);
        System.out.println(s2);
         Collection<String> collection=new Vector<>();
          collection.add("dsad");
          collection.add("曹尼玛");
          collection.add("d啊啊啊");
          collection.add("d嘟嘟嘟");
          collection.add("dsad的撒旦");
          collection.add("dsad撒");
        System.out.println(collection);
        Iterator<String> iterator = collection.iterator();
          while (iterator.hasNext())
          {

              String next = iterator.next();
              System.out.println(next);
          }
        for (String s3 : collection) {
            System.out.println(s3);
        }
        ArrayList arrayList=new ArrayList();
            arrayList.add("e");
             arrayList.add(2);
        System.out.println(arrayList);

        Iterator iterator1 = arrayList.iterator();
        while(iterator1.hasNext())
        {
         if(iterator1.next().equals("e"))
         {
             iterator1.remove();
             

         }
            System.out.println(iterator1.next());
        }
        List<String> arrayList1=new ArrayList<>();
            arrayList1.add("a");
            arrayList1.add("c");
            arrayList1.add("b");
            arrayList1.add("a");
            arrayList1.add("a");
            arrayList1.add("a");
            arrayList1.add(3, "itheima");
        System.out.println(arrayList1);
        List<String> list3=new LinkedList<>();
           list3.add("我曹尼玛");
           list3.add("dsads");
           list3.add("gsfggsf");
           list3.add("我曹dsadas");
           list3.add("迪丽热巴");
           list3.add("胡歌");
           list3.add("琅琊榜");
        System.out.println(list3);
        list3.add("古力娜扎");
        System.out.println(list3);
           LinkedList<String> list4=(LinkedList)list3;
            list4.addFirst("爱情三十六计");
        System.out.println(list4);
        list4.addLast("我去尼玛的");
        System.out.println(list4);
        list4.pop();
        System.out.println(list4);
        list4.push("我去尼玛的");
        System.out.println(list4);
        String first = list4.getFirst();
        System.out.println(first);
        String last = list4.getLast();
        System.out.println(last);
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("我曹尼玛");
        hashSet.add("我曹尼玛dfgg");
        hashSet.add("我曹尼玛dsagf d");
        hashSet.add("我曹尼玛dsaj ");
        hashSet.add("我曹尼玛dsa ");
        Iterator<String> iterator2 = hashSet.iterator();
        while (iterator2.hasNext())
        {
            String next = iterator2.next();
            System.out.println(next);
        }
        for (String s3 : hashSet) {
            System.out.println(s3);
        }
        int i = hashSet.hashCode();
        System.out.println(i);
      Person person=new Person();
        int i1 = person.hashCode();
        System.out.println(i1);
        Person person1=new Person();
        int i2 = person1.hashCode();
        System.out.println(i2);
        String str="abc";
        String str1="abc";
        boolean b = str == str1;
        System.out.println(b);
        HashSet<String> hashSet1=new HashSet<>();
        hashSet1.add("abc");
        hashSet1.add("abc");
        hashSet1.add("重地");
        hashSet1.add("通话");
        hashSet1.add("通话");
        Iterator<String> iterator3 = hashSet1.iterator();
        while (iterator3.hasNext())
        {
            int i3 = iterator3.next().hashCode();
            System.out.println(i3);
        }
        Person person2=new Person("小明",28);
        Person person3=new Person("小明",28);
        System.out.println(person2.hashCode());
        System.out.println(person3.hashCode());
    }
}

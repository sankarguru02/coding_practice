import java.util.*;
class llist
{
    public static void main(String[] args)
    {
        System.out.println("linkedlist");
        LinkedList<String> list=new LinkedList<String>();
        list.add("rishi");
        list.add("hs");
        list.add("venky");
        list.add("guru");
        list.add("furvesh");
        System.out.println(list);
        list.remove("furvesh");
        Iterator<String> i=list.iterator();
        while(i.hasNext())
        {
        System.out.println(i.next());
    }
    
        System.out.println("Arraylist");
        ArrayList<String> ar=new ArrayList<>();
        ar.add("stephen");
        ar.add("harsha");
        for(String arrr:ar)
        {
            System.out.println(arrr);
        }
        System.out.println("Vector");
        Vector<String> v=new Vector<String>(3,2);
        v.add("ramya");
        v.add("preetha");
        v.add("gowri");
        System.out.println(v);
        v.removeElementAt(2);
        v.add("gowr");
        v.add("gow");
        v.add("go");
        v.add("g");
        v.add("gowri");
        System.out.println(v);

        System.out.println("Stack");
        Stack stk=new Stack();
        boolean result=stk.empty();
        System.out.println(stk);
        stk.push("bmw");
        stk.push("audi");
        result=stk.empty();
        System.out.println(stk);
        String a=(String)stk.peek();
        System.out.println(a);
        System.out.println(stk.peek());
        int location=stk.search("bmw");
        System.out.println(location);

        System.out.println("Queue");
        Queue<String> q=new LinkedList();
        q.add("sg");
        q.add("ni");
        q.add("ya");
        System.out.println(q);
        // System.out.println(q.remove());
        // System.out.println(q.element());
        System.out.println(q.poll());
        // System.out.println(q.peek());

        System.out.println("Priority Queue");
        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("sri");
        queue.add("swetha");
        queue.add("survesh");
        queue.offer("sankar");
        //System.out.println(queue.element());
        //System.out.println(queue.peek());
        //System.out.println(queue.poll());
        System.out.println(queue);

        System.out.println("Priority Queue");
        HashSet<String> h=new HashSet<>();
        h.add("one");
        h.add("two");
        Iterator<String> i2=h.iterator();
        while(i2.hasNext())
        {
            System.out.println(i2.next());
        }

        System.out.println("Linked Hashmap");
        LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();
        hm.put(1,"sankar");
        hm.put(2,"guru");
        hm.put(3,"sankarguru");
        //hm.remove(1);
        for(Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}
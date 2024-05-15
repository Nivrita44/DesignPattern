package CompositeDesignPattern.FileSystem;

import java.util.ArrayList;
import java.util.List;


public class directory implements component {

    private String name;
    private List <component> children;

    public int count = 0;

    public directory (String name){
        this.name = name;
        children = new ArrayList<>();

    }

    public void addComponent(component leaf) {
        children.add(leaf);
    }

    public void removeComponent(component leaf) {
        children.remove(leaf);

    }

//    public void getSize() {
//
//        count = count + children.size();
//        System.out.println ("Size :" +count);
//
//    }


    @Override
    public int getSize() {
        int totalSize = 0;
        for (component child : children) {
            child.getSize();
            totalSize = totalSize + child.getSize();
        }
        System.out.println("Size of " + name + ": " + totalSize);
        return totalSize;
    }

}

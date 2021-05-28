package com.codegym.task.task20.task2028;

import java.io.Serializable;
import java.util.*;

public class CustomTree extends AbstractList<String> implements Cloneable, Serializable {

    /**
     * The tree's root;
     */
    Entry<String> root;

    /**
     * A collection for storing tree nodes.
     */
    private transient ArrayList<Entry<String>> queue;

    /**
     * root is initialized by default; it becomes the first node designated as the "new root node for
     * the current level of the tree"; The newLineRootElement is always the tree's leftmost and bottommost node.
     */
    public CustomTree() {
        root = new Entry<String>(null);
        root.newLineRootElement = true;
        root.lineNumber = 0;
    }

    /**
     * The getParent method accepts a String argument called value, searches the tree for an Entry whose elementName
     * matches value, and then returns this Entry's elementName (Entry.parent)
     *
     * @param value The elementName of the passed Entry
     * @return parent.elementName of the found Entry (Entry.parent)
     */
    public String getParent(String value) {
        setValidCollection();
        String s = null;
        for (Entry<String> entry : queue) {
            if (entry.lineNumber != 1) {
                if (entry.elementName.equals(value)) {
                    s = entry.parent.elementName;
                    break;
                }
            }
        }
        return s;
    }

    /**
     * The setUpCollection method traverses the tree starting at Entry<String> root and writes all nodes into
     * queue;
     *
     * @param root The initial Entry<String> node for traversing the tree from top to bottom.
     */
    private void setUpCollection(Entry<String> root) {
        queue = new ArrayList<>();
        Queue<Entry<String>> subQueue = new LinkedList<Entry<String>>();
        queue.add(root);
        subQueue.add(root);
        do {
            if (!subQueue.isEmpty()) {
                root = subQueue.poll();
            }
            if (root.leftChild != null) {
                queue.add(root.leftChild);
                subQueue.add(root.leftChild);
            }
            if (root.rightChild != null) {
                queue.add(root.rightChild);
                subQueue.add(root.rightChild);
            }
        } while (!subQueue.isEmpty());

    }

    /**
     * The setValidCollection method writes the complete collection of tree nodes, and then removes one node from the collection,
     * the original root node.
     * This is used in the remove method and other methods to traverse the collection correctly.
     */
    private void setValidCollection() {
        setUpCollection(root);
        queue.remove(0);
    }

    @Override
    public String set(int index, String element) {
        throw new UnsupportedOperationException();
    }

    /**
     * The add method adds a node to the tree. First, the complete collection of nodes is established, then we
     * iterate over the nodes. During each iteration, the checkChildren method is used on each node to see if it might have
     * branches. isAvailableToAddChildren() returns true if it can; Then a new
     * Entry<String> is created, initialized, and added to the collection. After that, the collection is again
     * checked and initialized using setValidCollection();
     *
     * @param s A String that needs to be added to the collection;
     * @return true after the new node is added;
     */
    @Override
    public boolean add(String s) {
        setUpCollection(root);
        for (Entry<String> entry : queue) {
            entry.checkChildren();
            if (entry.isAvailableToAddChildren()) {
                createChild(entry, s);
                setValidCollection();
                return true;
            }
        }

        return false;
    }

    @Override
    public void add(int index, String element) {
        throw new UnsupportedOperationException();
    }

    /**
     * Additional method just in case. Sometimes when removing nodes you'll end up with 2 newLineRootElement nodes;
     * This method collects all these nodes from top to bottom and removes the newLineRootElement flag;
     *
     * @param entry An Entry<String> object whose newLineRootElement field is true and needs to be changed;
     * @return A list starting with the Entry<String> entry and ending with all of its parents whose
     * newLineRootElement is true and needs to be changed;
     */
    private List<Entry<String>> getNewLineRootElementsCollection(Entry<String> entry) {
        ArrayList<Entry<String>> list = new ArrayList<>();
        list.add(entry);
        if ((entry.parent != null) && (entry.parent.newLineRootElement)) {
            list.addAll(getNewLineRootElementsCollection(entry.parent));
        }
        return list;
    }

    /**
     * The createChild method creates a new Entry<String> and sets the value of the parent variable
     *
     * @param parent  The Entry<String> parent node;
     * @param s The value of the elementName for the new Entry<String>;
     */
    private void createChild(Entry<String> parent, String s) {
        Entry<String> newOne = new Entry<String>(s);
        newOne.parent = parent;
        newOne.lineNumber = parent.lineNumber + 1;
        setChild(parent, newOne);
    }

    /**
     * The setChild method sets the parent's leftChild/rightChild variable equal to a reference to Entry<String> child;
     * If the parent's newLineRootElement variable was true, this value will be passed to the child and
     * it will be changed to false for the parent;
     *
     * @param parent  The Entry<String> parent node
     * @param child The Entry<String> child node
     */
    private void setChild(Entry<String> parent, Entry<String> child) {
        if (parent.availableToAddLeftChildren) {
            parent.leftChild = child;
            parent.availableToAddLeftChildren = false;
            if (parent.newLineRootElement) {
                List<Entry<String>> list = getNewLineRootElementsCollection(parent);
                for (Entry<String> entry : list) {
                    entry.newLineRootElement = false;
                }
                child.newLineRootElement = true;
            }
        } else {
            parent.rightChild = child;
            parent.availableToAddRightChildren = false;
            if (parent.newLineRootElement) {
                List<Entry<String>> list = getNewLineRootElementsCollection(parent);
                for (Entry<String> entry : list) {
                    entry.newLineRootElement = false;
                }
                child.newLineRootElement = true;
            }
        }
    }

    /**
     * Unsupported Operation
     *
     * @param index param
     * @return UnsupportedOperationException();
     */
    @Override
    public String get(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        throw new UnsupportedOperationException();
    }

    /**
     * @return The size of the collection of Entry<String> nodes;
     */
    @Override
    public int size() {
        setValidCollection();
        return queue.size();
    }

    @Override
    public String remove(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    static class Entry<T> implements Serializable {

        String elementName;
        int lineNumber;
        boolean availableToAddLeftChildren, availableToAddRightChildren;
        boolean newLineRootElement;
        Entry<T> parent, leftChild, rightChild;

        private Entry(String name) {
            elementName = name;
            newLineRootElement = false;
            availableToAddLeftChildren = true;
            availableToAddRightChildren = true;
        }

        private void checkChildren() {
            if (this.leftChild != null) {
                availableToAddLeftChildren = false;
            }
            if (this.rightChild != null) {
                availableToAddRightChildren = false;
            }
        }

        public boolean isAvailableToAddChildren() {
            return this.availableToAddRightChildren || this.availableToAddLeftChildren;
        }
    }
}

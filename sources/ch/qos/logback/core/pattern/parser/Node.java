package ch.qos.logback.core.pattern.parser;

import o0.c;

/* JADX INFO: loaded from: classes.dex */
public class Node {
    public static final int COMPOSITE_KEYWORD = 2;
    public static final int LITERAL = 0;
    public static final int SIMPLE_KEYWORD = 1;
    public Node next;
    public final int type;
    public final Object value;

    public Node(int i10) {
        this(i10, null);
    }

    public Node(int i10, Object obj) {
        this.type = i10;
        this.value = obj;
    }

    public boolean equals(Object obj) {
        Object obj2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Node)) {
            return false;
        }
        Node node = (Node) obj;
        if (this.type == node.type && ((obj2 = this.value) == null ? node.value == null : obj2.equals(node.value))) {
            Node node2 = this.next;
            Node node3 = node.next;
            if (node2 != null) {
                if (node2.equals(node3)) {
                    return true;
                }
            } else if (node3 == null) {
                return true;
            }
        }
        return false;
    }

    public Node getNext() {
        return this.next;
    }

    public int getType() {
        return this.type;
    }

    public Object getValue() {
        return this.value;
    }

    public int hashCode() {
        int i10 = this.type * 31;
        Object obj = this.value;
        return i10 + (obj != null ? obj.hashCode() : 0);
    }

    public String printNext() {
        if (this.next == null) {
            return "";
        }
        StringBuilder sbA = defpackage.a.a(" -> ");
        sbA.append(this.next);
        return sbA.toString();
    }

    public void setNext(Node node) {
        this.next = node;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.type != 0 ? super.toString() : c.a(defpackage.a.a("LITERAL("), this.value, ")"));
        stringBuffer.append(printNext());
        return stringBuffer.toString();
    }
}

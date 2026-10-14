package ch.qos.logback.core.subst;

import o0.c;

/* JADX INFO: loaded from: classes.dex */
public class Node {
    public Object defaultPart;
    public Node next;
    public Object payload;
    public b type;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3737a;

        static {
            int[] iArr = new int[b.values().length];
            f3737a = iArr;
            try {
                iArr[b.LITERAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3737a[b.VARIABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum b {
        LITERAL,
        VARIABLE
    }

    public Node(b bVar, Object obj) {
        this.type = bVar;
        this.payload = obj;
    }

    public Node(b bVar, Object obj, Object obj2) {
        this.type = bVar;
        this.payload = obj;
        this.defaultPart = obj2;
    }

    public void append(Node node) {
        if (node == null) {
            return;
        }
        Node node2 = this;
        while (true) {
            Node node3 = node2.next;
            if (node3 == null) {
                node2.next = node;
                return;
            }
            node2 = node3;
        }
    }

    public void dump() {
        System.out.print(toString());
        System.out.print(" -> ");
        Node node = this.next;
        if (node != null) {
            node.dump();
        } else {
            System.out.print(" null");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Node node = (Node) obj;
        if (this.type != node.type) {
            return false;
        }
        Object obj2 = this.payload;
        if (obj2 == null ? node.payload != null : !obj2.equals(node.payload)) {
            return false;
        }
        Object obj3 = this.defaultPart;
        if (obj3 == null ? node.defaultPart != null : !obj3.equals(node.defaultPart)) {
            return false;
        }
        Node node2 = this.next;
        Node node3 = node.next;
        return node2 == null ? node3 == null : node2.equals(node3);
    }

    public int hashCode() {
        b bVar = this.type;
        int iHashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        Object obj = this.payload;
        int iHashCode2 = (iHashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Object obj2 = this.defaultPart;
        int iHashCode3 = (iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Node node = this.next;
        return iHashCode3 + (node != null ? node.hashCode() : 0);
    }

    public void recursive(Node node, StringBuilder sb2) {
        while (node != null) {
            sb2.append(node.toString());
            sb2.append(" --> ");
            node = node.next;
        }
        sb2.append("null ");
    }

    public void setNext(Node node) {
        this.next = node;
    }

    public String toString() {
        int i10 = a.f3737a[this.type.ordinal()];
        if (i10 == 1) {
            StringBuilder sbA = defpackage.a.a("Node{type=");
            sbA.append(this.type);
            sbA.append(", payload='");
            return c.a(sbA, this.payload, "'}");
        }
        if (i10 != 2) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        Object obj = this.defaultPart;
        if (obj != null) {
            recursive((Node) obj, sb3);
        }
        recursive((Node) this.payload, sb2);
        String string = "Node{type=" + this.type + ", payload='" + sb2.toString() + "'";
        if (this.defaultPart != null) {
            StringBuilder sbA2 = android.support.v4.media.c.a(string, ", defaultPart=");
            sbA2.append(sb3.toString());
            string = sbA2.toString();
        }
        return string + '}';
    }
}

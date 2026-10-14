package ch.qos.logback.core.pattern.parser;

/* JADX INFO: loaded from: classes.dex */
public class CompositeNode extends SimpleKeywordNode {
    public Node childNode;

    public CompositeNode(String str) {
        super(2, str);
    }

    @Override // ch.qos.logback.core.pattern.parser.SimpleKeywordNode, ch.qos.logback.core.pattern.parser.FormattingNode, ch.qos.logback.core.pattern.parser.Node
    public boolean equals(Object obj) {
        if (!super.equals(obj) || !(obj instanceof CompositeNode)) {
            return false;
        }
        Node node = this.childNode;
        Node node2 = ((CompositeNode) obj).childNode;
        if (node != null) {
            return node.equals(node2);
        }
        return node2 == null;
    }

    public Node getChildNode() {
        return this.childNode;
    }

    @Override // ch.qos.logback.core.pattern.parser.SimpleKeywordNode, ch.qos.logback.core.pattern.parser.FormattingNode, ch.qos.logback.core.pattern.parser.Node
    public int hashCode() {
        return super.hashCode();
    }

    public void setChildNode(Node node) {
        this.childNode = node;
    }

    @Override // ch.qos.logback.core.pattern.parser.SimpleKeywordNode, ch.qos.logback.core.pattern.parser.Node
    public String toString() {
        String string;
        StringBuilder sb2 = new StringBuilder();
        if (this.childNode != null) {
            StringBuilder sbA = defpackage.a.a("CompositeNode(");
            sbA.append(this.childNode);
            sbA.append(")");
            string = sbA.toString();
        } else {
            string = "CompositeNode(no child)";
        }
        sb2.append(string);
        sb2.append(printNext());
        return sb2.toString();
    }
}

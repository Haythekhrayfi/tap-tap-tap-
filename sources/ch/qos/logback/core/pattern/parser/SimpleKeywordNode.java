package ch.qos.logback.core.pattern.parser;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class SimpleKeywordNode extends FormattingNode {
    public List<String> optionList;

    public SimpleKeywordNode(int i10, Object obj) {
        super(i10, obj);
    }

    public SimpleKeywordNode(Object obj) {
        super(1, obj);
    }

    @Override // ch.qos.logback.core.pattern.parser.FormattingNode, ch.qos.logback.core.pattern.parser.Node
    public boolean equals(Object obj) {
        if (!super.equals(obj) || !(obj instanceof SimpleKeywordNode)) {
            return false;
        }
        List<String> list = this.optionList;
        List<String> list2 = ((SimpleKeywordNode) obj).optionList;
        if (list != null) {
            return list.equals(list2);
        }
        return list2 == null;
    }

    public List<String> getOptions() {
        return this.optionList;
    }

    @Override // ch.qos.logback.core.pattern.parser.FormattingNode, ch.qos.logback.core.pattern.parser.Node
    public int hashCode() {
        return super.hashCode();
    }

    public void setOptions(List<String> list) {
        this.optionList = list;
    }

    @Override // ch.qos.logback.core.pattern.parser.Node
    public String toString() {
        StringBuilder sbA;
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        if (this.optionList == null) {
            sbA = defpackage.a.a("KeyWord(");
            sbA.append(this.value);
            sbA.append(",");
            obj = this.formatInfo;
        } else {
            sbA = defpackage.a.a("KeyWord(");
            sbA.append(this.value);
            sbA.append(", ");
            sbA.append(this.formatInfo);
            sbA.append(",");
            obj = this.optionList;
        }
        sbA.append(obj);
        sbA.append(")");
        sb2.append(sbA.toString());
        sb2.append(printNext());
        return sb2.toString();
    }
}

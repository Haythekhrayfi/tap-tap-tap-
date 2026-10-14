package ch.qos.logback.core.subst;

import ch.qos.logback.core.spi.PropertyContainer;
import ch.qos.logback.core.spi.ScanException;
import ch.qos.logback.core.util.OptionHelper;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: loaded from: classes.dex */
public class NodeToStringTransformer {
    public final Node node;
    public final PropertyContainer propertyContainer0;
    public final PropertyContainer propertyContainer1;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3738a;

        static {
            int[] iArr = new int[Node.b.values().length];
            f3738a = iArr;
            try {
                iArr[Node.b.LITERAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3738a[Node.b.VARIABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public NodeToStringTransformer(Node node, PropertyContainer propertyContainer) {
        this(node, propertyContainer, null);
    }

    public NodeToStringTransformer(Node node, PropertyContainer propertyContainer, PropertyContainer propertyContainer2) {
        this.node = node;
        this.propertyContainer0 = propertyContainer;
        this.propertyContainer1 = propertyContainer2;
    }

    private void compileNode(Node node, StringBuilder sb2, Stack<Node> stack) throws ScanException {
        while (node != null) {
            int i10 = a.f3738a[node.type.ordinal()];
            if (i10 == 1) {
                handleLiteral(node, sb2);
            } else if (i10 == 2) {
                handleVariable(node, sb2, stack);
            }
            node = node.next;
        }
    }

    private String constructRecursionErrorMessage(Stack<Node> stack) {
        StringBuilder sb2 = new StringBuilder("Circular variable reference detected while parsing input [");
        for (Node node : stack) {
            sb2.append(OptionHelper.DELIM_START);
            sb2.append(variableNodeValue(node));
            sb2.append("}");
            if (stack.lastElement() != node) {
                sb2.append(" --> ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    private boolean equalNodes(Node node, Node node2) {
        Node.b bVar = node.type;
        if (bVar != null && !bVar.equals(node2.type)) {
            return false;
        }
        Object obj = node.payload;
        if (obj != null && !obj.equals(node2.payload)) {
            return false;
        }
        Object obj2 = node.defaultPart;
        return obj2 == null || obj2.equals(node2.defaultPart);
    }

    private void handleLiteral(Node node, StringBuilder sb2) {
        sb2.append((String) node.payload);
    }

    private void handleVariable(Node node, StringBuilder sb2, Stack<Node> stack) throws ScanException {
        boolean zHaveVisitedNodeAlready = haveVisitedNodeAlready(node, stack);
        stack.push(node);
        if (zHaveVisitedNodeAlready) {
            throw new IllegalArgumentException(constructRecursionErrorMessage(stack));
        }
        StringBuilder sb3 = new StringBuilder();
        compileNode((Node) node.payload, sb3, stack);
        String string = sb3.toString();
        String strLookupKey = lookupKey(string);
        if (strLookupKey != null) {
            compileNode(tokenizeAndParseString(strLookupKey), sb2, stack);
            stack.pop();
            return;
        }
        Object obj = node.defaultPart;
        if (obj != null) {
            StringBuilder sb4 = new StringBuilder();
            compileNode((Node) obj, sb4, stack);
            stack.pop();
            sb2.append(sb4.toString());
            return;
        }
        sb2.append(string + "_IS_UNDEFINED");
        stack.pop();
    }

    private boolean haveVisitedNodeAlready(Node node, Stack<Node> stack) {
        Iterator<Node> it = stack.iterator();
        while (it.hasNext()) {
            if (equalNodes(node, it.next())) {
                return true;
            }
        }
        return false;
    }

    private String lookupKey(String str) {
        String property;
        String property2 = this.propertyContainer0.getProperty(str);
        if (property2 != null) {
            return property2;
        }
        PropertyContainer propertyContainer = this.propertyContainer1;
        if (propertyContainer != null && (property = propertyContainer.getProperty(str)) != null) {
            return property;
        }
        String systemProperty = OptionHelper.getSystemProperty(str, null);
        if (systemProperty != null) {
            return systemProperty;
        }
        String env = OptionHelper.getEnv(str);
        if (env != null) {
            return env;
        }
        return null;
    }

    public static String substituteVariable(String str, PropertyContainer propertyContainer, PropertyContainer propertyContainer2) throws ScanException {
        return new NodeToStringTransformer(tokenizeAndParseString(str), propertyContainer, propertyContainer2).transform();
    }

    private static Node tokenizeAndParseString(String str) throws ScanException {
        return new Parser(new Tokenizer(str).tokenize()).parse();
    }

    private String variableNodeValue(Node node) {
        return (String) ((Node) node.payload).payload;
    }

    public String transform() throws ScanException {
        StringBuilder sb2 = new StringBuilder();
        compileNode(this.node, sb2, new Stack<>());
        return sb2.toString();
    }
}

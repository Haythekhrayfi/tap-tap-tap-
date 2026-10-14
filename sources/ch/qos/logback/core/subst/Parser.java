package ch.qos.logback.core.subst;

import androidx.activity.j;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.spi.ScanException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Parser {
    public int pointer = 0;
    public final List<Token> tokenList;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3739a;

        static {
            int[] iArr = new int[Token.Type.values().length];
            f3739a = iArr;
            try {
                iArr[Token.Type.LITERAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3739a[Token.Type.CURLY_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3739a[Token.Type.START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public Parser(List<Token> list) {
        this.tokenList = list;
    }

    private Node C() throws ScanException {
        Node nodeE = E();
        if (isDefaultToken(peekAtCurentToken())) {
            advanceTokenPointer();
            nodeE.append(makeNewLiteralNode(":-"));
            nodeE.append(E());
        }
        return nodeE;
    }

    private Node E() throws ScanException {
        Node nodeT = T();
        if (nodeT == null) {
            return null;
        }
        Node nodeEopt = Eopt();
        if (nodeEopt != null) {
            nodeT.append(nodeEopt);
        }
        return nodeT;
    }

    private Node Eopt() throws ScanException {
        if (peekAtCurentToken() == null) {
            return null;
        }
        return E();
    }

    private Node T() throws ScanException {
        Token tokenPeekAtCurentToken = peekAtCurentToken();
        int i10 = a.f3739a[tokenPeekAtCurentToken.type.ordinal()];
        if (i10 == 1) {
            advanceTokenPointer();
            return makeNewLiteralNode(tokenPeekAtCurentToken.payload);
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return null;
            }
            advanceTokenPointer();
            Node nodeV = V();
            expectCurlyRight(peekAtCurentToken());
            advanceTokenPointer();
            return nodeV;
        }
        advanceTokenPointer();
        Node nodeC = C();
        expectCurlyRight(peekAtCurentToken());
        advanceTokenPointer();
        Node nodeMakeNewLiteralNode = makeNewLiteralNode(CoreConstants.LEFT_ACCOLADE);
        nodeMakeNewLiteralNode.append(nodeC);
        nodeMakeNewLiteralNode.append(makeNewLiteralNode(CoreConstants.RIGHT_ACCOLADE));
        return nodeMakeNewLiteralNode;
    }

    private Node V() throws ScanException {
        Node node = new Node(Node.b.VARIABLE, E());
        if (isDefaultToken(peekAtCurentToken())) {
            advanceTokenPointer();
            node.defaultPart = E();
        }
        return node;
    }

    private boolean isDefaultToken(Token token) {
        return token != null && token.type == Token.Type.DEFAULT;
    }

    private Node makeNewLiteralNode(String str) {
        return new Node(Node.b.LITERAL, str);
    }

    public void advanceTokenPointer() {
        this.pointer++;
    }

    public void expectCurlyRight(Token token) throws ScanException {
        expectNotNull(token, "}");
        if (token.type != Token.Type.CURLY_RIGHT) {
            throw new ScanException("Expecting }");
        }
    }

    public void expectNotNull(Token token, String str) {
        if (token == null) {
            throw new IllegalArgumentException(j.a("All tokens consumed but was expecting \"", str, "\""));
        }
    }

    public Node parse() throws ScanException {
        List<Token> list = this.tokenList;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return E();
    }

    public Token peekAtCurentToken() {
        if (this.pointer < this.tokenList.size()) {
            return this.tokenList.get(this.pointer);
        }
        return null;
    }
}

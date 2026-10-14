package ch.qos.logback.core.pattern.parser;

import ch.qos.logback.core.pattern.Converter;
import ch.qos.logback.core.pattern.FormatInfo;
import ch.qos.logback.core.pattern.IdentityCompositeConverter;
import ch.qos.logback.core.pattern.ReplacingCompositeConverter;
import ch.qos.logback.core.pattern.util.IEscapeUtil;
import ch.qos.logback.core.pattern.util.RegularEscapeUtil;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.ScanException;
import i.f;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import v2.b;

/* JADX INFO: loaded from: classes.dex */
public class Parser<E> extends ContextAwareBase {
    public static final Map<String, String> DEFAULT_COMPOSITE_CONVERTER_MAP;
    public static final String MISSING_RIGHT_PARENTHESIS = "http://logback.qos.ch/codes.html#missingRightParenthesis";
    public static final String REPLACE_CONVERTER_WORD = "replace";
    public int pointer;
    public final List<b> tokenList;

    static {
        HashMap map = new HashMap();
        DEFAULT_COMPOSITE_CONVERTER_MAP = map;
        map.put(b.f36663e.f36666b.toString(), IdentityCompositeConverter.class.getName());
        map.put(REPLACE_CONVERTER_WORD, ReplacingCompositeConverter.class.getName());
    }

    public Parser(a aVar) throws ScanException {
        this.pointer = 0;
        this.tokenList = aVar.c();
    }

    public Parser(String str) throws ScanException {
        this(str, new RegularEscapeUtil());
    }

    public Parser(String str, IEscapeUtil iEscapeUtil) throws ScanException {
        this.pointer = 0;
        try {
            this.tokenList = new a(str, iEscapeUtil).c();
        } catch (IllegalArgumentException e10) {
            throw new ScanException("Failed to initialize Parser", e10);
        }
    }

    public FormattingNode C() throws ScanException {
        b curentToken = getCurentToken();
        expectNotNull(curentToken, "a LEFT_PARENTHESIS or KEYWORD");
        int i10 = curentToken.f36665a;
        if (i10 == 1004) {
            return SINGLE();
        }
        if (i10 == 1005) {
            advanceTokenPointer();
            return COMPOSITE(curentToken.f36666b.toString());
        }
        throw new IllegalStateException("Unexpected token " + curentToken);
    }

    public FormattingNode COMPOSITE(String str) throws ScanException {
        CompositeNode compositeNode = new CompositeNode(str);
        compositeNode.setChildNode(E());
        b nextToken = getNextToken();
        if (nextToken != null && nextToken.f36665a == 41) {
            b curentToken = getCurentToken();
            if (curentToken != null && curentToken.f36665a == 1006) {
                compositeNode.setOptions(curentToken.f36667c);
                advanceTokenPointer();
            }
            return compositeNode;
        }
        String str2 = "Expecting RIGHT_PARENTHESIS token but got " + nextToken;
        addError(str2);
        addError("See also http://logback.qos.ch/codes.html#missingRightParenthesis");
        throw new ScanException(str2);
    }

    public Node E() throws ScanException {
        Node nodeT = T();
        if (nodeT == null) {
            return null;
        }
        Node nodeEopt = Eopt();
        if (nodeEopt != null) {
            nodeT.setNext(nodeEopt);
        }
        return nodeT;
    }

    public Node Eopt() throws ScanException {
        if (getCurentToken() == null) {
            return null;
        }
        return E();
    }

    public FormattingNode SINGLE() throws ScanException {
        SimpleKeywordNode simpleKeywordNode = new SimpleKeywordNode(getNextToken().f36666b);
        b curentToken = getCurentToken();
        if (curentToken != null && curentToken.f36665a == 1006) {
            simpleKeywordNode.setOptions(curentToken.f36667c);
            advanceTokenPointer();
        }
        return simpleKeywordNode;
    }

    public Node T() throws ScanException {
        b curentToken = getCurentToken();
        expectNotNull(curentToken, "a LITERAL or '%'");
        int i10 = curentToken.f36665a;
        if (i10 != 37) {
            if (i10 != 1000) {
                return null;
            }
            advanceTokenPointer();
            return new Node(0, curentToken.f36666b);
        }
        advanceTokenPointer();
        b curentToken2 = getCurentToken();
        expectNotNull(curentToken2, "a FORMAT_MODIFIER, SIMPLE_KEYWORD or COMPOUND_KEYWORD");
        if (curentToken2.f36665a != 1002) {
            return C();
        }
        FormatInfo formatInfoValueOf = FormatInfo.valueOf(curentToken2.f36666b);
        advanceTokenPointer();
        FormattingNode formattingNodeC = C();
        formattingNodeC.setFormatInfo(formatInfoValueOf);
        return formattingNodeC;
    }

    public void advanceTokenPointer() {
        this.pointer++;
    }

    public Converter<E> compile(Node node, Map<String, String> map) {
        v2.a aVar = new v2.a(node, map);
        aVar.setContext(this.context);
        return aVar.b();
    }

    public void expectNotNull(b bVar, String str) {
        if (bVar == null) {
            throw new IllegalStateException(f.a("All tokens consumed but was expecting ", str));
        }
    }

    public b getCurentToken() {
        if (this.pointer < this.tokenList.size()) {
            return this.tokenList.get(this.pointer);
        }
        return null;
    }

    public b getNextToken() {
        if (this.pointer >= this.tokenList.size()) {
            return null;
        }
        List<b> list = this.tokenList;
        int i10 = this.pointer;
        this.pointer = i10 + 1;
        return list.get(i10);
    }

    public Node parse() throws ScanException {
        return E();
    }
}

package v2;

import ch.qos.logback.core.pattern.CompositeConverter;
import ch.qos.logback.core.pattern.Converter;
import ch.qos.logback.core.pattern.DynamicConverter;
import ch.qos.logback.core.pattern.LiteralConverter;
import ch.qos.logback.core.pattern.parser.CompositeNode;
import ch.qos.logback.core.pattern.parser.Node;
import ch.qos.logback.core.pattern.parser.SimpleKeywordNode;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.status.ErrorStatus;
import ch.qos.logback.core.util.OptionHelper;
import java.util.Map;
import y.q;

/* JADX INFO: loaded from: classes.dex */
public class a<E> extends ContextAwareBase {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Converter<E> f36658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Converter<E> f36659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Node f36660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<String, String> f36661f;

    public a(Node node, Map<String, String> map) {
        this.f36660e = node;
        this.f36661f = map;
    }

    public final void a(Converter<E> converter) {
        if (this.f36658c == null) {
            this.f36659d = converter;
            this.f36658c = converter;
        } else {
            this.f36659d.setNext(converter);
            this.f36659d = converter;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0090  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:33:0x010b  */
    public Converter<E> b() {
        DynamicConverter dynamicConverter;
        Converter<E> literalConverter;
        Converter<E> converter;
        CompositeConverter compositeConverter;
        this.f36659d = null;
        this.f36658c = null;
        for (Node node = this.f36660e; node != null; node = node.next) {
            int i10 = node.type;
            if (i10 == 0) {
                a(new LiteralConverter<>((String) node.getValue()));
            } else if (i10 == 1) {
                SimpleKeywordNode simpleKeywordNode = (SimpleKeywordNode) node;
                String str = (String) simpleKeywordNode.getValue();
                String str2 = this.f36661f.get(str);
                if (str2 != null) {
                    try {
                        dynamicConverter = (DynamicConverter) OptionHelper.instantiateByClassName(str2, (Class<?>) DynamicConverter.class, this.context);
                    } catch (Exception e10) {
                        addError(q.a("Failed to instantiate converter class [", str2, "] for keyword [", str, "]"), e10);
                        dynamicConverter = null;
                    }
                    if (dynamicConverter != null) {
                        dynamicConverter.setFormattingInfo(simpleKeywordNode.getFormatInfo());
                        dynamicConverter.setOptionList(simpleKeywordNode.getOptions());
                        converter = dynamicConverter;
                        a(converter);
                    } else {
                        StringBuilder sbA = defpackage.a.a("%PARSER_ERROR[");
                        sbA.append(simpleKeywordNode.getValue());
                        sbA.append("]");
                        literalConverter = new LiteralConverter<>(sbA.toString());
                        StringBuilder sbA2 = defpackage.a.a("[");
                        sbA2.append(simpleKeywordNode.getValue());
                        sbA2.append("] is not a valid conversion word");
                        addStatus(new ErrorStatus(sbA2.toString(), this));
                        a(literalConverter);
                    }
                } else {
                    addError("There is no conversion class registered for conversion word [" + str + "]");
                }
                dynamicConverter = null;
                if (dynamicConverter != null) {
                    dynamicConverter.setFormattingInfo(simpleKeywordNode.getFormatInfo());
                    dynamicConverter.setOptionList(simpleKeywordNode.getOptions());
                    converter = dynamicConverter;
                    a(converter);
                } else {
                    StringBuilder sbA3 = defpackage.a.a("%PARSER_ERROR[");
                    sbA3.append(simpleKeywordNode.getValue());
                    sbA3.append("]");
                    literalConverter = new LiteralConverter<>(sbA3.toString());
                    StringBuilder sbA4 = defpackage.a.a("[");
                    sbA4.append(simpleKeywordNode.getValue());
                    sbA4.append("] is not a valid conversion word");
                    addStatus(new ErrorStatus(sbA4.toString(), this));
                    a(literalConverter);
                }
            } else if (i10 == 2) {
                CompositeNode compositeNode = (CompositeNode) node;
                String str3 = (String) compositeNode.getValue();
                String str4 = this.f36661f.get(str3);
                if (str4 != null) {
                    try {
                        compositeConverter = (CompositeConverter) OptionHelper.instantiateByClassName(str4, (Class<?>) CompositeConverter.class, this.context);
                    } catch (Exception e11) {
                        addError(q.a("Failed to instantiate converter class [", str4, "] as a composite converter for keyword [", str3, "]"), e11);
                        compositeConverter = null;
                    }
                    if (compositeConverter == null) {
                        StringBuilder sbA5 = defpackage.a.a("Failed to create converter for [%");
                        sbA5.append(compositeNode.getValue());
                        sbA5.append("] keyword");
                        addError(sbA5.toString());
                        StringBuilder sbA6 = defpackage.a.a("%PARSER_ERROR[");
                        sbA6.append(compositeNode.getValue());
                        sbA6.append("]");
                        literalConverter = new LiteralConverter<>(sbA6.toString());
                        a(literalConverter);
                    } else {
                        compositeConverter.setFormattingInfo(compositeNode.getFormatInfo());
                        compositeConverter.setOptionList(compositeNode.getOptions());
                        a aVar = new a(compositeNode.getChildNode(), this.f36661f);
                        aVar.setContext(this.context);
                        compositeConverter.setChildConverter(aVar.b());
                        converter = compositeConverter;
                        a(converter);
                    }
                } else {
                    addError("There is no conversion class registered for composite conversion word [" + str3 + "]");
                }
                compositeConverter = null;
                if (compositeConverter == null) {
                    StringBuilder sbA7 = defpackage.a.a("Failed to create converter for [%");
                    sbA7.append(compositeNode.getValue());
                    sbA7.append("] keyword");
                    addError(sbA7.toString());
                    StringBuilder sbA8 = defpackage.a.a("%PARSER_ERROR[");
                    sbA8.append(compositeNode.getValue());
                    sbA8.append("]");
                    literalConverter = new LiteralConverter<>(sbA8.toString());
                    a(literalConverter);
                } else {
                    compositeConverter.setFormattingInfo(compositeNode.getFormatInfo());
                    compositeConverter.setOptionList(compositeNode.getOptions());
                    a aVar2 = new a(compositeNode.getChildNode(), this.f36661f);
                    aVar2.setContext(this.context);
                    compositeConverter.setChildConverter(aVar2.b());
                    converter = compositeConverter;
                    a(converter);
                }
            }
        }
        return this.f36658c;
    }
}

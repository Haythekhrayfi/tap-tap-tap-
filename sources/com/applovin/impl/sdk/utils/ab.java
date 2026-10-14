package com.applovin.impl.sdk.utils;

import android.util.Xml;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

/* JADX INFO: loaded from: classes.dex */
public class ab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.y f11178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Stack<a> f11179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private StringBuilder f11180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f11181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f11182e;

    public static class a extends aa {
        public a(String str, Map<String, String> map, aa aaVar) {
            super(str, map, aaVar);
        }

        public void a(aa aaVar) {
            if (aaVar == null) {
                throw new IllegalArgumentException("None specified.");
            }
            this.f11174c.add(aaVar);
        }

        public void d(String str) {
            this.f11173b = str;
        }
    }

    public ab(com.applovin.impl.sdk.o oVar) {
        if (oVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.f11178a = oVar.F();
    }

    public static aa a(String str, com.applovin.impl.sdk.o oVar) throws SAXException {
        return new ab(oVar).a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> a(Attributes attributes) {
        if (attributes == null) {
            return Collections.emptyMap();
        }
        int length = attributes.getLength();
        HashMap map = new HashMap(length);
        for (int i10 = 0; i10 < length; i10++) {
            map.put(attributes.getQName(i10), attributes.getValue(i10));
        }
        return map;
    }

    public aa a(String str) throws SAXException {
        if (str == null) {
            throw new IllegalArgumentException("Unable to parse. No XML specified.");
        }
        this.f11180c = new StringBuilder();
        this.f11179b = new Stack<>();
        this.f11182e = null;
        Xml.parse(str, new ContentHandler() { // from class: com.applovin.impl.sdk.utils.ab.1
            @Override // org.xml.sax.ContentHandler
            public void characters(char[] cArr, int i10, int i11) {
                String strTrim = new String(Arrays.copyOfRange(cArr, i10, i11)).trim();
                if (StringUtils.isValidString(strTrim)) {
                    ab.this.f11180c.append(strTrim);
                }
            }

            @Override // org.xml.sax.ContentHandler
            public void endDocument() {
                long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - ab.this.f11181d;
                com.applovin.impl.sdk.y unused = ab.this.f11178a;
                if (com.applovin.impl.sdk.y.a()) {
                    ab.this.f11178a.b("XmlParser", "Finished parsing in " + seconds + " seconds");
                }
            }

            @Override // org.xml.sax.ContentHandler
            public void endElement(String str2, String str3, String str4) {
                ab abVar = ab.this;
                abVar.f11182e = (a) abVar.f11179b.pop();
                ab.this.f11182e.d(ab.this.f11180c.toString().trim());
                ab.this.f11180c.setLength(0);
            }

            @Override // org.xml.sax.ContentHandler
            public void endPrefixMapping(String str2) {
            }

            @Override // org.xml.sax.ContentHandler
            public void ignorableWhitespace(char[] cArr, int i10, int i11) {
            }

            @Override // org.xml.sax.ContentHandler
            public void processingInstruction(String str2, String str3) {
            }

            @Override // org.xml.sax.ContentHandler
            public void setDocumentLocator(Locator locator) {
            }

            @Override // org.xml.sax.ContentHandler
            public void skippedEntity(String str2) {
            }

            @Override // org.xml.sax.ContentHandler
            public void startDocument() {
                com.applovin.impl.sdk.y unused = ab.this.f11178a;
                if (com.applovin.impl.sdk.y.a()) {
                    ab.this.f11178a.b("XmlParser", "Begin parsing...");
                }
                ab.this.f11181d = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
            }

            @Override // org.xml.sax.ContentHandler
            public void startElement(String str2, String str3, String str4, Attributes attributes) throws SAXException {
                try {
                    a aVar = ab.this.f11179b.isEmpty() ? null : (a) ab.this.f11179b.peek();
                    a aVar2 = new a(str3, ab.this.a(attributes), aVar);
                    if (aVar != null) {
                        aVar.a(aVar2);
                    }
                    ab.this.f11179b.push(aVar2);
                } catch (Exception e10) {
                    com.applovin.impl.sdk.y unused = ab.this.f11178a;
                    if (com.applovin.impl.sdk.y.a()) {
                        ab.this.f11178a.b("XmlParser", androidx.activity.j.a("Unable to process element <", str3, ">"), e10);
                    }
                    throw new SAXException("Failed to start element", e10);
                }
            }

            @Override // org.xml.sax.ContentHandler
            public void startPrefixMapping(String str2, String str3) {
            }
        });
        a aVar = this.f11182e;
        if (aVar != null) {
            return aVar;
        }
        throw new SAXException("Unable to parse XML into node");
    }
}

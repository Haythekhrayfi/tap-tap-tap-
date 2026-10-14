package com.applovin.impl.sdk.utils;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class aa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final aa f11172a = new aa();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<aa> f11174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final aa f11175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f11176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<String, String> f11177f;

    private aa() {
        this.f11175d = null;
        this.f11176e = "";
        this.f11177f = Collections.emptyMap();
        this.f11173b = "";
        this.f11174c = Collections.emptyList();
    }

    public aa(String str, Map<String, String> map, aa aaVar) {
        this.f11175d = aaVar;
        this.f11176e = str;
        this.f11177f = Collections.unmodifiableMap(map);
        this.f11174c = new ArrayList();
    }

    public String a() {
        return this.f11176e;
    }

    public List<aa> a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        ArrayList arrayList = new ArrayList(this.f11174c.size());
        for (aa aaVar : this.f11174c) {
            if (str.equalsIgnoreCase(aaVar.a())) {
                arrayList.add(aaVar);
            }
        }
        return arrayList;
    }

    public aa b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        for (aa aaVar : this.f11174c) {
            if (str.equalsIgnoreCase(aaVar.a())) {
                return aaVar;
            }
        }
        return null;
    }

    public Map<String, String> b() {
        return this.f11177f;
    }

    public aa c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        if (this.f11174c.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        while (!arrayList.isEmpty()) {
            aa aaVar = (aa) arrayList.get(0);
            arrayList.remove(0);
            if (str.equalsIgnoreCase(aaVar.a())) {
                return aaVar;
            }
            arrayList.addAll(aaVar.d());
        }
        return null;
    }

    public String c() {
        return this.f11173b;
    }

    public List<aa> d() {
        return Collections.unmodifiableList(this.f11174c);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("XmlNode{elementName='");
        l1.c.a(sbA, this.f11176e, CoreConstants.SINGLE_QUOTE_CHAR, ", text='");
        l1.c.a(sbA, this.f11173b, CoreConstants.SINGLE_QUOTE_CHAR, ", attributes=");
        sbA.append(this.f11177f);
        sbA.append('}');
        return sbA.toString();
    }
}

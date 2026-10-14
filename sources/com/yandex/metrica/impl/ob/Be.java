package com.yandex.metrica.impl.ob;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Be implements C0<a, Le> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Le f13721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<a> f13722b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f13723a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final JSONObject f13724b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final E0 f13725c;

        public a(String str, JSONObject jSONObject, E0 e10) {
            this.f13723a = str;
            this.f13724b = jSONObject;
            this.f13725c = e10;
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("Candidate{trackingId='");
            l1.c.a(sbA, this.f13723a, CoreConstants.SINGLE_QUOTE_CHAR, ", additionalParams=");
            sbA.append(this.f13724b);
            sbA.append(", source=");
            sbA.append(this.f13725c);
            sbA.append('}');
            return sbA.toString();
        }
    }

    public Be(Le le2, List<a> list) {
        this.f13721a = le2;
        this.f13722b = list;
    }

    @Override // com.yandex.metrica.impl.ob.C0
    public List<a> a() {
        return this.f13722b;
    }

    @Override // com.yandex.metrica.impl.ob.C0
    public Le b() {
        return this.f13721a;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("PreloadInfoData{chosenPreloadInfo=");
        sbA.append(this.f13721a);
        sbA.append(", candidates=");
        return l1.f.a(sbA, this.f13722b, '}');
    }
}

package com.applovin.impl.sdk.network;

import androidx.recyclerview.widget.s;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.r;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f10839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, String> f10841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, String> f10842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final JSONObject f10843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f10844f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final T f10845g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f10846h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f10847i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f10848j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f10849k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f10850l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f10851m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f10852n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f10853o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final r.a f10854p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f10855q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f10856r;

    public static class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f10857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f10858b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f10859c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Map<String, String> f10861e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public JSONObject f10862f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public T f10863g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f10865i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f10866j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f10867k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f10868l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f10869m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f10870n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f10871o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f10872p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public r.a f10873q;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f10864h = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Map<String, String> f10860d = new HashMap();

        public a(o oVar) {
            this.f10865i = ((Integer) oVar.a(com.applovin.impl.sdk.c.b.dv)).intValue();
            this.f10866j = ((Integer) oVar.a(com.applovin.impl.sdk.c.b.du)).intValue();
            this.f10868l = ((Boolean) oVar.a(com.applovin.impl.sdk.c.b.dt)).booleanValue();
            this.f10869m = ((Boolean) oVar.a(com.applovin.impl.sdk.c.b.dT)).booleanValue();
            this.f10870n = ((Boolean) oVar.a(com.applovin.impl.sdk.c.b.fx)).booleanValue();
            this.f10873q = r.a.a(((Integer) oVar.a(com.applovin.impl.sdk.c.b.fy)).intValue());
            this.f10872p = ((Boolean) oVar.a(com.applovin.impl.sdk.c.b.fW)).booleanValue();
        }

        public a<T> a(int i10) {
            this.f10864h = i10;
            return this;
        }

        public a<T> a(r.a aVar) {
            this.f10873q = aVar;
            return this;
        }

        public a<T> a(T t10) {
            this.f10863g = t10;
            return this;
        }

        public a<T> a(String str) {
            this.f10858b = str;
            return this;
        }

        public a<T> a(Map<String, String> map) {
            this.f10860d = map;
            return this;
        }

        public a<T> a(JSONObject jSONObject) {
            this.f10862f = jSONObject;
            return this;
        }

        public a<T> a(boolean z10) {
            this.f10867k = z10;
            return this;
        }

        public c<T> a() {
            return new c<>(this);
        }

        public a<T> b(int i10) {
            this.f10865i = i10;
            return this;
        }

        public a<T> b(String str) {
            this.f10857a = str;
            return this;
        }

        public a<T> b(Map<String, String> map) {
            this.f10861e = map;
            return this;
        }

        public a<T> b(boolean z10) {
            this.f10868l = z10;
            return this;
        }

        public a<T> c(int i10) {
            this.f10866j = i10;
            return this;
        }

        public a<T> c(String str) {
            this.f10859c = str;
            return this;
        }

        public a<T> c(boolean z10) {
            this.f10869m = z10;
            return this;
        }

        public a<T> d(boolean z10) {
            this.f10870n = z10;
            return this;
        }

        public a<T> e(boolean z10) {
            this.f10871o = z10;
            return this;
        }

        public a<T> f(boolean z10) {
            this.f10872p = z10;
            return this;
        }
    }

    public c(a<T> aVar) {
        this.f10839a = aVar.f10858b;
        this.f10840b = aVar.f10857a;
        this.f10841c = aVar.f10860d;
        this.f10842d = aVar.f10861e;
        this.f10843e = aVar.f10862f;
        this.f10844f = aVar.f10859c;
        this.f10845g = aVar.f10863g;
        int i10 = aVar.f10864h;
        this.f10846h = i10;
        this.f10847i = i10;
        this.f10848j = aVar.f10865i;
        this.f10849k = aVar.f10866j;
        this.f10850l = aVar.f10867k;
        this.f10851m = aVar.f10868l;
        this.f10852n = aVar.f10869m;
        this.f10853o = aVar.f10870n;
        this.f10854p = aVar.f10873q;
        this.f10855q = aVar.f10871o;
        this.f10856r = aVar.f10872p;
    }

    public static <T> a<T> a(o oVar) {
        return new a<>(oVar);
    }

    public String a() {
        return this.f10839a;
    }

    public void a(int i10) {
        this.f10847i = i10;
    }

    public void a(String str) {
        this.f10839a = str;
    }

    public String b() {
        return this.f10840b;
    }

    public void b(String str) {
        this.f10840b = str;
    }

    public Map<String, String> c() {
        return this.f10841c;
    }

    public Map<String, String> d() {
        return this.f10842d;
    }

    public JSONObject e() {
        return this.f10843e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        String str = this.f10839a;
        if (str == null ? cVar.f10839a != null : !str.equals(cVar.f10839a)) {
            return false;
        }
        Map<String, String> map = this.f10841c;
        if (map == null ? cVar.f10841c != null : !map.equals(cVar.f10841c)) {
            return false;
        }
        Map<String, String> map2 = this.f10842d;
        if (map2 == null ? cVar.f10842d != null : !map2.equals(cVar.f10842d)) {
            return false;
        }
        String str2 = this.f10844f;
        if (str2 == null ? cVar.f10844f != null : !str2.equals(cVar.f10844f)) {
            return false;
        }
        String str3 = this.f10840b;
        if (str3 == null ? cVar.f10840b != null : !str3.equals(cVar.f10840b)) {
            return false;
        }
        JSONObject jSONObject = this.f10843e;
        if (jSONObject == null ? cVar.f10843e != null : !jSONObject.equals(cVar.f10843e)) {
            return false;
        }
        T t10 = this.f10845g;
        if (t10 == null ? cVar.f10845g == null : t10.equals(cVar.f10845g)) {
            return this.f10846h == cVar.f10846h && this.f10847i == cVar.f10847i && this.f10848j == cVar.f10848j && this.f10849k == cVar.f10849k && this.f10850l == cVar.f10850l && this.f10851m == cVar.f10851m && this.f10852n == cVar.f10852n && this.f10853o == cVar.f10853o && this.f10854p == cVar.f10854p && this.f10855q == cVar.f10855q && this.f10856r == cVar.f10856r;
        }
        return false;
    }

    public String f() {
        return this.f10844f;
    }

    public T g() {
        return this.f10845g;
    }

    public int h() {
        return this.f10847i;
    }

    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f10839a;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f10844f;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f10840b;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        T t10 = this.f10845g;
        int iA = ((((this.f10854p.a() + ((((((((((((((((((iHashCode4 + (t10 != null ? t10.hashCode() : 0)) * 31) + this.f10846h) * 31) + this.f10847i) * 31) + this.f10848j) * 31) + this.f10849k) * 31) + (this.f10850l ? 1 : 0)) * 31) + (this.f10851m ? 1 : 0)) * 31) + (this.f10852n ? 1 : 0)) * 31) + (this.f10853o ? 1 : 0)) * 31)) * 31) + (this.f10855q ? 1 : 0)) * 31) + (this.f10856r ? 1 : 0);
        Map<String, String> map = this.f10841c;
        if (map != null) {
            iA = (iA * 31) + map.hashCode();
        }
        Map<String, String> map2 = this.f10842d;
        if (map2 != null) {
            iA = (iA * 31) + map2.hashCode();
        }
        JSONObject jSONObject = this.f10843e;
        if (jSONObject == null) {
            return iA;
        }
        char[] charArray = jSONObject.toString().toCharArray();
        Arrays.sort(charArray);
        return (iA * 31) + new String(charArray).hashCode();
    }

    public int i() {
        return this.f10846h - this.f10847i;
    }

    public int j() {
        return this.f10848j;
    }

    public int k() {
        return this.f10849k;
    }

    public boolean l() {
        return this.f10850l;
    }

    public boolean m() {
        return this.f10851m;
    }

    public boolean n() {
        return this.f10852n;
    }

    public boolean o() {
        return this.f10853o;
    }

    public r.a p() {
        return this.f10854p;
    }

    public boolean q() {
        return this.f10855q;
    }

    public boolean r() {
        return this.f10856r;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("HttpRequest {endpoint=");
        sbA.append(this.f10839a);
        sbA.append(", backupEndpoint=");
        sbA.append(this.f10844f);
        sbA.append(", httpMethod=");
        sbA.append(this.f10840b);
        sbA.append(", httpHeaders=");
        sbA.append(this.f10842d);
        sbA.append(", body=");
        sbA.append(this.f10843e);
        sbA.append(", emptyResponse=");
        sbA.append(this.f10845g);
        sbA.append(", initialRetryAttempts=");
        sbA.append(this.f10846h);
        sbA.append(", retryAttemptsLeft=");
        sbA.append(this.f10847i);
        sbA.append(", timeoutMillis=");
        sbA.append(this.f10848j);
        sbA.append(", retryDelayMillis=");
        sbA.append(this.f10849k);
        sbA.append(", exponentialRetries=");
        sbA.append(this.f10850l);
        sbA.append(", retryOnAllErrors=");
        sbA.append(this.f10851m);
        sbA.append(", retryOnNoConnection=");
        sbA.append(this.f10852n);
        sbA.append(", encodingEnabled=");
        sbA.append(this.f10853o);
        sbA.append(", encodingType=");
        sbA.append(this.f10854p);
        sbA.append(", trackConnectionSpeed=");
        sbA.append(this.f10855q);
        sbA.append(", gzipBodyEncoding=");
        return s.a(sbA, this.f10856r, '}');
    }
}

package com.yandex.metrica.impl.ob;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class X4 extends C1662gh {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List<String> f15466o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f15467p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Boolean f15468q;

    public static final class a extends C1587dh.a<X3.a, a> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f15469d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f15470e;

        public a(X3.a aVar) {
            this(aVar.f15449a, aVar.f15450b, aVar.f15451c, aVar.f15452d, aVar.f15460l);
        }

        public a(String str, String str2, String str3, String str4, Boolean bool) {
            super(str, str2, str3);
            this.f15469d = str4;
            this.f15470e = ((Boolean) C2120ym.a(bool, Boolean.TRUE)).booleanValue();
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC1562ch
        public Object a(Object obj) {
            X3.a aVar = (X3.a) obj;
            String str = aVar.f15449a;
            String str2 = this.f15968a;
            if (str != null) {
                str2 = str;
            }
            String str3 = aVar.f15450b;
            String str4 = this.f15969b;
            if (str3 != null) {
                str4 = str3;
            }
            String str5 = aVar.f15451c;
            String str6 = this.f15970c;
            if (str5 != null) {
                str6 = str5;
            }
            String str7 = aVar.f15452d;
            String str8 = this.f15469d;
            if (str7 != null) {
                str8 = str7;
            }
            Boolean bool = aVar.f15460l;
            return new a(str2, str4, str6, str8, bool == null ? Boolean.valueOf(this.f15470e) : bool);
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC1562ch
        public boolean b(Object obj) {
            String str;
            String str2;
            String str3;
            X3.a aVar = (X3.a) obj;
            String str4 = aVar.f15449a;
            return (str4 == null || str4.equals(this.f15968a)) && ((str = aVar.f15450b) == null || str.equals(this.f15969b)) && (((str2 = aVar.f15451c) == null || str2.equals(this.f15970c)) && ((str3 = aVar.f15452d) == null || str3.equals(this.f15469d)));
        }
    }

    public static class b extends C1662gh.a<X4, a> {
        public b(Context context, String str) {
            super(context, str);
        }

        @Override // com.yandex.metrica.impl.ob.C1587dh.b
        public C1587dh a() {
            return new X4();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.yandex.metrica.impl.ob.C1587dh.d
        public C1587dh a(Object obj) {
            C1587dh.c cVar = (C1587dh.c) obj;
            X4 x4A = a(cVar);
            x4A.a(cVar.f15973a.l());
            x4A.h(((a) cVar.f15974b).f15469d);
            x4A.a(Boolean.valueOf(((a) cVar.f15974b).f15470e));
            return x4A;
        }
    }

    public String C() {
        return this.f15467p;
    }

    public List<String> D() {
        return this.f15466o;
    }

    public Boolean E() {
        return this.f15468q;
    }

    public void a(Boolean bool) {
        this.f15468q = bool;
    }

    public void a(List<String> list) {
        this.f15466o = list;
    }

    public void h(String str) {
        this.f15467p = str;
    }

    @Override // com.yandex.metrica.impl.ob.C1662gh
    public String toString() {
        StringBuilder sbA = defpackage.a.a("DiagnosticRequestConfig{mDiagnosticHosts=");
        sbA.append(this.f15466o);
        sbA.append(", mApiKey='");
        l1.c.a(sbA, this.f15467p, CoreConstants.SINGLE_QUOTE_CHAR, ", statisticsSending=");
        sbA.append(this.f15468q);
        sbA.append('}');
        return sbA.toString();
    }
}

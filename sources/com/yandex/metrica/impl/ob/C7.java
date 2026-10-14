package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class C7 implements InterfaceC1605ea<C1776l7, Of> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Of b(C1776l7 c1776l7) {
        Of of = new Of();
        String strA = c1776l7.a();
        String str = of.f14632b;
        if (strA == null) {
            strA = str;
        }
        of.f14632b = strA;
        String strC = c1776l7.c();
        String str2 = of.f14633c;
        if (strC == null) {
            strC = str2;
        }
        of.f14633c = strC;
        Integer numD = c1776l7.d();
        Integer numValueOf = Integer.valueOf(of.f14634d);
        if (numD == null) {
            numD = numValueOf;
        }
        of.f14634d = numD.intValue();
        Integer numB = c1776l7.b();
        Integer numValueOf2 = Integer.valueOf(of.f14637g);
        if (numB == null) {
            numB = numValueOf2;
        }
        of.f14637g = numB.intValue();
        String strE = c1776l7.e();
        String str3 = of.f14635e;
        if (strE == null) {
            strE = str3;
        }
        of.f14635e = strE;
        Boolean boolF = c1776l7.f();
        Boolean boolValueOf = Boolean.valueOf(of.f14636f);
        if (boolF == null) {
            boolF = boolValueOf;
        }
        of.f14636f = boolF.booleanValue();
        return of;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public C1776l7 a(Of of) {
        throw new UnsupportedOperationException();
    }
}

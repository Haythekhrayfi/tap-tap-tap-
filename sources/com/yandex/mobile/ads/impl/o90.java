package com.yandex.mobile.ads.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
final class o90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m90 f23742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final cq0 f23743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private n90 f23744c;

    public o90(Context context, String str) {
        this.f23742a = new m90(context, str);
        this.f23743b = new cq0(context);
    }

    public final n90 a() {
        n90 n90Var = this.f23744c;
        if (n90Var != null) {
            return n90Var;
        }
        xx xxVarA = this.f23742a.a();
        if (xxVarA == null) {
            return null;
        }
        boolean zA = this.f23743b.a();
        boolean zB = this.f23743b.b();
        if (zA || zB) {
            return xxVarA.a();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    public final void b() {
        n90 n90VarA;
        xx xxVarA = this.f23742a.a();
        n90 n90VarA2 = null;
        if (xxVarA != null) {
            boolean zA = this.f23743b.a();
            boolean zB = this.f23743b.b();
            if (zA || zB) {
                n90VarA = xxVarA.a();
            } else {
                n90VarA = null;
            }
        } else {
            n90VarA = null;
        }
        this.f23744c = n90VarA;
        xx xxVarA2 = this.f23742a.a();
        if (xxVarA2 != null) {
            boolean zA2 = this.f23743b.a();
            boolean zB2 = this.f23743b.b();
            if (zA2 || zB2) {
                n90VarA2 = xxVarA2.a();
            }
        }
        this.f23744c = n90VarA2;
    }
}

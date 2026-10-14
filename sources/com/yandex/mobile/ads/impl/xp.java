package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Space;
import java.util.List;
import java.util.Map;
import y9.x7;

/* JADX INFO: loaded from: classes3.dex */
public final class xp {
    public static p7.k a(Context context) {
        sp spVar = new sp(context);
        mp mpVar = new mp(new np(), new pp(), new op());
        p7.k.b bVar = new p7.k.b(spVar);
        bVar.f34560b = mpVar;
        bVar.f34561c.add(fq.a());
        lq lqVar = new lq(context);
        bVar.f34562d = lqVar;
        z7.d dVar = bVar.f34559a;
        p7.j jVar = new p7.j();
        p7.h hVar = p7.h.f34513a;
        p7.o0 o0Var = p7.o0.f34580a;
        c8.b bVar2 = c8.b.f3625a;
        x9.b bVar3 = new x9.b();
        int i10 = p7.g.f34510a;
        p7.f fVar = new p7.g() { // from class: p7.f
            @Override // p7.g
            public final Drawable a(int i11) {
                return new ColorDrawable(i11);
            }
        };
        int i11 = p7.h1.f34515a;
        p7.g1 g1Var = new p7.h1() { // from class: p7.g1
            @Override // p7.h1
            public final void a(Map map) {
            }
        };
        int i12 = p7.n0.f34578a;
        p7.m0 m0Var = new p7.n0() { // from class: p7.m0
            @Override // p7.n0
            public final void a(y9.i1 i1Var, i8.k kVar, n0.a aVar) {
                new Space(kVar.getContext());
            }
        };
        p7.l0 l0Var = bVar.f34560b;
        a8.d dVar2 = a8.d.f189a;
        int i13 = p7.c1.f34478a;
        p7.b1 b1Var = new p7.c1() { // from class: p7.b1
            @Override // p7.c1
            public final boolean a(View view, x7 x7Var) {
                return true;
            }
        };
        List<x7.c> list = bVar.f34561c;
        int i14 = s7.e.f35474a;
        return new p7.k(dVar, jVar, hVar, o0Var, bVar2, bVar3, fVar, g1Var, m0Var, l0Var, dVar2, b1Var, list, new s7.e() { // from class: s7.c
            @Override // s7.e
            public final z7.e a(i8.k kVar, String str, i iVar) {
                return new d();
            }
        }, lqVar, lqVar, l9.h.b.f33048a, new w7.a(), bVar.f34563e, bVar.f34564f, bVar.f34565g, bVar.f34566h, bVar.f34568j, bVar.f34567i, bVar.f34569k, bVar.f34570l, bVar.f34571m, bVar.f34572n, bVar.f34573o, false, null);
    }
}

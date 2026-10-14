package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.video.parser.offset.VastTimeOffset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class bt0 implements td1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f19323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y71 f19324b = new y71();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LinkedList f19325c;

    public bt0(Context context, sc1 sc1Var) {
        this.f19323a = context.getApplicationContext();
        this.f19325c = a(sc1Var);
    }

    private LinkedList a(sc1 sc1Var) {
        LinkedList linkedList = new LinkedList();
        nl nlVarA = sc1Var.a();
        long jD = nlVarA.d();
        Objects.requireNonNull(this.f19324b);
        ArrayList<u71> arrayListA = y71.a(nlVarA);
        ArrayList<u71> arrayList = new ArrayList();
        for (u71 u71Var : arrayListA) {
            if ("progress".equals(u71Var.a())) {
                arrayList.add(u71Var);
            }
        }
        for (u71 u71Var2 : arrayList) {
            String strC = u71Var2.c();
            VastTimeOffset vastTimeOffsetB = u71Var2.b();
            at0 at0Var = null;
            if (vastTimeOffsetB != null) {
                Long lValueOf = VastTimeOffset.b.f28005a.equals(vastTimeOffsetB.c()) ? Long.valueOf((long) vastTimeOffsetB.d()) : null;
                if (VastTimeOffset.b.f28006b.equals(vastTimeOffsetB.c())) {
                    lValueOf = Long.valueOf((long) ((vastTimeOffsetB.d() / 100.0f) * jD));
                }
                if (lValueOf != null) {
                    at0Var = new at0(strC, lValueOf.longValue());
                }
            }
            if (at0Var != null) {
                linkedList.add(at0Var);
            }
        }
        return linkedList;
    }

    @Override // com.yandex.mobile.ads.impl.td1
    public final void a(long j10, long j11) {
        Iterator it = this.f19325c.iterator();
        while (it.hasNext()) {
            at0 at0Var = (at0) it.next();
            float fA = at0Var.a();
            String strB = at0Var.b();
            if (fA <= j11) {
                df1.f19855c.a(this.f19323a).a(strB);
                it.remove();
            }
        }
    }
}

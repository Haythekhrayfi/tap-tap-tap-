package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.BuildConfigFieldProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class eo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ob1 f20302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ko0 f20303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final uo0 f20304c = new uo0();

    public eo0(Context context, ob1 ob1Var) {
        this.f20302a = ob1Var;
        this.f20303b = new ko0(context);
    }

    public final em1 a(ArrayList arrayList) throws IllegalStateException {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            lb1 lb1Var = (lb1) it.next();
            try {
                Objects.requireNonNull(this.f20304c);
                arrayList2.add(uo0.a(lb1Var));
            } catch (nb1 e10) {
                this.f20302a.a(e10);
            } catch (Exception e11) {
                x60.a(e11, e11.getMessage(), new Object[0]);
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return w5.a(x5.a(), y5.a(rp0.a(BuildConfigFieldProvider.getVersion()), this.f20303b.a(), arrayList2));
    }
}

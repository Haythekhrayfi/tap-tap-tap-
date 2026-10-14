package com.yandex.metrica.impl.ob;

import android.view.View;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
class Gl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C1939rl f14107a;

    private void a(C1989tl c1989tl, C1939rl c1939rl, View view, int i10, InterfaceC1715il interfaceC1715il) {
        ArrayList<View> arrayList = (ArrayList) c1989tl.a(view, i10);
        if (arrayList.size() == 0) {
            interfaceC1715il.a(c1939rl.a());
            return;
        }
        for (View view2 : arrayList) {
            C1939rl c1939rlB = c1989tl.b(c1939rl.a(), view2, i10);
            if (c1939rlB != null) {
                c1939rl.a(c1939rlB);
                a(c1989tl, c1939rlB, view2, i10 + 1, interfaceC1715il);
            }
        }
    }

    public JSONObject a(Kl kl, C1541bl c1541bl, int i10) {
        C1939rl c1939rl = this.f14107a;
        JSONObject jSONObject = c1939rl != null ? c1939rl.a(kl, c1541bl, i10, 0).f17252c : null;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public void a(C1989tl c1989tl, View view, InterfaceC1715il interfaceC1715il) {
        C1939rl c1939rlB = c1989tl.b(null, view, 0);
        this.f14107a = c1939rlB;
        if (c1939rlB != null) {
            a(c1989tl, c1939rlB, view, 1, interfaceC1715il);
        }
    }
}

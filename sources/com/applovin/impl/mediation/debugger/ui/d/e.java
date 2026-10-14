package com.applovin.impl.mediation.debugger.ui.d;

import android.text.SpannedString;

/* JADX INFO: loaded from: classes.dex */
public class e extends c {
    public e(String str) {
        super(c.b.SECTION);
        this.f9717d = new SpannedString(str);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("SectionListItemViewModel{text=");
        sbA.append((Object) this.f9717d);
        sbA.append("}");
        return sbA.toString();
    }
}

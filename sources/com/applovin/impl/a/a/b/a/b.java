package com.applovin.impl.a.a.b.a;

import android.app.Activity;
import android.content.Context;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.mediation.debugger.ui.d.e;
import com.applovin.impl.sdk.o;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private o f8284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<com.applovin.impl.a.a.a.a> f8285b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f8286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.ui.d.c> f8287e;

    public enum a {
        RECENT_ADS,
        COUNT
    }

    public b(Context context) {
        super(context);
        this.f8286d = new AtomicBoolean();
        this.f8287e = new ArrayList();
    }

    private List<com.applovin.impl.mediation.debugger.ui.d.c> a(List<com.applovin.impl.a.a.a.a> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<com.applovin.impl.a.a.a.a> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.applovin.impl.a.a.b.a.a.a(it.next(), this.f9751c));
        }
        return arrayList;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    public int a(int i10) {
        return this.f8287e.size();
    }

    public void a() {
        this.f8286d.compareAndSet(true, false);
    }

    public void a(List<com.applovin.impl.a.a.a.a> list, o oVar) {
        Activity activityAt;
        this.f8284a = oVar;
        this.f8285b = list;
        if (!(this.f9751c instanceof Activity) && (activityAt = oVar.at()) != null) {
            this.f9751c = activityAt;
        }
        if (list != null && this.f8286d.compareAndSet(false, true)) {
            this.f8287e = a(this.f8285b);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.a.a.b.a.b.1
            @Override // java.lang.Runnable
            public void run() {
                b.this.notifyDataSetChanged();
            }
        });
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    public com.applovin.impl.mediation.debugger.ui.d.c b(int i10) {
        return new e("RECENT ADS");
    }

    public boolean b() {
        return this.f8287e.size() == 0;
    }

    public o c() {
        return this.f8284a;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    public List<com.applovin.impl.mediation.debugger.ui.d.c> c(int i10) {
        return this.f8287e;
    }

    public List<com.applovin.impl.a.a.a.a> d() {
        return this.f8285b;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    public int e() {
        return a.COUNT.ordinal();
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("CreativeDebuggerListAdapter{isInitialized=");
        sbA.append(this.f8286d.get());
        sbA.append("}");
        return sbA.toString();
    }
}

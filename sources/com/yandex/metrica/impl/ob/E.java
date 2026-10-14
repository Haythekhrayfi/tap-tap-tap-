package com.yandex.metrica.impl.ob;

import com.applovin.sdk.AppLovinMediationProvider;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public class E implements F2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<Integer> f13847a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<Integer> f13848b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile a f13849c = a.UNKNOWN;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set<b> f13850d = new CopyOnWriteArraySet();

    public enum a {
        UNKNOWN(AppLovinMediationProvider.UNKNOWN),
        BACKGROUND("background"),
        VISIBLE("visible");

        a(String str) {
        }
    }

    public interface b {
        void a(a aVar);
    }

    private void d() {
        a aVar = a.UNKNOWN;
        if (!this.f13847a.isEmpty()) {
            aVar = a.VISIBLE;
        } else if (!this.f13848b.isEmpty()) {
            aVar = a.BACKGROUND;
        }
        if (this.f13849c != aVar) {
            this.f13849c = aVar;
            Iterator<b> it = this.f13850d.iterator();
            while (it.hasNext()) {
                it.next().a(this.f13849c);
            }
        }
    }

    public a a(b bVar) {
        this.f13850d.add(bVar);
        return this.f13849c;
    }

    @Override // com.yandex.metrica.impl.ob.F2
    public void a() {
        d();
    }

    public void a(int i10) {
        this.f13847a.remove(Integer.valueOf(i10));
        d();
    }

    @Override // com.yandex.metrica.impl.ob.F2
    public void b() {
        if (this.f13849c == a.VISIBLE) {
            this.f13849c = a.BACKGROUND;
        }
    }

    public void b(int i10) {
        this.f13848b.add(Integer.valueOf(i10));
        this.f13847a.remove(Integer.valueOf(i10));
        d();
    }

    public a c() {
        return this.f13849c;
    }

    public void c(int i10) {
        this.f13847a.add(Integer.valueOf(i10));
        this.f13848b.remove(Integer.valueOf(i10));
        d();
    }
}

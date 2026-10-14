package com.applovin.impl.mediation.nativeAds.a;

import com.applovin.impl.sdk.utils.q;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q<Integer> f9997a = new q<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TreeSet<Integer> f9998b = new TreeSet<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<Integer, MaxAd> f9999c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f10000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f10001e;

    public a(MaxAdPlacerSettings maxAdPlacerSettings) {
        a(maxAdPlacerSettings);
    }

    private int a(int i10, boolean z10) {
        int iD = this.f9997a.d(Integer.valueOf(i10));
        if (!z10) {
            int i11 = i10 + iD;
            while (iD < this.f9997a.size() && i11 >= ((Integer) this.f9997a.a(iD)).intValue()) {
                i11++;
                iD++;
            }
        }
        return iD;
    }

    private void a(MaxAdPlacerSettings maxAdPlacerSettings) {
        if (!maxAdPlacerSettings.hasValidPositioning()) {
            y.j("MaxAdPlacerData", "No positioning info was provided with ad placer settings. You must set at least (1) one or more fixed positions or (2) a repeating interval greater than or equal to 2 for the ad placer to determine where to position ads.");
            return;
        }
        this.f9997a.addAll(maxAdPlacerSettings.getFixedPositions());
        if (!maxAdPlacerSettings.isRepeatingEnabled()) {
            return;
        }
        int repeatingInterval = maxAdPlacerSettings.getRepeatingInterval();
        if (this.f9997a.isEmpty()) {
            this.f9997a.add(Integer.valueOf(repeatingInterval - 1));
        }
        int iIntValue = ((Integer) this.f9997a.a()).intValue();
        while (true) {
            iIntValue += repeatingInterval;
            if (this.f9997a.size() >= maxAdPlacerSettings.getMaxAdCount()) {
                return;
            } else {
                this.f9997a.add(Integer.valueOf(iIntValue));
            }
        }
    }

    private void c(int i10, int i11) {
        if (this.f9999c.containsKey(Integer.valueOf(i10))) {
            this.f9999c.put(Integer.valueOf(i11), this.f9999c.get(Integer.valueOf(i10)));
            this.f9998b.add(Integer.valueOf(i11));
            this.f9999c.remove(Integer.valueOf(i10));
            this.f9998b.remove(Integer.valueOf(i10));
        }
    }

    public int a() {
        int i10 = this.f10000d;
        if (i10 != -1 && this.f10001e != -1) {
            while (i10 <= this.f10001e) {
                if (a(i10) && !b(i10)) {
                    return i10;
                }
                i10++;
            }
        }
        return -1;
    }

    public void a(int i10, int i11) {
        this.f10000d = i10;
        this.f10001e = i11;
    }

    public void a(MaxAd maxAd, int i10) {
        this.f9999c.put(Integer.valueOf(i10), maxAd);
        this.f9998b.add(Integer.valueOf(i10));
    }

    public void a(Collection<Integer> collection) {
        for (Integer num : collection) {
            this.f9999c.remove(num);
            this.f9998b.remove(num);
        }
    }

    public boolean a(int i10) {
        return this.f9997a.contains(Integer.valueOf(i10));
    }

    public Collection<Integer> b() {
        return new TreeSet((SortedSet) this.f9998b);
    }

    public void b(int i10, int i11) {
        i(i10);
        h(i11);
    }

    public boolean b(int i10) {
        return this.f9998b.contains(Integer.valueOf(i10));
    }

    public MaxAd c(int i10) {
        return this.f9999c.get(Integer.valueOf(i10));
    }

    public void c() {
        this.f9999c.clear();
        this.f9998b.clear();
    }

    public Collection<Integer> d(int i10) {
        return new TreeSet((SortedSet) this.f9998b.tailSet(Integer.valueOf(i10), false));
    }

    public int e(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return i10 + a(i10 - 1, false);
    }

    public int f(int i10) {
        return i10 + a(i10, false);
    }

    public int g(int i10) {
        if (a(i10)) {
            return -1;
        }
        return i10 - a(i10, true);
    }

    public void h(int i10) {
        int iC = this.f9997a.c(Integer.valueOf(i10));
        for (int size = this.f9997a.size() - 1; size >= iC; size--) {
            Integer num = (Integer) this.f9997a.a(size);
            int iIntValue = num.intValue() + 1;
            c(num.intValue(), iIntValue);
            this.f9997a.a(size, Integer.valueOf(iIntValue));
        }
    }

    public void i(int i10) {
        int iC = this.f9997a.c(Integer.valueOf(i10));
        if (a(i10)) {
            this.f9999c.remove(Integer.valueOf(i10));
            this.f9998b.remove(Integer.valueOf(i10));
            this.f9997a.b(iC);
        }
        while (iC < this.f9997a.size()) {
            Integer num = (Integer) this.f9997a.a(iC);
            int iIntValue = num.intValue() - 1;
            c(num.intValue(), iIntValue);
            this.f9997a.a(iC, Integer.valueOf(iIntValue));
            iC++;
        }
    }
}

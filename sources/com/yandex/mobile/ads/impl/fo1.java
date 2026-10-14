package com.yandex.mobile.ads.impl;

import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fo1 implements Comparator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ fo1 f20763d = new fo1(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ fo1 f20764e = new fo1(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ fo1 f20765f = new fo1(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ fo1 f20766g = new fo1(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ fo1 f20767h = new fo1(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ fo1 f20768i = new fo1(5);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ fo1 f20769j = new fo1(6);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ fo1 f20770k = new fo1(7);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ fo1 f20771l = new fo1(8);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ fo1 f20772m = new fo1(9);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f20773c;

    public /* synthetic */ fo1(int i10) {
        this.f20773c = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f20773c) {
            case 0:
                return hh.a.a((hh.a) obj, (hh.a) obj2);
            case 1:
                return ij1.a((ej1) obj, (ej1) obj2);
            case 2:
                return p21.b((p21.a) obj, (p21.a) obj2);
            case 3:
                return po.a.a((List<po.a>) obj, (List<po.a>) obj2);
            case 4:
                return po.h.a((List<po.h>) obj, (List<po.h>) obj2);
            case 5:
                return po.h.a((po.h) obj, (po.h) obj2);
            case 6:
                return po.h.b((po.h) obj, (po.h) obj2);
            case 7:
                return po.h.b((po.h) obj, (po.h) obj2);
            case 8:
                return ne.a((yv) obj, (yv) obj2);
            default:
                return po.b((Integer) obj, (Integer) obj2);
        }
    }
}

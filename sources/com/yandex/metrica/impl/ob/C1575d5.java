package com.yandex.metrica.impl.ob;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.d5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1575d5 extends AbstractC1625f5<AbstractC1948s5> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Y5 f15912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<EnumC1745k1, R5<AbstractC1948s5>> f15913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private N5 f15914c;

    public C1575d5(C1624f4 c1624f4) {
        Y5 y10 = new Y5(c1624f4);
        this.f15912a = y10;
        this.f15914c = new N5(y10);
        this.f15913b = a();
    }

    private HashMap<EnumC1745k1, R5<AbstractC1948s5>> a() {
        HashMap<EnumC1745k1, R5<AbstractC1948s5>> map = new HashMap<>();
        map.put(EnumC1745k1.EVENT_TYPE_ACTIVATION, new M5(this.f15912a));
        map.put(EnumC1745k1.EVENT_TYPE_START, new C1526b6(this.f15912a));
        map.put(EnumC1745k1.EVENT_TYPE_REGULAR, new V5(this.f15912a));
        T5 t10 = new T5(this.f15912a);
        map.put(EnumC1745k1.EVENT_TYPE_EXCEPTION_USER, t10);
        map.put(EnumC1745k1.EVENT_TYPE_EXCEPTION_USER_PROTOBUF, t10);
        map.put(EnumC1745k1.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF, t10);
        map.put(EnumC1745k1.EVENT_TYPE_SEND_REFERRER, t10);
        map.put(EnumC1745k1.EVENT_TYPE_STATBOX, t10);
        map.put(EnumC1745k1.EVENT_TYPE_CUSTOM_EVENT, t10);
        map.put(EnumC1745k1.EVENT_TYPE_APP_OPEN, new X5(this.f15912a));
        map.put(EnumC1745k1.EVENT_TYPE_PURGE_BUFFER, new U5(this.f15912a));
        EnumC1745k1 enumC1745k1 = EnumC1745k1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH;
        Y5 y10 = this.f15912a;
        map.put(enumC1745k1, new C1501a6(y10, y10.l()));
        EnumC1745k1 enumC1745k2 = EnumC1745k1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        Y5 y11 = this.f15912a;
        map.put(enumC1745k2, new C1501a6(y11, y11.l()));
        map.put(EnumC1745k1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH, new Q5(this.f15912a));
        map.put(EnumC1745k1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, new Q5(this.f15912a));
        map.put(EnumC1745k1.EVENT_TYPE_CURRENT_SESSION_CRASHPAD_CRASH_PROTOBUF, new P5(this.f15912a));
        EnumC1745k1 enumC1745k3 = EnumC1745k1.EVENT_TYPE_API_NATIVE_CRASH_PROTOBUF;
        Y5 y12 = this.f15912a;
        map.put(enumC1745k3, new C1501a6(y12, y12.l()));
        map.put(EnumC1745k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new C1576d6(this.f15912a));
        C1551c6 c1551c6 = new C1551c6(this.f15912a);
        map.put(EnumC1745k1.EVENT_TYPE_EXCEPTION_UNHANDLED, c1551c6);
        map.put(EnumC1745k1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, c1551c6);
        map.put(EnumC1745k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT, c1551c6);
        map.put(EnumC1745k1.EVENT_TYPE_ANR, t10);
        map.put(EnumC1745k1.EVENT_TYPE_IDENTITY, new S5(this.f15912a));
        map.put(EnumC1745k1.EVENT_TYPE_SET_USER_INFO, new Z5(this.f15912a));
        EnumC1745k1 enumC1745k4 = EnumC1745k1.EVENT_TYPE_REPORT_USER_INFO;
        Y5 y13 = this.f15912a;
        map.put(enumC1745k4, new C1501a6(y13, y13.o()));
        EnumC1745k1 enumC1745k5 = EnumC1745k1.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        Y5 y14 = this.f15912a;
        map.put(enumC1745k5, new C1501a6(y14, y14.d()));
        EnumC1745k1 enumC1745k6 = EnumC1745k1.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        Y5 y15 = this.f15912a;
        map.put(enumC1745k6, new C1501a6(y15, y15.c()));
        map.put(EnumC1745k1.EVENT_TYPE_SEND_USER_PROFILE, t10);
        EnumC1745k1 enumC1745k7 = EnumC1745k1.EVENT_TYPE_SET_USER_PROFILE_ID;
        Y5 y16 = this.f15912a;
        map.put(enumC1745k7, new C1501a6(y16, y16.w()));
        map.put(EnumC1745k1.EVENT_TYPE_SEND_REVENUE_EVENT, t10);
        map.put(EnumC1745k1.EVENT_TYPE_SEND_AD_REVENUE_EVENT, t10);
        map.put(EnumC1745k1.EVENT_TYPE_IDENTITY_LIGHT, t10);
        map.put(EnumC1745k1.EVENT_TYPE_CLEANUP, t10);
        map.put(EnumC1745k1.EVENT_TYPE_VIEW_TREE, t10);
        map.put(EnumC1745k1.EVENT_TYPE_RAW_VIEW_TREE, t10);
        map.put(EnumC1745k1.EVENT_TYPE_SEND_ECOMMERCE_EVENT, t10);
        map.put(EnumC1745k1.EVENT_TYPE_STATBOX_EXP, t10);
        map.put(EnumC1745k1.EVENT_TYPE_WEBVIEW_SYNC, t10);
        return map;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1625f5
    public C1550c5<AbstractC1948s5> a(int i10) {
        LinkedList linkedList = new LinkedList();
        EnumC1745k1 enumC1745k1A = EnumC1745k1.a(i10);
        N5 n10 = this.f15914c;
        if (n10 != null) {
            n10.a(enumC1745k1A, linkedList);
        }
        R5<AbstractC1948s5> r10 = this.f15913b.get(enumC1745k1A);
        if (r10 != null) {
            r10.a(linkedList);
        }
        return new C1550c5<>(linkedList);
    }

    public void a(EnumC1745k1 enumC1745k1, R5<AbstractC1948s5> r10) {
        this.f15913b.put(enumC1745k1, r10);
    }

    public Y5 b() {
        return this.f15912a;
    }
}

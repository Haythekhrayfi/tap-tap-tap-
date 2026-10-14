package com.yandex.metrica.impl.ob;

import android.util.Pair;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Bi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<Pair<String, String>> f13730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f13731e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<a> f13732f;

    public enum a {
        WIFI,
        CELL
    }

    public Bi(String str, String str2, String str3, List<Pair<String, String>> list, Long l10, List<a> list2) {
        this.f13727a = str;
        this.f13728b = str2;
        this.f13729c = str3;
        this.f13730d = Collections.unmodifiableList(list);
        this.f13731e = l10;
        this.f13732f = list2;
    }
}

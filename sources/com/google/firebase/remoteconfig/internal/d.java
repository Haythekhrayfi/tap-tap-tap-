package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Date f12706d = new Date(-1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Date f12707e = new Date(-1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f12708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12709b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f12710c = new Object();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f12711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Date f12712b;

        public a(int i10, Date date) {
            this.f12711a = i10;
            this.f12712b = date;
        }
    }

    public d(SharedPreferences sharedPreferences) {
        this.f12708a = sharedPreferences;
    }

    public a a() {
        a aVar;
        synchronized (this.f12710c) {
            aVar = new a(this.f12708a.getInt("num_failed_fetches", 0), new Date(this.f12708a.getLong("backoff_end_time_in_millis", -1L)));
        }
        return aVar;
    }

    public void b(int i10, Date date) {
        synchronized (this.f12710c) {
            this.f12708a.edit().putInt("num_failed_fetches", i10).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
}

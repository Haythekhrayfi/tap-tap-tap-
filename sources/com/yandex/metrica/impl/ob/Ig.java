package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.database.Cursor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class Ig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f14217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Cursor f14218b;

    public Ig(Context context) {
        this.f14217a = context;
    }

    public void a(Xg xg) {
        try {
            try {
                FutureTask futureTask = new FutureTask(new Hg(this));
                P0.i().s().a(futureTask).start();
                Fg fg = (Fg) futureTask.get(5L, TimeUnit.SECONDS);
                U2.a(this.f14218b);
                ((Pg.a) xg).a(fg);
            } finally {
                U2.a(this.f14218b);
            }
        } catch (Throwable unused) {
            Og og = Og.this;
            Og.a(og, null, Og.c(og));
        }
    }
}

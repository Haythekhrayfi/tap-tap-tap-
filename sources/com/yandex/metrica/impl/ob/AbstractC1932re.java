package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.re, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1932re {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final C2112ye f17241e = new C2112ye("UNDEFINED_", null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f17243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, Object> f17244c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f17245d = false;

    public AbstractC1932re(Context context, String str) {
        this.f17242a = str;
        this.f17243b = a(context);
        new C2112ye(f17241e.b(), str);
    }

    private SharedPreferences a(Context context) {
        return C1694i.a(context, d());
    }

    private void a() {
        SharedPreferences.Editor editorEdit = this.f17243b.edit();
        if (this.f17245d) {
            editorEdit.clear();
            editorEdit.apply();
            return;
        }
        for (Map.Entry<String, Object> entry : this.f17244c.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value == this) {
                editorEdit.remove(key);
            } else if (value instanceof String) {
                editorEdit.putString(key, (String) value);
            } else if (value instanceof Long) {
                editorEdit.putLong(key, ((Long) value).longValue());
            } else if (value instanceof Integer) {
                editorEdit.putInt(key, ((Integer) value).intValue());
            } else if (value instanceof Boolean) {
                editorEdit.putBoolean(key, ((Boolean) value).booleanValue());
            } else if (value != null) {
                throw new UnsupportedOperationException();
            }
        }
        editorEdit.apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends AbstractC1932re> T a(String str) {
        synchronized (this) {
            this.f17244c.put(str, this);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends AbstractC1932re> T a(String str, Object obj) {
        synchronized (this) {
            if (obj != null) {
                this.f17244c.put(str, obj);
            }
        }
        return this;
    }

    public void b() {
        synchronized (this) {
            a();
            this.f17244c.clear();
            this.f17245d = false;
        }
    }

    public String c() {
        return this.f17242a;
    }

    public abstract String d();

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends AbstractC1932re> T e() {
        synchronized (this) {
            this.f17245d = true;
            this.f17244c.clear();
        }
        return this;
    }
}

package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ApplySharedPref"})
public final class c90 implements b90, SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f19422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f19423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f11 f19424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final jc.e f19425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LinkedHashSet f19426e;

    public static final class a extends vc.l implements uc.a<SharedPreferences> {
        public a() {
            super(0);
        }

        @Override // uc.a
        public final SharedPreferences invoke() {
            f11 f11Var = c90.this.f19424c;
            Context applicationContext = c90.this.f19422a.getApplicationContext();
            fd.j0.h(applicationContext, "context.applicationContext");
            return f11.a(f11Var, applicationContext, c90.this.f19423b);
        }
    }

    public /* synthetic */ c90(Context context, String str) {
        this(context, str, new f11());
    }

    public c90(Context context, String str, f11 f11Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(str, "fileName");
        fd.j0.i(f11Var, "preferencesFactory");
        this.f19422a = context;
        this.f19423b = str;
        this.f19424c = f11Var;
        this.f19425d = jc.f.b(new a());
        this.f19426e = new LinkedHashSet();
    }

    private final SharedPreferences a() {
        return (SharedPreferences) this.f19425d.getValue();
    }

    @Override // com.yandex.mobile.ads.impl.b90
    public final long a(String str) {
        fd.j0.i(str, Action.KEY_ATTRIBUTE);
        return a().getLong(str, 0L);
    }

    @Override // com.yandex.mobile.ads.impl.b90
    public final Set a(Set set) {
        return a().getStringSet("BiddingSettingsAdUnitIdsSet", set);
    }

    @Override // com.yandex.mobile.ads.impl.b90
    public final void a(int i10, String str) {
        fd.j0.i(str, Action.KEY_ATTRIBUTE);
        a().edit().putInt(str, i10).commit();
    }

    @Override // com.yandex.mobile.ads.impl.b90
    public final void a(b90.a aVar) {
        fd.j0.i(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        if (this.f19426e.isEmpty()) {
            a().registerOnSharedPreferenceChangeListener(this);
        }
        this.f19426e.add(new WeakReference(aVar));
    }

    @Override // com.yandex.mobile.ads.impl.b90
    public final void a(HashSet hashSet) {
        fd.j0.i(hashSet, "value");
        a().edit().putStringSet("BiddingSettingsAdUnitIdsSet", hashSet).commit();
    }

    @Override // com.yandex.mobile.ads.impl.b90
    public final int b(int i10, String str) {
        fd.j0.i(str, Action.KEY_ATTRIBUTE);
        a().contains(str);
        return a().getInt(str, i10);
    }

    @Override // com.yandex.mobile.ads.impl.b90
    public final String b(String str) {
        fd.j0.i(str, Action.KEY_ATTRIBUTE);
        return a().getString(str, null);
    }

    @Override // com.yandex.mobile.ads.impl.b90
    public final boolean contains(String str) {
        fd.j0.i(str, Action.KEY_ATTRIBUTE);
        return a().contains(str);
    }

    @Override // com.yandex.mobile.ads.impl.b90
    public final boolean getBoolean(String str, boolean z10) {
        fd.j0.i(str, Action.KEY_ATTRIBUTE);
        return a().getBoolean(str, z10);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str != null) {
            Iterator it = this.f19426e.iterator();
            while (it.hasNext()) {
                b90.a aVar = (b90.a) ((WeakReference) it.next()).get();
                if (aVar != null) {
                    aVar.a(this, str);
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.b90
    public final void putBoolean(String str, boolean z10) {
        fd.j0.i(str, Action.KEY_ATTRIBUTE);
        a().edit().putBoolean(str, z10).commit();
    }

    @Override // com.yandex.mobile.ads.impl.b90
    public final void putLong(String str, long j10) {
        fd.j0.i(str, Action.KEY_ATTRIBUTE);
        a().edit().putLong(str, j10).commit();
    }

    @Override // com.yandex.mobile.ads.impl.b90
    public final void putString(String str, String str2) {
        fd.j0.i(str, Action.KEY_ATTRIBUTE);
        a().edit().putString(str, str2).commit();
    }

    @Override // com.yandex.mobile.ads.impl.b90
    public final void remove(String str) {
        fd.j0.i(str, Action.KEY_ATTRIBUTE);
        a().edit().remove(str).commit();
    }
}

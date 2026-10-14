package com.yandex.metrica.uiaccessor;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class FragmentLifecycleCallback extends FragmentManager.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.InterfaceC0188a f18127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference<Activity> f18128b;

    public FragmentLifecycleCallback(a.InterfaceC0188a interfaceC0188a, Activity activity) {
        this.f18127a = interfaceC0188a;
        this.f18128b = new WeakReference<>(activity);
    }

    @Override // androidx.fragment.app.FragmentManager.k
    public void onFragmentAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
        super.onFragmentAttached(fragmentManager, fragment, context);
        Activity activity = this.f18128b.get();
        if (activity != null) {
            this.f18127a.fragmentAttached(activity);
        }
    }
}

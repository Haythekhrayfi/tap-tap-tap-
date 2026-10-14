package com.yandex.metrica.uiaccessor;

import android.app.Activity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.n;

/* JADX INFO: loaded from: classes.dex */
public class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0188a f18129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FragmentManager.k f18130b;

    /* JADX INFO: renamed from: com.yandex.metrica.uiaccessor.a$a, reason: collision with other inner class name */
    public interface InterfaceC0188a {
        void fragmentAttached(Activity activity);
    }

    public a(InterfaceC0188a interfaceC0188a) throws Throwable {
        this.f18129a = interfaceC0188a;
    }

    @Override // com.yandex.metrica.uiaccessor.b
    public void subscribe(Activity activity) throws Throwable {
        if (activity instanceof n) {
            if (this.f18130b == null) {
                this.f18130b = new FragmentLifecycleCallback(this.f18129a, activity);
            }
            FragmentManager supportFragmentManager = ((n) activity).getSupportFragmentManager();
            supportFragmentManager.l0(this.f18130b);
            supportFragmentManager.W(this.f18130b, true);
        }
    }

    @Override // com.yandex.metrica.uiaccessor.b
    public void unsubscribe(Activity activity) throws Throwable {
        if (!(activity instanceof n) || this.f18130b == null) {
            return;
        }
        ((n) activity).getSupportFragmentManager().l0(this.f18130b);
    }
}
